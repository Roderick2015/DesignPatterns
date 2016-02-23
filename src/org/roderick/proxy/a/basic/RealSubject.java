package org.roderick.proxy.a.basic;

/**
 * 真实主题
 */
public class RealSubject implements Subject {

	@Override
	public void request() {
		System.out.println("RealSubject request...");
	}

}
