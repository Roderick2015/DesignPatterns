package org.roderick.factory.b.example;

/**
 * ��ɫ����
 */
public class WhiteHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("��ɫ���ֵ�Ƥ����ɫ�ǰ�ɫ�ģ�");
	}

	@Override
	public void talk() {
		System.out.print("��ɫ���ֻ�˵����һ��˵�Ķ��ǵ��ֽڡ�");
	}

}
