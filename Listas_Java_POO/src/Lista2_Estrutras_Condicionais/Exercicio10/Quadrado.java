package Lista2_Estrutras_Condicionais.Exercicio10;

public class Quadrado {
	private double lado;

	public Quadrado(double lado) {
		this.lado = lado;
	}
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double CalcularArea() {
		 return this.lado*this.lado;
	}
	public double CalcularPerimetro() {
		return this.lado*4;
	}
}
