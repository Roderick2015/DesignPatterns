package org.roderick.proxy.a.basic;

/**
 * ����ģʽ����ͨ��Դ��
 * 
 * @author Roderick
 */
public class Client {

	public static void main(String[] args) {
		//�����������߶���
		Subject subject = new RealSubject();
		//���ɴ��������
		Proxy proxy = new Proxy(subject);
		
		//�������
		proxy.request();
	}

}
