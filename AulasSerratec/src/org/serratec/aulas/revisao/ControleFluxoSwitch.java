package org.serratec.aulas.revisao;

public class ControleFluxoSwitch {
	public static void main(String[] args) {
		// switch TRADICIONAL
		int dia = 6;
		switch (dia) {
		    case 1:  
		    	System.out.println("Segunda"); 
		    	break;
		    case 2:  
		    	System.out.println("Terça");    
		    	break;
		    case 3:  
		    	System.out.println("Quarta");   
		    	break;
		    case 6:
		    case 7:  
		    	System.out.println("Fim de semana"); 
		    	break;
		    default: System.out.println("Dia inválido");
		}
		// Sem break → fall-through: executa os cases seguintes até achar break
		
		// ─── switch EXPRESSION com Arrow (Java 14+)
		String nomeDia = switch (dia) {
		    case 1 -> "Segunda";
		    case 2 -> "Terça";
		    case 3 -> "Quarta";
		    case 4 -> "Quinta";
		    case 5 -> "Sexta";
		    case 6, 7 -> "Fim de semana";   // múltiplos cases na mesma linha
		    default  -> "Inválido";
		};  // ponto e vírgula obrigatório (é uma expressão)
		// Sem break, sem fall-through
		System.out.println("Hoje é " + nomeDia);


		

	}
}
