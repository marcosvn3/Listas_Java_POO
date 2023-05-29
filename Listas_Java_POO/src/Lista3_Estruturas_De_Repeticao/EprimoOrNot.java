package Lista3_Estruturas_De_Repeticao;

import java.util.Scanner;

public class EprimoOrNot {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num = input.nextInt();
		
		for (int i = 2; i < num; i
				++) {
	        if (num % i == num) {
	            System.out.println("Nao é primo");
	        }
	        
		}
		
		
		
		
		input.close();
	}

}
