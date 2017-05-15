package com.lw.aop.six;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		GreetingImpl greeting = (GreetingImpl) ac.getBean("greetingProxy");
		greeting.sayHello("Hello ");
		System.out.println(greeting);
		Apology apology = (Apology) greeting ;
		apology.saySorry("jack");
	}
}
