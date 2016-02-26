package org.roderick.factory.b.example;

/**
 * 黄色人种的创建工厂
 */
public class YellowHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createHuman() {
		return new YellowHuman();
	}

}
