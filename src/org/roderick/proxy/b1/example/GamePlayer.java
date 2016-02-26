package org.roderick.proxy.b1.example;

/**
 * ��Ϸ��
 */
public class GamePlayer implements IGamePlayer {
	private String name = "";
	
	public GamePlayer(IGamePlayer gamePlayer, String name) throws Exception {
		if(gamePlayer == null) {
			throw new Exception("���ܴ�����ʵ��ɫ"); //ֻ����ʵ���˸ýӿڵĶ��󴴽�
		}else {
			this.name = name;
		}
	}
	
	@Override
	public void login(String username, String password) {
		System.out.println("��¼��Ϊ" + username + "���û�" + this.name + "��¼�ɹ���");
	}

	@Override
	public void killBoss() {
		System.out.println(this.name + "�ڴ��!");
	}

	@Override
	public void upgrade() {
		System.out.println(this.name + "������һ��!");
	}

}
