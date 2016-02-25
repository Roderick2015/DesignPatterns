package org.roderick.template.a.basic;

/**
 * 抽象模板方法
 */
public abstract class AbstractClass {
	protected abstract void doSomething();
	protected abstract void doAnything();
	
	//模板方法 公共的逻辑代码
	public void templateMethod() {
		this.doAnything();
		this.doSomething();
	}
}
