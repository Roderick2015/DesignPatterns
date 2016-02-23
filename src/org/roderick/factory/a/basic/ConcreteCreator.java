package org.roderick.factory.a.basic;

/**
 * ���幤��
 */
public class ConcreteCreator extends Creator {

	@SuppressWarnings("unchecked")
	@Override
	public <T extends Product> T createProduct(Class<T> c) {
		Product product = null;
		try {
			//ͨ��������ʵ����
			product = (Product) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return (T) product;
	}

}
