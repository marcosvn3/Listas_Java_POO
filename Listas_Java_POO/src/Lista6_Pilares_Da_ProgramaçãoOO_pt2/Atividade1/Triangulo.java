package Lista6_Pilares_Da_ProgramaçãoOO_pt2.Atividade1;


public class Triangulo  extends Figura{
	private  double base;
	private double altura;

	public Triangulo(double base, double altura) {
		setBase(base);
		setAltura(altura);
	}

	
	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	@Override
	public void calcularArea() {
		
		System.out.println((getBase()*getAltura()/2));
	}
	
	
}
