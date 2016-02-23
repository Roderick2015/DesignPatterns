package org.roderick.proxy.c.dynamic;

/**
 * 代理模式——动态代理
 * <p>
 * 不与Subject耦合，却可以调用它的方法。
 * 不修改Subject的代码，却可以改变它的运行结果。
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
