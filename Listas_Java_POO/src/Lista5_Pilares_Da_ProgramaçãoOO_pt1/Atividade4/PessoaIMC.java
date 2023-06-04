package Lista5_Pilares_Da_ProgramaçãoOO_pt1.Atividade4;

public class PessoaIMC extends Pessoa {
	private double peso;
	private double altura;
	
	
	public PessoaIMC(String nome, String data,double peso, double altura) {
		super(nome, data);
		setPeso(peso);
		setAltura(altura);
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double calcularIMC() {
		return getPeso()/(getAltura()*getAltura());
	}
	
	public void resultIMC() {
		System.out.println(getPeso()/(getAltura()*getAltura()));
	}
	
	@Override
	public String toString() {
		return "Nome: "+getNome()+"\n"
			  +"Data de Nascimento: "+getDataNascimento()+"\n"
			  +"Peso: "+getPeso()+"\n"
			  +"Altura: "+getAltura();
	}
}
