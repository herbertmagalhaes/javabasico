package cursojava.basico;
/*
 * Classe de explicação e demonstraçãos dos operadores
 * 
 * versão:1.0
 * 
 * autor: Herbert Magalhães
 * 
 * data:07/04/23
 */
public class Operadores {

	public static void main(String[] args) {
		int numero1=10,numero2=8;
		
		
		//Operadores aritméticos + - * / %
		/*
		int resultado1 = numero1 + numero2;
				
		System.out.println(resultado1);
		
		int resultado2 = numero1 - numero2;
		
		System.out.println(resultado2);
		
		int resultado3 = numero1 * numero2;
		
		System.out.println(resultado3);
		
		double resultado4 = (double)numero1 / numero2;
		
		System.out.println(resultado4);
		
		int resultado5 = numero1 % numero2;
		
		System.out.println(resultado5);
		
		//numero1 = numero1 + 1;
		System.out.println(numero1++);
		
		System.out.println(++numero1);
		
		System.out.println(numero1+=10);
		
		System.out.println(numero1*=3);
		
		System.out.println(numero1/=4);
		
		System.out.println(numero1);

		System.out.println(numero1!=numero2);
		System.out.println(numero1 > numero2);
		System.out.println(numero1 >= numero2);
		System.out.println(numero1 < numero2);
		System.out.println(numero1 <= numero2);
	*/
		
		//Operadores lógicos && ||
		
		System.out.println("falso E falso:"+(false&true));
		System.out.println("falso E verdadeiro: "+(false&true));
		System.out.println("verdadeiro E falso:"+(true&false));
		System.out.println("verdadeiro E verdadeiro:"+(true&true));
		System.out.println();
		System.out.println("falso OU falso:"+(false||true));
		System.out.println("falso ou verdadeiro: "+(false||true));
		System.out.println("verdadeiro OU falso:"+(true||false));
		System.out.println("verdadeiro OU verdadeiro:"+(true||true));
	
	}
	

}
