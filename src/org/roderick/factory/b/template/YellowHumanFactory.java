package org.roderick.factory.b.template;

/**
 * ��ɫ���ֵĴ�������
 */
public class YellowHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createHuman() {
		return new YellowHuman();
	}

}
