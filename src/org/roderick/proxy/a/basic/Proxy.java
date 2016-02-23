package org.roderick.proxy.a.basic;

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
		this.subject.request();
		this.after();
	}
	
	//预处理
	private void before() {
		System.out.println("Proxy before...");
	}
	
	//善后处理
	private void after() {
		System.out.println("Proxy after...");
	}

}
