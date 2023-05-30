package Lista4_Classes_e_Objetos.Atividade3_Funcionario;

public class Funcionario {
	private String nome;
	private String sexo;
	private String depTrabalho;
	private double salario;
	
	public Funcionario() {};
	public Funcionario(String nome, String sexo,String dep,double salario) {
		this.nome = nome;
		this.sexo = sexo;
		this.depTrabalho = dep;
		this.salario = salario;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return this.sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getDepTrabalho() {
		return this.depTrabalho;
	}
	public void setDepTrabalho(String depTrabalho) {
		this.depTrabalho = depTrabalho;
	}
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	void bonificarFuncionario(double aumentoPorCento) {
		this.salario+=(this.salario*(aumentoPorCento/100));
	}
	
	double ganhoAnualFuncionario() {
		return this.salario*13;
	}
	
}
