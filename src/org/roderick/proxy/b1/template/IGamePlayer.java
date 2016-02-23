package org.roderick.proxy.b1.template;

/**
 * 游戏者接口
 */
public interface IGamePlayer {
	//登录游戏
	public void login(String username, String password);
	//打怪
	public void killBoss();
	//升级
	public void upgrade();
}
