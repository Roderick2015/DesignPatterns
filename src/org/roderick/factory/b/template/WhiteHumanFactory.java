package org.roderick.factory.b.template;

/**
 * ��ɫ���ֵĴ�������
 */
public class WhiteHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createHuman() {
		return new WhiteHuman();
	}

}
