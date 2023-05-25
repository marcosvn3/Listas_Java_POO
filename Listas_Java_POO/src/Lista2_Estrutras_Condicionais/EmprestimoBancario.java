/**
 * 
 */
package Lista2_Estrutras_Condicionais;

import java.util.Scanner;

/**
 * @author Marco
 *
 */
public class EmprestimoBancario {

	/**
	 * 7.--> Faça um programa em Java que resolva a seguinte situação: Um banco
		concede empréstimo a seus clientes no valor máximo de 30% do valor do seu
		salário líquido. Receba o valor do salário bruto, o valor dos descontos e o valor
		do possível empréstimo de um cliente. Em seguida, avise se ele poderá ou não
		fazer o empréstimo. 
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double salarioBruto, valorDesconto,valorEmprestimo;
		double salarioLiquido;
		
		System.out.println("Digite o salario do cliente: ");
		salarioBruto = input.nextDouble();
		
		System.out.println("Digite o valor do desconto: ");
		valorDesconto = input.nextDouble();
		
		System.out.println("Digite o valor do Emprestimo que deseja: ");
		valorEmprestimo = input.nextDouble();
		
		
		
		salarioLiquido = salarioBruto - valorDesconto;
		
		
		
		if(valorEmprestimo<=(salarioLiquido*0.30)) {
			System.out.println("Emprestimo Aprovado!");
		}else {
			System.out.println("Emprestimo Negado, lamento!");
		}
		
		input.close();
		
		
		

	}

}
