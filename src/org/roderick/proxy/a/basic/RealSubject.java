package org.roderick.proxy.a.basic;

/**
 * ��ʵ����
 */
public class RealSubject implements Subject {

	@Override
	public void request() {
		System.out.println("RealSubject request...");
	}

}
