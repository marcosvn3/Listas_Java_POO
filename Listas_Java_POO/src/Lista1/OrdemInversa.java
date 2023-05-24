/**
 * 
 */
package Lista1;

import java.util.Scanner;

/**
 * @author Marco
 *
 */
public class OrdemInversa {
	public static void main(String[] args) {
		/* 2-- 
		 *  Faça um programa em Java que leia 3 números inteiros
		 *	e os exiba na ordem inversa.
		 */
		
		Scanner input = new Scanner(System.in);
		int num1, num2,num3;
		
		System.out.print("Digite o primeiro numero: ");
		num1 = input.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		num2 = input.nextInt();
		
		System.out.print("Digite o terceiro numero: ");
		num3 = input.nextInt();
		
		
		System.out.printf("%d %d %d",num3,num2,num1);
	}
}
