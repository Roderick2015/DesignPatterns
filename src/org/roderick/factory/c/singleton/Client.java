package org.roderick.factory.c.singleton;

/**
 * 工厂模式——单例模式（扩展）
 * 
 * @author Roderick
 */
public class Client {
	
	public static void main(String[] args) {
		Singleton singleton = SingletonFactory.getSingleton();
		singleton.doSomething();
	}
	
}
