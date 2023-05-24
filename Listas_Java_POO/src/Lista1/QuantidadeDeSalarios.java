/**
 * 
 */
package Lista1;

import java.util.Scanner;

/**
 * @author Marcos Vinicius
 *
 */
public class QuantidadeDeSalarios {
	public static void main(String[] args) {
		/*
		 * 6 -->Elabore um programa que receba o valor do salário-mínimo
		 *  e o valor do salário de um funcionário. Calcule e mostre a
		 *  quantidade de salários-mínimos que esse funcionário ganha
		 */
		Scanner input = new Scanner(System.in);
		double salario,salarioMinimo,quantidadeSalarios;
		
		System.out.println("Digite o valor de salario minimo:  ");
		salarioMinimo = input.nextDouble();
		
		System.out.println("Digite o salario do funcionario: ");
		salario = input.nextDouble();
		
		quantidadeSalarios = salario/salarioMinimo;
		
		
		System.out.printf("A quantidade de salario é de: %.2f salarios.", quantidadeSalarios);
		
		input.close();

	}

}
