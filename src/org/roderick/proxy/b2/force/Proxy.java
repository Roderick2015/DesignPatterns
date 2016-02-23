package org.roderick.proxy.b2.force;

/**
 * ������
 */
public class Proxy implements Subject {
	//��Ҫ�����ʵ����
	private Subject subject = null;
	
	//Ĭ�ϵı�������
	public Proxy() {
		this.subject = new Proxy();
	}
	
	//���캯�����ݴ�����
	public Proxy(Subject subject) {
		this.subject = subject;
	}
	
	@Override
	public void request() {
		this.before();
		this.subject.setInvokeProxy(this);
		this.subject.request();
		this.after();
	}
	
	//Ԥ����
	private void before() {
		System.out.println("Proxy before...");
	}
	
	//�ƺ���
	private void after() {
		System.out.println("Proxy after...\n");
	}

	//���Ĵ�������Լ�������û����
	@Override
	@Deprecated
	public Proxy getProxy() {
		return this;
	}

	@Override
	@Deprecated
	public void setInvokeProxy(Proxy invokeProxy) {
		//ûɶ��ע���
	}

}
