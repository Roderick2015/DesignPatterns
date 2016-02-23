package org.roderick.proxy.c.dynamic;

/**
 * ����ģʽ������̬����
 * <p>
 * ����Subject��ϣ�ȴ���Ե������ķ�����
 * ���޸�Subject�Ĵ��룬ȴ���Ըı��������н����
 * 
 * @author Roderick
 */
public class Client {

	public static void main(String[] args) {
		Subject subject = new RealSubject();
		Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);
		
		proxy.doSomething("Finish");
	}

}
