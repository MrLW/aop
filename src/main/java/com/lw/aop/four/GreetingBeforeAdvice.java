package com.lw.aop.four;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
/**
 *  «∞÷√‘ˆ«ø
 * @author lw
 *
 */
public class GreetingBeforeAdvice implements MethodBeforeAdvice {

	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("before");
	}

}
