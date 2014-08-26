package jyc.offer._2_singleton;
/**
 * 懒汉式：最后返回的时候创建对象。
 * @author Administrator
 *
 */
public class SingletonLazy {
	private static SingletonLazy s = null;
	private SingletonLazy() {}
	public SingletonLazy getInstance() {
		if(null == s){  //null的时候，才加锁。
			synchronized (SingletonLazy.class) {  //锁住，不允许其他线程操作s（会导致产生两个对象）
				if(null == s)  s = new SingletonLazy();	
			}		
		}
		return s;
	}

}
