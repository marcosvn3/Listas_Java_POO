package Lista1_Linguagem_Javaa;

import java.util.Scanner;
/**
 * @author Marcos Vinicius
 *
 */
public class MediaDe3 {

	public static void main(String[] args) {
		/*
		 * 4 --> Escreva um programa em Java que leia 3 números inteiros,
		 * calcule e imprima a média deles.
		 */
		Scanner input = new Scanner(System.in);
		double num1,num2,num3,media;
		
		System.out.println("Digite o Primeiro numero: ");
		num1 = input.nextDouble();
		
		System.out.println("Digite o Segundo numero: ");
		num2 = input.nextDouble();
		
		System.out.println("Digite o Terceiro numero: ");
		num3 = input.nextDouble();
		
		media = (num1+num2+num3)/3;
		
		System.out.printf("a media e de %.2f",media);
		input.close();
	}

}
