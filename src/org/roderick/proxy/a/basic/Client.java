package org.roderick.proxy.a.basic;

/**
 * 代理模式——通用源码
 * 
 * @author Roderick
 */
public class Client {

	public static void main(String[] args) {
		//创建被代理者对象
		Subject subject = new RealSubject();
		//交由代理类代理
		Proxy proxy = new Proxy(subject);
		
		//代理操作
		proxy.request();
	}

}
