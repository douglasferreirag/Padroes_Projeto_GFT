package org.digitalinnovationone.subsistema2.cep;



public class CepApi {
	
	private static CepApi instancia = new CepApi();
	
	private CepApi() {
		
			super();
		
	}
	
	public static CepApi getInstancia() {
		
		if(instancia == null) {
			
			instancia = new CepApi();
			
		}
		
		return instancia;
		
	}
	
	public String recuperarCidade(String cep) {
		
			return "Araraquara";
		
	}
	
	public String recuperarEstado(String estado) {
		
		return "SP";
	}

	

}
