package org.roderick.factory.c.singleton;

/**
 * ����ģʽ��������ģʽ����չ��
 * 
 * @author Roderick
 */
public class Client {
	
	public static void main(String[] args) {
		Singleton singleton = SingletonFactory.getSingleton();
		singleton.doSomething();
	}
	
}
