package com.lw.aop.four;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
/**
 *  �����ʵ���ǻ�����ǿ
 * @author lw
 *
 */
public class GreetingAroundAdvice implements MethodInterceptor {

	public Object invoke(MethodInvocation invocation) throws Throwable {
		before() ;
		Object obj = invocation.proceed() ;
		after() ;
		return obj;
	}
	
	private void before() {
        System.out.println("Before");
    }

    private void after() {
        System.out.println("After");
    }

}
