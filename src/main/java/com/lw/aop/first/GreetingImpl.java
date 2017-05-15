package com.lw.aop.first;

/**
 * ��һ���汾:before��afterд����sayHello����. 
 */
public class GreetingImpl implements Greeting {

	private void before() {
		System.out.println("Before");
	}

	private void after() {
		System.out.println("After");
	}

	public void sayHello(String name) {
		before();
		System.out.println("Hello! " + name);
		after();

	}
}