package org.roderick.template.a.basic;

/**
 * ģ�巽��ģʽ����ͨ��Դ��
 * 
 * @author Roderick
 */
public class Client {

	public static void main(String[] args) {
		AbstractClass class1 = new ConcreteClass1();
		AbstractClass class2 = new ConcreteClass2();
		
		class1.templateMethod();
		class2.templateMethod();
	}

}
