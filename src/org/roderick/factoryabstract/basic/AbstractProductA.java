package org.roderick.factoryabstract.basic;

/**
 *	����A��Ʒ��
 */
public abstract class AbstractProductA {
	//ÿ����Ʒ���еķ���
	public void shareMethod() {
		System.out.println("ProductA shareMethod...");
	}
	
	//ÿ����Ʒ����ͬ��������ͬʵ��
	public abstract void doSomething();
}
