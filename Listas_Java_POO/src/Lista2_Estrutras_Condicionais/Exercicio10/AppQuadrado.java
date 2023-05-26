package Lista2_Estrutras_Condicionais.Exercicio10;


public class AppQuadrado {

	public static void main(String[] args) {
	
	Quadrado q1 = new Quadrado(7.2);
	Quadrado q2 = new Quadrado(5.4);
	Quadrado q3 = new Quadrado(9.29);
	
	
	if(q1.CalcularArea() > q2.CalcularArea() && q1.CalcularArea() > q3.CalcularArea()) {
		System.out.println(q1.CalcularArea());
	}else if(q1.CalcularArea() < q2.CalcularArea() && q2.CalcularArea() > q3.CalcularArea()) {
		System.out.println(q2.CalcularArea());
	}else if(q3.CalcularArea() > q1.CalcularArea() && q2.CalcularArea() < q3.CalcularArea()) {
		System.out.println(q3.CalcularArea());
	}
	
	
	if(q1.CalcularPerimetro() < q2.CalcularPerimetro() && q1.CalcularPerimetro() < q3.CalcularPerimetro()) {
		System.out.println(q1.CalcularPerimetro());
	}else if(q1.CalcularPerimetro() > q2.CalcularPerimetro() && q2.CalcularPerimetro() < q3.CalcularPerimetro()) {
		System.out.println(q2.CalcularPerimetro());
	}else if(q3.CalcularPerimetro() < q2.CalcularPerimetro() && q1.CalcularPerimetro() > q3.CalcularPerimetro()) {
		System.out.println(q3.CalcularPerimetro());
	}
		
	
	}

}
