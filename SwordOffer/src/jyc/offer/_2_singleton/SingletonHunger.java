package jyc.offer._2_singleton;
/**
 * 饿汉式：new之后，便创建对象。
 * 此种方式不用考虑线程是否安全。
 * @author Administrator
 *
 */
public class SingletonHunger {
	private static SingletonHunger s = new SingletonHunger();
	private void Singleton(){	}
	public SingletonHunger getInstance() {
		return s;
	}
}
