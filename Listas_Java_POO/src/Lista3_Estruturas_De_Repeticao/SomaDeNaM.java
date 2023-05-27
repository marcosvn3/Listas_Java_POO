package Lista3_Estruturas_De_Repeticao;

import java.util.Scanner;

public class SomaDeNaM {
	/**
	 * @author Marcos Vinicius
	 *
	 */
	public static void main(String[] args) {
		/*
		 * 1 --> Faça um programa em Java que leia dois números, inteiros e positivos, e
				  imprima a soma de todos os números entre eles. Utilize as 3 estruturas de
				  repetição para responder essa questão.
		 */
		
		
		Scanner input = new  Scanner(System.in);
		int num1, num2;
		
		System.out.println("Digite o Primeiro numero: ");
		num1 = input.nextInt();
		
		System.out.println("Digite o Segundo numero: ");
		num2 = input.nextInt();
		
		int somaTotal = 0;
		
		if(num1 > num2) {
			while(num2 <=num1) {
				somaTotal += num2;
				num2++;
			}
		}else if(num1 < num2){
			while(num2 >= num1) {
				somaTotal += num1;
				num1++;
			}
		}
		
		
		System.out.println(somaTotal);
		input.close();
	}

}
