package Lista1_Linguagem_Javaa;

import java.util.Scanner;

public class AumentoSalarial {
	/**
	 * @author Marcos vinicius
	 *
	 */
	public static void main(String[] args) {
		/*7 --> Escreva um programa em Java que leia o valor do salário 
		 * de um funcionário, calcule e mostre: 
		  a) O valor do salário, 
	 	  b) O valor do aumento, considerando que o aumento foi de 25%
		  c) O novo salário
		 */
		
		
		Scanner input = new Scanner(System.in);
		double salario,aumentoSalario,novoSalario;
		
		System.out.println("Digite o valor do salario do funcionario:  ");
		salario  = input.nextDouble();
		
		aumentoSalario = (salario *1.25) - salario;
		
		novoSalario = salario * 1.25;
		
		
		System.out.printf("Valor de salario: %.2fR$ \n", salario);
		System.out.printf("Valor de aumento: %.2fR$ \n", aumentoSalario);
		System.out.printf("Valor de novo Salario: %.2fR$", novoSalario);
		
		input.close();
	}
}
