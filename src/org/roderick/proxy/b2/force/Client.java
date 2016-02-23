package org.roderick.proxy.b2.force;

/**
 * ����ģʽ����ǿ�ƴ���
 * <p>����ʹ������ָ���Ĵ�����ܷ���
 * (ֻ��ͨ����ʵ��ɫ���ҵ������ɫ�����ܷ���)
 * @author Roderick
 */
public class Client {

	public static void main(String[] args) {
		Subject subject = new RealSubject(); //��ʵ��ɫ
		
		Proxy proxy1 = subject.getProxy(); //�����ɫ
		proxy1.request(); //ʹ�÷��صĴ���������
		
		Proxy proxy2 = new Proxy(subject);
		proxy2.request(); //ʹ���½��Ĵ������
	}

}
