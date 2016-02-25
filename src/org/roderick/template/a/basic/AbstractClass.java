package org.roderick.template.a.basic;

/**
 * ����ģ�巽��
 */
public abstract class AbstractClass {
	protected abstract void doSomething();
	protected abstract void doAnything();
	
	//ģ�巽�� �������߼�����
	public void templateMethod() {
		this.doAnything();
		this.doSomething();
	}
}
