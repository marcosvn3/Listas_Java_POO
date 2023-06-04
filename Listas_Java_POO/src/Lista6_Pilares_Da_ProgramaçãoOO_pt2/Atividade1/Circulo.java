package Lista6_Pilares_Da_ProgramaçãoOO_pt2.Atividade1;


public class Circulo extends Figura {
	private double raio;
	private final double PI =3.1415;
	
	public Circulo(double raio) {
		setRaio(raio);
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	@Override
	public void calcularArea() {
		System.out.println((getRaio()*PI));
	}
	
	
	
}
