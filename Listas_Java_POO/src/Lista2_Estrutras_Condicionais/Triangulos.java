/**
 * 
 */
package Lista2_Estrutras_Condicionais;

import java.util.Scanner;

/**
 * @author Marcos vinicius
 *
 */
public class Triangulos {

	/**
	 * 8. Dados 3 valores, X, Y e Z, verifique se eles podem ser os comprimentos dos
			lados de um triângulo e, se forem, verifique que tipo de triângulo. Se eles não
			formarem um triângulo, escreva uma mensagem. Considere que:
				a) O comprimento de cada lado de um triângulo é menor que a soma dos
				outros dois lados.
				
				b) Chama-se equilátero o triângulo que tem os 3 lados iguais
				
				c) Denomina-se isósceles, o triângulo que tem o comprimento de dois lados
				iguais
				
				d) Recebe o nome de escaleno o triângulo que tem os 3 lados diferentes
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double lado1, lado2,lado3;
		
		System.out.println("Digite o primeiro lado");
		lado1 = input.nextDouble();
		
		System.out.println("Digite o primeiro lado");
		lado2 = input.nextDouble();
		
		System.out.println("Digite o primeiro lado");
		lado3 = input.nextDouble();
		
				
		if((lado1+lado2)>lado3 && (lado2+lado3)>lado1 && (lado1+lado3)> lado2) {
			if((lado1 == lado2) && (lado1 == lado3)) {
				System.out.println("triangulo equilatero!");
				
			}else if((lado1 == lado2) || (lado1 == lado3) || (lado3 == lado2)) {
				System.out.println("Trinagulo isoceles!");
			}else {
				System.out.println("Trinagulo Escaleno!");
			}
		}else{
			System.out.println("Nao e Triangulo");
		}
		
		input.close();
	}

}
