package com.lw.aop.five;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 *  ǰ����ǿ��������ǿ��������ǿ
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
