package org.roderick.factoryabstract.basic;

/**
 *	抽象A产品类
 */
public abstract class AbstractProductA {
	//每个产品共有的方法
	public void shareMethod() {
		System.out.println("ProductA shareMethod...");
	}
	
	//每个产品的相同方法，不同实现
	public abstract void doSomething();
}
