package org.roderick.proxy.b2.force;

/**
 * ��ʵ����
 */
public class RealSubject implements Subject {
	private Proxy myProxy = null;
	private Proxy invokeProxy = null;
	
	//ָ���Լ��Ĵ���
	@Override
	public Proxy getProxy() {
		this.myProxy = new Proxy(this);
		return this.myProxy;
	}
	
	@Override
	public void request() {
		if(isProxy()) {
			System.out.println("RealSubject request...");
		}else {
			System.out.println("��ʹ����ָ���Ĵ�����ʣ�");
		}
	}
	
	/**
	 * ע����õ�ǰ����Ĵ������
	 */
	public void setInvokeProxy(Proxy invokeProxy) {
		this.invokeProxy = invokeProxy;
	}

	//У���Ƿ���ָ���Ĵ���������
	private boolean isProxy() {
		if(this.myProxy == null || this.invokeProxy == null) {
			return false;
		}else if(this.myProxy.equals(this.invokeProxy)) { //����Լ����ȷ���������Ǹ�����ָ����
			return true;
		}else {
			return false;
		}
	}
	
}
