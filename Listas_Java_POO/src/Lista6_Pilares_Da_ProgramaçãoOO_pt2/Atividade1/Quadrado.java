package Lista6_Pilares_Da_ProgramaçãoOO_pt2.Atividade1;


public class Quadrado extends Figura {
	private double lado;
	
	public Quadrado(double lado) {
		setLado(lado);
	}


	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		this.lado = lado;
	}


	public void calcularArea() {
		System.out.println((getLado()*getLado()));
	}

}
