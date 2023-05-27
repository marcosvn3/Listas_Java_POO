/**
 * 
 */
package Lista3_Estruturas_De_Repeticao;

import java.util.Scanner;

/**
 * @author Marcos Vinicius
 *
 */
public class ValorE {

	/**
	 * 3 --> Faça um programa em Java que leia um valor N, inteiro e positivo, e mostre o
	 *			valor de E conforme a expressão:
 	 *			E = 1 + 1/2 + 1/3 + ... + 1/n/
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double e = 0;
		
		System.out.println("Digite o numero inteiro e positivo");
		
		int num = input.nextInt();
		
		for(int i = 2; i <=num ;i++){
				e += (double) 1/i;
		}
		
		double totalE = 1+e;
		System.out.println(totalE);

		input.close();
	}

}
