package org.digitalinnovationone.gof.singleton;

/**
 * 
 * 	Singleton Apressado
 * 
 * @author Dougl
 *
 */

public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		
			super();
		
	}
	
	public static SingletonEager getInstancia() {
		
		if(instancia == null) {
			
			instancia = new SingletonEager();
			
		}
		
		return instancia;
		
	}

}
