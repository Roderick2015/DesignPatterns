package org.roderick.proxy.c.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 通用动态代理类
 */
public class DynamicProxy {
	
	@SuppressWarnings("unchecked")
	public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h) {
		if(true) {
			new BeforeAdvice().exec();
		}
		
		return (T) Proxy.newProxyInstance(loader, interfaces, h);
	}
	
}
