package org.roderick.factory.b.example;

/**
 * ��ɫ���ֵĴ�������
 */
public class YellowHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createHuman() {
		return new YellowHuman();
	}

}
