package org.roderick.factoryabstract.a.basic;

/**
 *	�������Ʒ�ȼ�1�Ĺ���ʵ����
 */
public class Creator1 extends AbstractCreator {

	@Override
	public AbstractProductA createProductA() {
		return new ProductA1();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB1();
	}

}