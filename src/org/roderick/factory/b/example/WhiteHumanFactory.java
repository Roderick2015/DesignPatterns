package org.roderick.factory.b.example;

/**
 * 白色人种的创建工厂
 */
public class WhiteHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createHuman() {
		return new WhiteHuman();
	}

}
