package org.roderick.factoryabstract.a.basic;

/**
 *	各家族产品等级2的工厂实现类
 */
public class Creator2 extends AbstractCreator {

	@Override
	public AbstractProductA createProductA() {
		return new ProductA2();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB2();
	}

}
