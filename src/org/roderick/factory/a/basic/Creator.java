package org.roderick.factory.a.basic;

/**
 * ���󹤳�
 * <p>������뷴�����˷��ʹ���
 */
public abstract class Creator {
	public abstract <T extends Product> T createProduct(Class<T> c);
}
