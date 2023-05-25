/**
 * 
 */
package Lista2_Estrutras_Condicionais;

import java.util.Scanner;

/**
 * @author Marco
 *
 */
public class OrdemCrescenteDecrescente {

	/**4 --> Faça um programa em Java que receba 3 números. Em seguida, 
	 * exiba esses números em ordem crescente e decrescente
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num1, num2, num3;
		
		System.out.println("Digite o primeiro numero: ");
		num1 = input.nextDouble();
		System.out.println("Digite o segundo numero: ");
		num2 = input.nextDouble();
		System.out.println("Digite o terceiro numero: ");
		num3 = input.nextDouble();
		
		
		if(num1 > num2 && num1> num3) {
			if(num2 >num3) {
				System.out.printf("%.1f - %.1f - %.1f",num1,num2,num3);
			}else {
				System.out.printf("%.1f - %.1f - %.1f",num1,num3,num2);
			}
		}else if(num2 > num1 && num2 > num3) {
			if(num1 >num3) {
				System.out.printf("%.1f - %.1f - %.1f",num2,num1,num3);
			}else {
				System.out.printf("%.1f - %.1f - %.1f",num2,num3,num1);
			}
		}else if(num3 > num1 && num3> num2) {
			if(num2 >num1) {
				System.out.printf("%.1f - %.1f - %.1f",num3,num2,num1);
			}else {
				System.out.printf("%.1f - %.1f - %.1f",num3,num1,num2);
			}
		}
		
		input.close();
	}

}
