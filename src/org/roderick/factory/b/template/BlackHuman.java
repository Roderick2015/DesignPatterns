package org.roderick.factory.b.template;

/**
 * ��ɫ����
 */
public class BlackHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("��ɫ���ֵ�Ƥ����ɫ�Ǻ�ɫ�ģ�");
	}

	@Override
	public void talk() {
		System.out.print("���˻�˵����һ������������");
	}

}
