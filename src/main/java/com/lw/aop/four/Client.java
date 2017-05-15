package com.lw.aop.four;

import org.springframework.aop.framework.ProxyFactory;

public class Client {

	public static void main(String[] args) {
		// ����������
		ProxyFactory proxyFactory = new ProxyFactory();
		// ����Ŀ�����
		proxyFactory.setTarget(new GreetingImpl());
		// ʹ�û�����ǿ
		// proxyFactory.addAdvice(new GreetingAroundAdvice());

		// ���ǰ����ǿ
		proxyFactory.addAdvice(new GreetingBeforeAdvice());
		// ��Ӻ�����ǿ
		proxyFactory.addAdvice(new GreetingAfterAdvice());
		// ��ȡ����
		Greeting greeting = (Greeting) proxyFactory.getProxy();
		greeting.sayHello("����");
	}
}
