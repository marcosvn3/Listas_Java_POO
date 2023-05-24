/**
 * 
 */
package Lista1_Linguagem_Javaa;

import java.util.Scanner;

/**
 * @author Marcos Vinicius
 *
 */
public class GravidadeNaLua {
	public static void main(String[] args) {
		/*3 --> A gravidade da Lua é cerca de 17% do da Terra.
		 *  Faça um programa em Java que calcule seu peso na Lua.
		 */
		Scanner input = new Scanner(System.in);
		double pesoNaLua;
		double gravidadeDaLua = 1.63;
		
		//
		System.out.println("Digite seu peso: ");
		double peso = input.nextDouble();
		
		pesoNaLua = gravidadeDaLua * (peso/9.81);
		
		System.out.printf("Seu peso na superficie da lua é de: %.2fKg" ,pesoNaLua);
	
		input.close();
	}

}
