package org.roderick.factory.b.template;

/**
 * ��ɫ���ֵĴ�������
 */
public class BlackHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createHuman() {
		return new BlackHuman();
	}

}
