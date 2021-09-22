package org.digitalinnovationone.gof;

import org.digitalinnovationone.gof.facade.facade;
import org.digitalinnovationone.gof.singleton.SingletonEager;
import org.digitalinnovationone.gof.singleton.SingletonLazy;
import org.digitalinnovationone.gof.singleton.SingletonLazyHolder;
import org.digitalinnovationone.gof.strategy.Comportamento;
import org.digitalinnovationone.gof.strategy.ComportamentoAgressivo;
import org.digitalinnovationone.gof.strategy.ComportamentoDefensivo;
import org.digitalinnovationone.gof.strategy.ComportamentoNormal;
import org.digitalinnovationone.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		//  Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		
		System.out.println(lazy);
		
		
		System.out.println();
		System.out.println();
		
		
		lazy = SingletonLazy.getInstancia();
		
		System.out.println(lazy);
		
		System.out.println();
		System.out.println();
		
		SingletonEager eager = SingletonEager.getInstancia();
		
		System.out.println(eager);
		
		
		
		eager = SingletonEager.getInstancia();
		
		System.out.println(eager);
		
		
		System.out.println();
		System.out.println();
		
		
		
		SingletonLazyHolder lazyholder = SingletonLazyHolder.getInstancia();
		
		System.out.println(lazyholder);
		
		
		
		lazyholder = SingletonLazyHolder.getInstancia();
		
		System.out.println(lazyholder);
		
		
		System.out.println();
		System.out.println();
		
		
		
		// Strategy
		
		Comportamento normal = new ComportamentoNormal();
		
		Comportamento defensivo = new ComportamentoDefensivo();
		
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		
		robo.setComportamento(normal);
		
		robo.mover();
		robo.mover();
		
		
		robo.setComportamento(defensivo);
		
		robo.mover();
		
		robo.setComportamento(agressivo);
		
		robo.mover();
		robo.mover();
		robo.mover();
		
		System.out.println();
		
		System.out.println();
		
		//Facade
		
		facade Facade = new facade();
		
		Facade.migrarCliente("Venilton", "14801788");
		
		
		

	}

}
