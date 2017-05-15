package com.lw.aop.six;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;
import org.springframework.stereotype.Component;
/**
 *  ������ǿ
 *  ��ĳ��ʵ����A�ӿ�,��û��ʵ��B�ӿ�,��ô������Ե���B�ӿڵķ���?
 *  ע�⣺ʹ��������ǿ����ʹ��cglib����,��Ϊ����ʹ�ýӿڴ����
 * @author lw
 *
 */
@Component
public class GreetingIntroAdvice extends DelegatingIntroductionInterceptor implements Apology{

	public void saySorry(String name) {
		System.out.println("Sorry:" + name );
	}
	
	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		return super.invoke(mi);
	}

}
