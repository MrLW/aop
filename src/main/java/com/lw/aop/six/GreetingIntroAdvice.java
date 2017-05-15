package com.lw.aop.six;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;
import org.springframework.stereotype.Component;
/**
 *  引入增强
 *  当某类实现了A接口,但没有实现B接口,那么该类可以调用B接口的方法?
 *  注意：使用引用增强必须使用cglib代理,因为不是使用接口代理的
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
