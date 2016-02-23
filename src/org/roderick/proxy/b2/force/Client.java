package org.roderick.proxy.b2.force;

/**
 * 代理模式——强制代理
 * <p>必须使用主题指定的代理才能访问
 * (只有通过真实角色查找到代理角色，方能访问)
 * @author Roderick
 */
public class Client {

	public static void main(String[] args) {
		Subject subject = new RealSubject(); //真实角色
		
		Proxy proxy1 = subject.getProxy(); //代理角色
		proxy1.request(); //使用返回的代理对象访问
		
		Proxy proxy2 = new Proxy(subject);
		proxy2.request(); //使用新建的代理访问
	}

}
