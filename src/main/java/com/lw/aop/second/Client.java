package com.lw.aop.second;

/**
 *  第二个版本:静态代理
 *  1、创建代理类,实现和被代理类相同的接口
 *  2、在构造函数中持有被代理类的引用
 *  缺点：XxxProxy类会越来越多,最好只有一个代理类,此时看第三个版本
 * @author lw
 *
 */
public class Client {
	public static void main(String[] args) {
		Greeting greetingProxy = new GreetingProxy(new GreetingImpl());
		greetingProxy.sayHello("Jack");
	}
}
