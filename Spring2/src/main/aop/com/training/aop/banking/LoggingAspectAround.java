package com.training.aop.banking;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspectAround {
	@Around("execution(public * get*())")
	public Object sampleMyAroundAdvice(ProceedingJoinPoint pjp) {
		Object retVAl = null;
		System.out.println("before job goes here");
		try {
			retVAl = pjp.proceed();
		} catch (Throwable t) {
			t.printStackTrace();
		}
		return retVAl;
	}

}
