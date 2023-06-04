package Lista5_Pilares_Da_ProgramaçãoOO_pt1.Atividade4;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<PessoaIMC> clientes = new ArrayList<>();
		
		Homem h1 = new Homem("Marcos", "15/03/1999", 73, 1.84);
		Mulher m1 = new Mulher("Laura Fiel", "01/10/2001", 47, 1.66);
		Homem h2 = new Homem("Fiel","15/09/1965",97.5,1.85);
		Mulher m2 = new Mulher("Maria jose", "18/11/1965", 74, 1.59);
		Mulher m3 = new Mulher("Layla Fiel", "22/10/1998", 58, 1.62);
		
		clientes.add(h1);
		clientes.add(h2);
		clientes.add(m1);
		clientes.add(m2);
		clientes.add(m3);
		
		
		for(PessoaIMC pessoa : clientes) {
			System.out.println(pessoa);
			pessoa.resultIMC();
			System.out.println("---------------------");
			
		}
	}
}
