package com.training.movieTweets;

import static org.apache.spark.sql.functions.avg;
import static org.apache.spark.sql.functions.col;
import static org.apache.spark.sql.functions.max;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.RowFactory;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.types.DataTypes;
import org.apache.spark.sql.types.StructField;
import org.apache.spark.sql.types.StructType;

//{ "name": "Benjamin Garrison", "gender": "male", "deptid": "100", "age": "32", "salary": "3000" }
//{ "name": "Holland Drake", "gender": "male", "deptid": "200", "age": "40", "salary": "4500" }
//{ "name": "Burks Velasquez", "gender": "male", "deptid": "100", "age": "26", "salary": "2700" }
//{ "name": "June Rutledge", "gender": "female", "deptid": "100", "age": "51", "salary": "4300" }
//{ "name": "Nielsen Knapp", "gender": "male", "deptid": "200", "age": "44", "salary": "6500" }

public class SparkSQLDemo {

	public static void main(String[] args) {

		// Logger.getLogger("org").setLevel(Level.ERROR);
		// Logger.getLogger("akka").setLevel(Level.ERROR);
		JavaSparkContext sparkContext = SparkConnection.getContext();
		SparkSession spSession = SparkConnection.getSession();
		Dataset<Row> empDFields = spSession.read().json("./data/customerdata.json");
		empDFields.show();
		empDFields.printSchema();
		System.out.println("Select Demo");
		// empDFields.select("name", "salary");
		empDFields.select(col("name"), col("salary")).show();

		// data queries on selection
		System.out.println("Select Demo  with condition");
		empDFields.filter(col("gender").equalTo("male")).show();

		System.out.println("Aggregate - group by gender");

		empDFields.groupBy("gender").count().show();

		System.out.println("group by dept id");

		Dataset<Row> summaryData = empDFields.groupBy("deptid").agg(avg("salary"), max("age"));
		summaryData.show();

		// -------------try with bean class-----------

		Department dept1 = new Department(100, "Developement");
		Department dept2 = new Department(200, "Testing");

		List<Department> list = Arrays.asList(dept1, dept2);

		Dataset<Row> deptDataFields = spSession.createDataFrame(list, Department.class);
		System.out.println("Department contenet are::");

		deptDataFields.show();

		System.out.println("join employee with dept");

		Dataset<Row> d = empDFields.join(deptDataFields, col("deptid").equalTo(col("deptartmentId")));
		d.show();

		System.out.println("-----join with aggregate ");

		empDFields.filter(col("age").gt(30)).join(deptDataFields, col("deptid").equalTo(col("deptartmentId")))
				.groupBy(col("deptid")).agg(avg(empDFields.col("salary")), max(empDFields.col("age"))).show();

		// --------loading database

		Dataset<Row> loadFile = spSession.read().option("header", true).csv("./data/auto-data.csv");
		loadFile.show(5);

		// ---------creating with row objects-------
		Row row1 = RowFactory.create(1, "India", "Bangaluru");
		Row row2 = RowFactory.create(2, "USA", "Reston");
		Row row3 = RowFactory.create(3, "UK", "steevenscreek");
		List<Row> rlist = Arrays.asList(row1, row2, row3);

		JavaRDD<Row> rowRdd = sparkContext.parallelize(rlist);

		StructType schema = DataTypes
				.createStructType(new StructField[] { DataTypes.createStructField("id", DataTypes.IntegerType, false),
						DataTypes.createStructField("country", DataTypes.StringType, false),
						DataTypes.createStructField("city", DataTypes.StringType, false) });

		Dataset<Row> dsRow = spSession.createDataFrame(rowRdd, schema);

		dsRow.show();
		// working with csv data with sql statement
		// provide the data iskept in table like format

		loadFile.createOrReplaceTempView("autos");
		System.out.println("temp table contents");

		System.out.println("showing all fields with hp greater than 200");
		spSession.sql("select * from autos where hp >200").show();

		// to find make, maxium RPM fro autos grouop by make

		spSession.sql("select make,max(rpm) from autos group by make order by 2").show();

		// convert dataFram to javaRdd

		JavaRDD<Row> autoRdd = loadFile.rdd().toJavaRDD();

		// reading the data from MySql DB

		// db(MySql)

		Map<String, String> jdbcConnectsParams = new HashMap<String, String>();
		jdbcConnectsParams.put("url", "jdbc:mysql://localhost:3306/airline");
		jdbcConnectsParams.put("driver", "com.mysql.jdbc.Driver");
		jdbcConnectsParams.put("dbtable", "customer");
		jdbcConnectsParams.put("user", "root");
		jdbcConnectsParams.put("password", "root@123");

		System.out.println("Customer data    ---------");
		Dataset<Row> sqlDataFields = spSession.read().format("jdbc").options(jdbcConnectsParams).load();
		sqlDataFields.show();

	}

}
