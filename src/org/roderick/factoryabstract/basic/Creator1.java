package org.roderick.factoryabstract.basic;

/**
 *	各家族产品等级1的工厂实现类
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
