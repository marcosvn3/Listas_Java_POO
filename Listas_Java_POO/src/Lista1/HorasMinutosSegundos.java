/**
 * 
 */
package Lista1;

import java.util.Scanner;

/**
 * @author Marcos Vinicius
 *
 */
public class HorasMinutosSegundos {
	public static void main(String[] args) {
		/*8 --> Elabore um programa em Java que receba uma hora 
		 * (uma variável para hora e outra para minutos), calcule e mostre
			a) A variável hora digitada convertida em minutos
			b) O total de minutos, ou seja, os minutos digitados mais a conversão anterior
			c) O total de minutos convertidos em segundos
		 */
		Scanner input = new Scanner(System.in);
		int hora,minuto, horaConvertida, minutosTotais, segundos;
		
		
		System.out.println("Digite a hora atual: ");
		hora = input.nextInt();
		
		System.out.println("Digite os minutos atuais: ");
		minuto = input.nextInt();
		
		
		horaConvertida = hora*60;
		minutosTotais = minuto + horaConvertida;
		segundos = minutosTotais*60;
		
		System.out.printf("Horas convertidas em minutos é de: %d minutos \n",horaConvertida);
		System.out.printf("Total de minutos é de: %d minutos \n", minutosTotais);
		System.out.printf("Total de segundos é de: %d segundos.", segundos);
		
		input.close();
	}

}
