package org.roderick.factoryabstract.a.basic;

/**
 *	抽象B产品类
 */
public abstract class AbstractProductB {
	//每个产品共有的方法
	public void shareMethod() {
		System.out.println("ProductB shareMethod...");
	}
	
	//每个产品的相同方法，不同实现
	public abstract void doSomething();
}
