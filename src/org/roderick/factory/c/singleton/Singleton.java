package org.roderick.factory.c.singleton;

/**
 * 单例类
 * <p>需要创建单例对象的类
 */
public class Singleton {
	//通过把构造函数私有化，使其它类无法使用new生成对象
	private Singleton() {
		
	}
	
	public void doSomething() {
		System.out.println("Singleton doSomething...");
	}
	
}
