package org.roderick.factory.a.basic;

/**
 * 工厂模式——通用源码
 * 
 * @author Roderick
 */
public class Client {
	
	public static void main(String[] args) {
		Creator creator = new ConcreteCreator();
		
		//调用者只需知道产品的类名，即可获得对象，屏蔽了创建对象的具体过程
		//且返回的是Product抽象类，只要抽象不变，对调用者就不会产生影响
		Product product1 = creator.createProduct(ConcreteProduct1.class);
		Product product2 = creator.createProduct(ConcreteProduct2.class);
		
		product2.method1();
		
		product1.method2();
		product2.method2();
	}
	
}
