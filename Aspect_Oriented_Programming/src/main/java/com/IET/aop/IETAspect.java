package com.IET.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class IETAspect {

	@Before("execution(* com.IET.*.*.method*(..))")
	public void beforeAdvice() {
		System.out.println("in before advice");
	}

	@After("execution(* com.IET.*.*.*(..))")
	public void afterAdvice() {
		System.out.println("in after advice");
	}

	@Around("execution(* com.IET.*.*.method*(..))")
	public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("in around advice before call");
		Object ob = joinPoint.proceed();
		System.out.println("in around advice after call");
		return ob;
	}

}
