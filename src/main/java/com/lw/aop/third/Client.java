package com.lw.aop.third;

public class Client {

	public static void main(String[] args) {
		Greeting greeting = new JDKDynamicProxy(new GreetingImpl()).getProxy();
		greeting.sayHello("����");
	}
}
