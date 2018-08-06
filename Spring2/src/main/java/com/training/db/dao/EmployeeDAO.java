package com.training.db.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.training.db.entity.Employee;
import com.training.db.interfaces.IEmployeeDAO;
import com.training.db.mapper.EmployeeMaper;

public class EmployeeDAO implements IEmployeeDAO {
	private static final String sql_insert = "insert into employee(empId,empName,empSal)" + "values(?,?,?)";
	private static final String sql_getEMployee = "select * from employee where EMPID=?";
	private static final String sql_allGetEMployee = "select * from employee";
	private JdbcTemplate template;

	public EmployeeDAO(JdbcTemplate template) {
		super();
		this.template = template;
	}

	@Override
	public Employee getEmployee(int empId) {
		// Employee emp = template.queryForObject(sql_getEMployee, new Object[] {empId},
		// new BeanPropertyRowMapper<>(Employee.class));
		Employee emp = template.queryForObject(sql_getEMployee, new Object[] { empId }, new EmployeeMaper());
		return emp;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> employees = new ArrayList<Employee>();
		List<Map<String, Object>> rows = template.queryForList(sql_allGetEMployee);
		for (Map emp : rows) {
			Employee e = new Employee();
			e.setEmpId(Integer.parseInt(emp.get("empId").toString()));
			e.setEmpName(emp.get("empName").toString());
			e.setEmpSal(Double.parseDouble(emp.get("empSal").toString()));
			employees.add(e);
		}
		return employees;
	}

	@Override
	public void insertEmployee(Employee employee) {
		template.update(sql_insert, employee.getEmpId(), employee.getEmpName(), employee.getEmpSal());
		System.out.println("Record created" + employee.getEmpId());
	}

	@Override
	public void deleteEmplyee(int empId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateEmployee(int empId, double empNewSalary) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setDataSource(DataSource ds) {
		// TODO Auto-generated method stub

	}

}
