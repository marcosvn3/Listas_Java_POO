package Lista5_Pilares_Da_ProgramaçãoOO_pt1.Atividade4;

public class Main {
	public static void main(String[] args) {
		Homem h1 = new Homem("Marcos", "15/03/1999", 73, 1.84);
		System.out.println(h1);
		h1.calcularIMC();
		h1.resultIMC();
		
		
		
		System.out.println("_--------------------------------------------_");
		
		Mulher m1 = new Mulher("Laura Fiel", "01/10/2001", 47, 1.66);
		System.out.println(m1);
		m1.calcularIMC();
		m1.resultIMC();
		
		
	}
}
