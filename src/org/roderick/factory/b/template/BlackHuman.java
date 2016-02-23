package org.roderick.factory.b.template;

/**
 * 黑色人种
 */
public class BlackHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("黑色人种的皮肤颜色是黑色的！");
	}

	@Override
	public void talk() {
		System.out.print("黑人会说话，一般人听不懂。");
	}

}
