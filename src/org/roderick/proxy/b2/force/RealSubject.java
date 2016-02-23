package org.roderick.proxy.b2.force;

/**
 * 真实主题
 */
public class RealSubject implements Subject {
	private Proxy myProxy = null;
	private Proxy invokeProxy = null;
	
	//指定自己的代理
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
			System.out.println("请使用我指定的代理访问！");
		}
	}
	
	/**
	 * 注入调用当前主题的代理对象
	 */
	public void setInvokeProxy(Proxy invokeProxy) {
		this.invokeProxy = invokeProxy;
	}

	//校验是否由指定的代理对象访问
	private boolean isProxy() {
		if(this.myProxy == null || this.invokeProxy == null) {
			return false;
		}else if(this.myProxy.equals(this.invokeProxy)) { //技术约束，确保调用者是该主题指定的
			return true;
		}else {
			return false;
		}
	}
	
}
