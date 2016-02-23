package org.roderick.factory.b.template;

/**
 * 黑色人种的创建工厂
 */
public class BlackHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createHuman() {
		return new BlackHuman();
	}

}
