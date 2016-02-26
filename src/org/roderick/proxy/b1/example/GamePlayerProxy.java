package org.roderick.proxy.b1.example;

/**
 * ������
 */
public class GamePlayerProxy implements IGamePlayer {
	private IGamePlayer gamePlayer = null;
	
	public GamePlayerProxy(String name) {
		try {
			gamePlayer = new GamePlayer(this, name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void login(String username, String password) {
		this.gamePlayer.login(username, password);
	}

	@Override
	public void killBoss() {
		this.gamePlayer.killBoss();
	}

	@Override
	public void upgrade() {
		this.gamePlayer.upgrade();
	}

}
