package org.roderick.proxy.b2.force;

/**
 * ��������
 */
public interface Subject {
	public void request();
	//��ȡ�����Լ�ָ���Ĵ�����
	public Proxy getProxy();
	//ע���������Ĵ��������ͨ���Ŷӱ�̹淶��Լ�������Ƴ��÷���
	public void setInvokeProxy(Proxy invokeProxy);
}
