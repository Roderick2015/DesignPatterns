package org.roderick.factory.c.singleton;

/**
 * ������
 * <p>��Ҫ���������������
 */
public class Singleton {
	//ͨ���ѹ��캯��˽�л���ʹ�������޷�ʹ��new���ɶ���
	private Singleton() {
		
	}
	
	public void doSomething() {
		System.out.println("Singleton doSomething...");
	}
	
}
