package org.roderick.proxy.c.dynamic;

/**
 * ��ʵ����
 */
public class RealSubject implements Subject {

	@Override
	public void doSomething(String str) {
		System.out.print("do something!----->" + str);
	}

}
