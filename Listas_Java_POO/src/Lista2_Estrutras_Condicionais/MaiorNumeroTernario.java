/**
 * 
 */
package Lista2_Estrutras_Condicionais;

import java.util.Scanner;

/**
 * @author Marco
 *
 */
public class MaiorNumeroTernario {

	/**
	 * 3 --> Faça um programa em Java usando a estrutura ternária condicional
	 * 		  que recebe dois números e mostra o maior.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num1, num2, maior;
		
		System.out.println("Digite o primeiro numero: ");
		num1 = input.nextDouble();
		
		System.out.println("Digite o segundo numero: ");
		num2 = input.nextDouble();
		
		
		maior = num1 > num2 ? num1 : num2;
		
		
		System.out.println("O maior numero e: "+ maior+".");
		

	}

}
