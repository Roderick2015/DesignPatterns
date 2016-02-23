package org.roderick.factory.b.template;

/**
 * ����ģʽ�������������ʵ�����룩
 * <p>ÿһ����Ʒ���Ӧһ�������࣬ʹ������ְ���������ṹ�򵥣�����չ�Բ���
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
