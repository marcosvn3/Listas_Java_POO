/**
 * 
 */
package Lista2_Estrutras_Condicionais;

import java.util.Scanner;

/**
 * @author Marcos Vinicius
 *
 */
public class MediaAritimetica {
	public static void main(String[] args) {
	/* 1--> Faça um programa em Java que leia 3 notas de um aluno, calcule e mostre a
			média aritmética e a mensagem constante na tabela abaixo:
	*/
		
		
		Scanner input = new Scanner(System.in);
		double nota1,nota2,nota3,media;
		
		System.out.println("Digite a Primeira nota: ");
		nota1 = input.nextDouble();
		
		System.out.println("Digite a Segunda nota: ");
		nota2 = input.nextDouble();
		
		System.out.println("Digite a Terceira nota: ");
		nota3 = input.nextDouble();
		
		media =(nota1+nota2+nota3)/3;
		
		if(media >=0 && media < 3 ) {
			System.out.println("Reprovado!");
		}else if(media >= 3 && media < 7){
			System.out.println("Prova final!");
		}else if(media >= 7 && media <=10) {
			System.out.println("Aprovado!");
		}else {
			System.out.println("Error!");
		}
		
		System.out.printf("A media foi de: %.2f", media);
		
		input.close();
	}

}
