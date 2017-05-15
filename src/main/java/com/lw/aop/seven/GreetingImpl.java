package com.lw.aop.seven;

import org.springframework.stereotype.Component;

/**
 */
@Component("greetingImpl7")
public class GreetingImpl implements Greeting {

	
	public void sayHello(String name) {
		System.out.println("Hello:" + name);
	}
	
	private void goodMorning(String name) {
		System.out.println("Good Moring:" + name);
	}
	
	private void goodNight(String name) {
		System.out.println("Good Night:" + name);
	}
}
