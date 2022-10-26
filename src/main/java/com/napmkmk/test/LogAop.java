package com.napmkmk.test;

import org.aspectj.lang.ProceedingJoinPoint;


public class LogAop {
	
	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable {
	String	signatyreStr = joinpoint.getSignature().toString();
	
	System.out.println(signatyreStr + "메서드가 시작됨!!");
	System.out.println("**자기소개 하기**");//공통기능
	
	try {
		 Object obj = joinpoint.proceed();
		 return obj;
	}finally {
		System.out.println(signatyreStr + "메서드가 종료 되었음!!!");
	}
	}
}
