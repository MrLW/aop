package com.lw.aop.four;

import org.springframework.aop.framework.ProxyFactory;

public class Client {

	public static void main(String[] args) {
		// 创建代理工厂
		ProxyFactory proxyFactory = new ProxyFactory();
		// 设置目标对象
		proxyFactory.setTarget(new GreetingImpl());
		// 使用环绕增强
		// proxyFactory.addAdvice(new GreetingAroundAdvice());

		// 添加前置增强
		proxyFactory.addAdvice(new GreetingBeforeAdvice());
		// 添加后置增强
		proxyFactory.addAdvice(new GreetingAfterAdvice());
		// 获取代理
		Greeting greeting = (Greeting) proxyFactory.getProxy();
		greeting.sayHello("李文");
	}
}
