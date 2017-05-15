package com.lw.aop.five;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 *  前置增强、后置增强、环绕增强
 * @author lw
 *
 */
public class Client {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Greeting greeting = (Greeting) ac.getBean("proxyBean");
		greeting.sayHello("Hello jack");
	}
}
