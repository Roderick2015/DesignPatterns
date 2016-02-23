package org.roderick.proxy.b2.force;

/**
 * 抽象主题
 */
public interface Subject {
	public void request();
	//获取主题自己指定的代理类
	public Proxy getProxy();
	//注入调用主题的代理对象，如通过团队编程规范来约束，可移除该方法
	public void setInvokeProxy(Proxy invokeProxy);
}
