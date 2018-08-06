package com.training.aop.banking;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspectAfter {
	@After("execution(* get*())")
	public void afterGetter() {
		System.out.println("&&&&&& after advice invoked &&&&&&&&&&&&&");
	}

	@AfterReturning("execution(* com.training.aop.model.SAccount.getAccount())")
	public void afterSuccessFulGetters() {
		System.out.println("all getters returning");
	}

	@AfterReturning(pointcut = "args(val)", returning = "returnString")
	public void afterReturnsStringSetter(String val, String returnString) {
		System.out.println("After Invoked for input  " + val + "  after returning   " + returnString);

	}

	@AfterThrowing("execution(* throw*())")
	public void afterThrowingError() {
		System.out.println("runtime exception");
	}
}
