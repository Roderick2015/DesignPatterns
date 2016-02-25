package org.roderick.template.a.basic;

/**
 *	具体模板类1
 *	<p>处理各自具体的业务逻辑
 */
public class ConcreteClass1 extends AbstractClass {

	@Override
	protected void doSomething() {
		System.out.println("ConcreteClass1 doSomething...\n");
	}

	@Override
	protected void doAnything() {
		System.out.println("ConcreteClass1 doAnything...");
	}

}
