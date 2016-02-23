package org.roderick.proxy.c.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ��̬�����Handler��
 */
public class MyInvocationHandler implements InvocationHandler {
	private Object target = null;

	/**
	 * ������Ҫ����Ķ���
	 */
	public MyInvocationHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		return method.invoke(this.target, args);
	}

}
