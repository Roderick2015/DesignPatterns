package org.roderick.factory.a.basic;

/**
 * ����ģʽ����ͨ��Դ��
 * 
 * @author Roderick
 */
public class Client {
	
	public static void main(String[] args) {
		Creator creator = new ConcreteCreator();
		
		//������ֻ��֪����Ʒ�����������ɻ�ö��������˴�������ľ������
		//�ҷ��ص���Product�����ֻ࣬Ҫ���󲻱䣬�Ե����߾Ͳ������Ӱ��
		Product product1 = creator.createProduct(ConcreteProduct1.class);
		Product product2 = creator.createProduct(ConcreteProduct2.class);
		
		product2.method1();
		
		product1.method2();
		product2.method2();
	}
	
}
