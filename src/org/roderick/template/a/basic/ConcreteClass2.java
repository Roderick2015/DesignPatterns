package org.roderick.template.a.basic;

/**
 *	具体模板类2
 *	<p>处理各自具体的业务逻辑
 */
public class ConcreteClass2 extends AbstractClass {

	@Override
	protected void doSomething() {
		System.out.println("ConcreteClass2 doSomething...");
	}

	@Override
	protected void doAnything() {
		System.out.println("ConcreteClass2 doAnything...");
	}

}
