package com.lw.aop.seven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 *  ÇÐÃæ
 * @author lw
 */
public class Client {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Greeting greeting = (Greeting) ac.getBean("proxyFactoryBean");
		greeting.sayHello("jack");
	}
}
