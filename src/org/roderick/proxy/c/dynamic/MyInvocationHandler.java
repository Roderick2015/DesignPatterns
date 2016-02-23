package org.roderick.proxy.c.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理的Handler类
 */
public class MyInvocationHandler implements InvocationHandler {
	private Object target = null;

	/**
	 * 传入需要代理的对象
	 */
	public MyInvocationHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		return method.invoke(this.target, args);
	}

}
