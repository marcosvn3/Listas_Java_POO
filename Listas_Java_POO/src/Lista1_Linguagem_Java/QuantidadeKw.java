/**
 * 
 */
package Lista1_Linguagem_Java;

import java.util.Scanner;

/**
 * @author Marcos Vinicius
 *
 */
public class QuantidadeKw {
	public static void main(String[] args) {
		/*9 --> Sabe-se que o Kw de energia custa um/quinto do salário-mínimo. Faça um
		  programa em Java que receba o valor do salário-mínimo e a quantidade de Kw
		  consumidos, calcule e mostre:
			a) O valor do Kw
			b) O valor a ser pago por essa residência
			c) O valor a ser pago com desconto de 15%
		 */
			
		
		Scanner input = new Scanner(System.in);
		double salarioMinimo,valorKw,valorPorResidencia,valorComDesconto;
		double kwResidencia;
		
		System.out.println("Digite o valor do salario minimo: ");
		salarioMinimo = input.nextDouble();
		
		System.out.println("Digite a quantidade de kW consumidos: ");
		kwResidencia = input.nextDouble();
		
		
		valorKw = salarioMinimo/5;
		valorPorResidencia = valorKw * kwResidencia;
		
		valorComDesconto = valorPorResidencia*(0.85);
		
		System.out.println("Valor do kw é de: "+ valorKw+".");
		System.out.printf("Valor a ser pago pela residencia e de: %.2f \n", valorPorResidencia);
		System.out.printf("Valor com desconto e de: %.2f",valorComDesconto);
		
		input.close();
	}

}
