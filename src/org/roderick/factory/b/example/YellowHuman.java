package org.roderick.factory.b.example;

/**
 * ��ɫ����
 */
public class YellowHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("��ɫ���ֵ�Ƥ����ɫ�ǻ�ɫ�ģ�");
	}

	@Override
	public void talk() {
		System.out.print("��ɫ���ֻ�˵����һ��˵�Ķ���˫�ֽڡ�");
	}

}
