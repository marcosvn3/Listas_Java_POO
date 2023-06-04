package Lista5_Pilares_Da_ProgramaçãoOO_pt1.Atividade4;

public class Pessoa {
	private String nome;
	private String dataNascimento;
	
	public Pessoa(String nome, String data) {
		setNome(nome);
		setDataNascimento(data);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	public String toString() {
		return getNome()+"\n"+getDataNascimento(); 
	}
	
}
