package org.roderick.factoryabstract.a.basic;

/**
 * ���󹤳�ģʽ����ͨ��Դ��
 * <p>��ģʽ�У�������ֻ��֪�����󹤳��ͳ����Ʒ
 *	���ɻ�ò�Ʒ���󣬶����ù������������Ͳ�Ʒ���ҵ�����
 *	��Լ���ȡ�
 *	<p>�ŵ㣺��Ʒ�ȼ�����չ��ֻ�贴��һ��creator�̳�AbstractCreator���ɣ����Ʒ�ȼ�3��
 * 	ȱ�㣺��Ʒ������չ���ѣ�����һ�����壬��Ҫ��AbstractCreatorһֱ�ĵ������creator��
 *  ����Խϸ�
 *  
 * @author Roderick
 */
public class Client {

	public static void main(String[] args) {
		//������������
		AbstractCreator creator1 = new Creator1();
		AbstractCreator creator2 = new Creator2();
		
		AbstractProductA a1 = creator1.createProductA();
		AbstractProductA a2 = creator2.createProductA();
		
		AbstractProductB b1 = creator1.createProductB();
		AbstractProductB b2 = creator1.createProductB();
		
		a1.shareMethod();
		a1.doSomething();
		a2.doSomething();
		
		b1.doSomething();
		b2.doSomething();
		b2.shareMethod();
	}

}
