package Lista6_Pilares_Da_ProgramaçãoOO_pt2.Atividade1;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random r = new Random();
		double valor = r.nextDouble();
		double valor2 = r.nextDouble();
		
		
		
		Quadrado q1 = new Quadrado(valor);
		Circulo c1 = new Circulo(valor2);
		Triangulo t1 = new Triangulo(valor, valor2);
		
		q1.calcularArea();
		c1.calcularArea();
		t1.calcularArea();
		
	}
}
