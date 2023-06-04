package Lista5_Pilares_Da_ProgramaçãoOO_pt1.Atividade2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escolha 1 se seu imovel é novo ou 2 para imovel Velho: ");
		int escolha = input.nextInt();
		
		System.out.println("Digite o valor do imovel: ");
		double valor = input.nextDouble();
		
		
		if(escolha == 1) {
			System.out.println("Digite o endereco: ");
			String endereco = input.next();
			
			ImovelNovo m1 = new ImovelNovo(endereco, valor);
			m1.statusImovel();
		}else if(escolha == 2) {
			System.out.println("Digite o endereco: ");
			String endereco = input.next();
			
			ImovelVelho m1 = new ImovelVelho(endereco, valor);
			m1.statusImovel();
		}else {
			System.out.println("Erro!! Escolha entre 1 ou 2!");
		}
		
		input.close();
	}

}
