package com.training.bpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.training.basics.DefaultHello;
import com.training.employee.Employee;

// if you want spring to know this is post processor
//implements bean post processor , this way every bean when create by spring has to go through this clas
//since this class can handle any class all are given as object
public class EmployeeBeanProcessor implements BeanPostProcessor {

//	private Employee emp;
//	private DefaultHello hello;
//
//	public EmployeeBeanProcessor(Employee emp, DefaultHello hello) {
//		super();
//		this.emp = emp;
//		this.hello = hello;
//	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("************ post process before inittialiazation*********");

		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("************ post process after inittialiazation*********");
		if (bean instanceof Employee) {
			Employee emp = (Employee) bean;
			emp.setEmpName(emp.getEmpName().toUpperCase());
			return emp;
		}
		return bean;
	}

}
