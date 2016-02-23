package org.roderick.proxy.c.dynamic;

/**
 * 真实主题
 */
public class RealSubject implements Subject {

	@Override
	public void doSomething(String str) {
		System.out.print("do something!----->" + str);
	}

}
