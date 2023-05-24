package Lista1_Linguagem_Javaa;

import java.util.Scanner;

public class AreaCirculo {
	/**
	 * @author Marcos vinicius
	 */
	public static void main(String[] args) {
		/*
		 * 5 -->Escreva um programa em Java que leia o valor do raio
		 * e imprima a área do círculo...
		 */
		
		Scanner input = new Scanner(System.in);
		double areaCirculo, raio;
		final double PI = 3.1415;
		
		System.out.println("Digite o raio do circulo: ");
		raio = input.nextDouble();
		
		areaCirculo = (raio*raio)*PI;
		
		System.out.printf("Area do circulo e de: %.2f", areaCirculo);
		
		input.close();
	}
}
