package org.roderick.proxy.c.dynamic;

import java.lang.reflect.InvocationHandler;

/**
 * 有具体业务的代理扩展类，通过该类实现各自特有的业务代码。
 * <p>可以有多个业务代理类用于切换，如不需要可直接使用通用代理类
 */
public class SubjectDynamicProxy extends DynamicProxy {
	
	public static <T> T newProxyInstance(Subject subject) {
		ClassLoader loader = subject.getClass().getClassLoader();
		Class<?>[] classes = subject.getClass().getInterfaces();
		InvocationHandler handler = new MyInvocationHandler(subject);
		
		return newProxyInstance(loader, classes, handler);
	}
	
}
