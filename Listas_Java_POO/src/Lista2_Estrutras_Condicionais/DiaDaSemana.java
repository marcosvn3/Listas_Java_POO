/**
 * 
 */
package Lista2_Estrutras_Condicionais;

import java.util.Scanner;

/**
 * @author Marcos Vinicius
 *
 */
public class DiaDaSemana {

	/**
	 * 6. --> Faça um programa em Java que receba um dia da semana de entrada, 
	 * como número, e escreva esse dia por extenso
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int dia;
		
		System.out.println("Digite o dia da semana: ");
		dia =input.nextInt();
		
		
		switch(dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-Feira");
			break;
		case 3:
			System.out.println("terça-Feira");
			break;
		case 4:
			System.out.println("Quarta-Feira");
			break;
		case 5:
			System.out.println("Quinta-Feira");
			break;
		case 6:
			System.out.println("Sexta-Feira");
			break;
		case 7:
			System.out.println("Sabado");
			break;
		default:
			System.out.println("Dia invalido!");
		}
		
		input.close();
	}

}
