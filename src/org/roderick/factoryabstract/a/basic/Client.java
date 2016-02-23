package org.roderick.factoryabstract.a.basic;

/**
 * 抽象工厂模式——通用源码
 * <p>该模式中，场景类只需知道抽象工厂和抽象产品
 *	即可获得产品对象，而不用关心生产工厂和产品间的业务规则
 *	及约束等。
 *	<p>优点：产品等级易扩展，只需创建一个creator继承AbstractCreator即可（如产品等级3）
 * 	缺点：产品家族扩展困难，增加一个家族，需要从AbstractCreator一直改到具体的creator，
 *  耦合性较高
 *  
 * @author Roderick
 */
public class Client {

	public static void main(String[] args) {
		//定义两个工厂
		AbstractCreator creator1 = new Creator1();
		AbstractCreator creator2 = new Creator2();
		
		AbstractProductA a1 = creator1.createProductA();
		AbstractProductA a2 = creator2.createProductA();
		
		AbstractProductB b1 = creator1.createProductB();
		AbstractProductB b2 = creator1.createProductB();
		
		a1.shareMethod();
		a1.doSomething();
		a2.doSomething();
		
		b1.doSomething();
		b2.doSomething();
		b2.shareMethod();
	}

}
