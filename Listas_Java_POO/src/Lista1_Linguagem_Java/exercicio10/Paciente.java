package Lista1_Linguagem_Java.exercicio10;

public class Paciente {
	private String nome;
	private String sexo;
	private double peso;
	private int idade;
	private double altura;
	
	public Paciente() {}
	
	public Paciente(String nome, String sexo, int idade, double peso, double altura) {
		this.nome= nome;
		this.sexo = sexo;
		this.idade = idade;
		this.peso = peso;
		this.altura= altura;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public String getSexo() {
		return this.sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public double getPeso() {
		return this.peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getAltura() {
		return this.altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
}
