package com.lw.aop.second;

/**
 *  �ڶ����汾:��̬����
 *  1������������,ʵ�ֺͱ���������ͬ�Ľӿ�
 *  2���ڹ��캯���г��б������������
 *  ȱ�㣺XxxProxy���Խ��Խ��,���ֻ��һ��������,��ʱ���������汾
 * @author lw
 *
 */
public class Client {
	public static void main(String[] args) {
		Greeting greetingProxy = new GreetingProxy(new GreetingImpl());
		greetingProxy.sayHello("Jack");
	}
}
