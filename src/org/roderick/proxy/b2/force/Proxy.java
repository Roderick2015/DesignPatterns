package org.roderick.proxy.b2.force;

/**
 * 代理类
 */
public class Proxy implements Subject {
	//需要代理的实现类
	private Subject subject = null;
	
	//默认的被代理者
	public Proxy() {
		this.subject = new Proxy();
	}
	
	//构造函数传递代理者
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
	
	//预处理
	private void before() {
		System.out.println("Proxy before...");
	}
	
	//善后处理
	private void after() {
		System.out.println("Proxy after...\n");
	}

	//它的代理就是自己（就是没代理）
	@Override
	@Deprecated
	public Proxy getProxy() {
		return this;
	}

	@Override
	@Deprecated
	public void setInvokeProxy(Proxy invokeProxy) {
		//没啥好注入的
	}

}
