package org.roderick.factory.b.template;

/**
 * 工厂模式——多个工厂（实例代码）
 * <p>每一个产品类对应一个创建类，使创建类职责清晰，结构简单，但扩展性不佳
 * 
 * @author Roderick
 */
public class Client {

	public static void main(String[] args) {
		Human whiteHuman = new WhiteHumanFactory().createHuman();
		whiteHuman.getColor();
		whiteHuman.talk();
		
		System.out.println("\n");
		Human blackHuman = new BlackHumanFactory().createHuman();
		blackHuman.getColor();
		blackHuman.talk();
		
		System.out.println("\n");
		Human yellowHuman = new YellowHumanFactory().createHuman();
		yellowHuman.getColor();
		yellowHuman.talk();
	}

}
