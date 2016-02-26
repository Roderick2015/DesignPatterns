package org.roderick.factory.a.basic;

/**
 * 抽象工厂
 * <p>对入参与反参做了泛型处理
 */
public abstract class Creator {
	public abstract <T extends Product> T createProduct(Class<T> c);
}
