package org.roderick.template.a.basic;

/**
 *	����ģ����1
 *	<p>������Ծ����ҵ���߼�
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
