package cursojava.basico;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		//Criação de variáveis
		String nome;
		int idade;
		double altura;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o seu nome.");
		
		nome= leitor.nextLine();
		
		System.out.println("Digite sua idade.");
		idade = leitor.nextInt();
		
		System.out.println("Digite sua altura.");
		altura = leitor.nextDouble();
		
		System.out.println("nome:"+nome);
		System.out.println("idade:"+idade);
		System.out.println("altura:"+altura);
		System.out.println();
		
	System.out.printf("Nome: %s \nidade: %d \naltura %.2f", nome,idade,altura);
	
	}
	

}
