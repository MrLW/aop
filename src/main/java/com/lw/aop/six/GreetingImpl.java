package com.lw.aop.six;

import org.springframework.stereotype.Component;

/**
 */
@Component("greetingImpl6")
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
