package org.roderick.proxy.b1.template;

/**
 * ����ģʽ������ͨ����ʵ�����룩
 * <p>������ֻ������ɫ��ϣ�����֪����ʵ��ɫ������������ʵ��ɫ����Ե����ߵ�Ӱ��
 * 
 * @author Roderick
 */
public class Client {

	public static void main(String[] args) {
		IGamePlayer proxy = new GamePlayerProxy("����");
		
		proxy.login("zhangsan", "123");
		proxy.killBoss();
		proxy.upgrade();
	}

}
