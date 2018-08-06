package com.training.aop.banking;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	// @Before("execution(public double getBalance())")
	// @Before("execution(public * get*())")
	@Before("execution(* com.training.aop.model.SAccount.getAccount())")
	public void loggingAdviceBefore() {
		System.out.println("*****logging before called**********");
	}

	@Before("allGetters()")
	public void secondAdvice() {
		System.out.println("second aspect invoked");
	}

	@Pointcut("execution(* get*(..))")
	public void allGetters() {
		System.out.println("this data should not display");
	}

}
