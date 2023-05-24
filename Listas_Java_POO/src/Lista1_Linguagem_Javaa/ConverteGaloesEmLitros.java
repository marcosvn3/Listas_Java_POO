/**
 * 
 */
package Lista1_Linguagem_Javaa;

import java.util.Scanner;

/**
 * @author Marcos vinicius
 *
 */
public class ConverteGaloesEmLitros {

	public static void main(String[] args) {
		/*Atividade-1
		 * 1 --> Faça um programa em Java que converta galões em litros.
		 *	Leve em consideração que 1 galão é equivalente a 3,7854 litros
		 */
		
		Scanner input = new Scanner(System.in);
		double litrosEmGalao = 3.7854;
		double galoes;
		
		System.out.println("Digite a quantidade de galoes: ");
		galoes = input.nextDouble();
		
		double resultado = litrosEmGalao*galoes;
		
		System.out.printf("A quantidade de litros no galao e: %.2f ",resultado);
		
		
		input.close();

	}

}
