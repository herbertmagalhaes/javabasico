package cursojava.basico;
/*
 * Classe demonstrativa de variáveis e constante
 * 
 * versão: 1.0
 * 
 * autor: Herber Magalhães
 */
public class VariaveisEConstantes {

	public static void main(String[] args) {
		//Criação de constantes.
		final double ACELERACAO_GRAVIDADE_TERRA = 9.80665;
		
		//Criação de variáveis
		String nome="joao";
		
		int idade=54;
		
		double altura=1.73, peso=80;
		
		char sexo='m',cnh='a';
		boolean doadorOrgaos=true;

		System.out.println("Nome:"+nome);
		
		System.out.println("idade:"+idade);
		
		System.out.println("altura:"+altura);
		
		System.out.println("peso:"+peso);
		
		System.out.println("sexo:"+sexo);
		
		System.out.println("Habilitação:"+cnh);
		
		System.out.println("Doador de orgãos:"+doadorOrgaos);
		
		System.out.println("Gravidade na terra é:"+ACELERACAO_GRAVIDADE_TERRA+"m/s2");
	}

}
