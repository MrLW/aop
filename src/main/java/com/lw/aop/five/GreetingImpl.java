package com.lw.aop.five;

import org.springframework.stereotype.Component;

/**
 * ��һ���汾:before��afterд����sayHello����. 
 */
@Component
public class GreetingImpl implements Greeting {

	private void before() {
		System.out.println("Before");
	}

	private void after() {
		System.out.println("After");
	}

	public void sayHello(String name) {
		System.out.println("Hello! " + name);
	}
}
