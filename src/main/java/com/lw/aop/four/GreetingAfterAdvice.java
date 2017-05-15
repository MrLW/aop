package com.lw.aop.four;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/**
 *  ∫Û÷√‘ˆ«ø
 * @author lw
 *
 */
public class GreetingAfterAdvice implements AfterReturningAdvice {

	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		System.out.println("After");
	}

}
