/**
 * 
 */
package Lista2_Estrutras_Condicionais;

import java.util.Scanner;

/**
 * @author Marcos Vinicius
 *
 */
public class CategoriaNadador {
	/*
	 * 2 --> Faça um programa em Java que recebe a idade de um nadador e mostre sua
		categoria, usando as regras a seguir:
			0 a 10 Infantil
			11 a 15 Jovem
			16 a 30 Adolescente
			31 a 45 Adulto
			Acima de 45 Sênio
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int idade;
		
		System.out.println("Digite a idade do Nadador: ");
		idade = input.nextInt();
		
		if(idade >= 0 && idade <= 10) {
			System.out.println("Infantil");
		}else if(idade > 10 && idade <=15) {
			System.out.println("Jovem");
		}else if(idade >15 && idade <= 30) {
			System.out.println("Adolescente");
		}else if( idade > 30 && idade <= 45) {
			System.out.println("Adulto");
		}else if(idade >45 && idade<=120) {
			System.out.println("Senior");
		}else if(idade < 0 || idade > 120){
			System.out.println("Idade invalida");
		}
		
		input.close();
	}

}
