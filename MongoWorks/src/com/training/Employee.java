package com.training;

import java.io.Serializable;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObjectCodec;

public class Employee extends BasicDBObject {
	private int empId;
	private String empName;
	private double empSal;
	private String empMail;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, double empSal, String empMail) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empMail = empMail;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.put("empid", empId);
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.put("empname", empName);
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.put("empsal", empSal);

		this.empSal = empSal;
	}

	public String getEmpMail() {
		return empMail;
	}

	public void setEmpMail(String empMail) {
		this.put("empmail", empMail);
		this.empMail = empMail;

	}

}
