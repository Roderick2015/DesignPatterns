package org.roderick.factory.b.example;

/**
 * ��ɫ���ֵĴ�������
 */
public class BlackHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createHuman() {
		return new BlackHuman();
	}

}
