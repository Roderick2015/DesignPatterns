package org.roderick.factory.c.singleton;

import java.lang.reflect.Constructor;

/**
 * �������ɵ����Ĺ�����
 */
public class SingletonFactory {
	private static Singleton singleton;
	static {
		try {
			Class<?> cl = Class.forName(Singleton.class.getName());
			//����޲ι���
			Constructor<?> constructor = cl.getDeclaredConstructor();
			//�����޲ι���Ϊ�ɷ���
			constructor.setAccessible(true);
			//����һ��ʵ������
			singleton = (Singleton) constructor.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Singleton getSingleton() {
		return singleton;
	}
	
}
