package com.lw.aop.four;

/**
 * 第一个版本:before和after写死在sayHello里了. 
 */
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
