package org.roderick.proxy.c.dynamic;

import java.lang.reflect.InvocationHandler;

/**
 * �о���ҵ��Ĵ�����չ�࣬ͨ������ʵ�ָ������е�ҵ����롣
 * <p>�����ж��ҵ������������л����粻��Ҫ��ֱ��ʹ��ͨ�ô�����
 */
public class SubjectDynamicProxy extends DynamicProxy {
	
	public static <T> T newProxyInstance(Subject subject) {
		ClassLoader loader = subject.getClass().getClassLoader();
		Class<?>[] classes = subject.getClass().getInterfaces();
		InvocationHandler handler = new MyInvocationHandler(subject);
		
		return newProxyInstance(loader, classes, handler);
	}
	
}
