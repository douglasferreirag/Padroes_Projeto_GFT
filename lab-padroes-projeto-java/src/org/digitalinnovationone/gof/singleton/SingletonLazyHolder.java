package org.digitalinnovationone.gof.singleton;

/**
 * 
 * 	Singleton Lazy Holder
 * 
 * @author Dougl
 *
 */

public class SingletonLazyHolder {
	
	private static class InstanceHolder{
		
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
		
		
	}
	
	
	private SingletonLazyHolder() {
		
			super();
		
	}
	
	public static SingletonLazyHolder getInstancia() {
		
		if(InstanceHolder.instancia == null) {
			
			InstanceHolder.instancia = new SingletonLazyHolder();
			
		}
		
		return InstanceHolder.instancia;
		
	}

}
