package org.roderick.factory.a.basic;

/**
 * 抽象产品
 */
public abstract class Product {
	//产品类的公共方法
	public void method1() {
		System.out.println("Product common method1...");
	}
	
	public abstract void method2();
}
