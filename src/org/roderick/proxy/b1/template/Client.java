package org.roderick.proxy.b1.template;

/**
 * 代理模式——普通代理（实例代码）
 * <p>调用者只与代理角色耦合（无需知道真实角色），屏蔽了真实角色变更对调用者的影响
 * 
 * @author Roderick
 */
public class Client {

	public static void main(String[] args) {
		IGamePlayer proxy = new GamePlayerProxy("张三");
		
		proxy.login("zhangsan", "123");
		proxy.killBoss();
		proxy.upgrade();
	}

}
