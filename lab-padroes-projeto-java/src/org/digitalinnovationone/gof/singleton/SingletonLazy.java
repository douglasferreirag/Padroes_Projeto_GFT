package org.digitalinnovationone.gof.singleton;

/**
 * 
 * 	Singleton Pregui�oso
 * 
 * @author Dougl
 *
 */

public class SingletonLazy {
	
	private static SingletonLazy instancia ;
	
	private SingletonLazy() {
		
			super();
		
	}
	
	public static SingletonLazy getInstancia() {
		
		if(instancia == null) {
			
			instancia = new SingletonLazy();
			
		}
		
		return instancia;
		
	}

}
