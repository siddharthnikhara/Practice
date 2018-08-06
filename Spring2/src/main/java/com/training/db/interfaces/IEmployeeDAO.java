package com.training.db.interfaces;

import java.util.List;

import javax.sql.DataSource;

import com.training.db.entity.Employee;

public interface IEmployeeDAO {

	public Employee getEmployee(int empId);

	public List<Employee> getAllEmployee();

	public void insertEmployee(Employee employee);

	public void deleteEmplyee(int empId);

	public void updateEmployee(int empId, double empNewSalary);

	public void setDataSource(DataSource ds);
}
