package Lista4_Classes_e_Objetos.Atividade1_livros;

public class Livro {
	private String codigo;
	private String nome;
	private int quantidade;
	
	public Livro() {}
	
	public Livro(String cod, String nome, int qtd) {
		this.codigo = cod;
		this.nome = nome;
		this.quantidade = qtd;
	}
	
	
	public String getCodigo(){
		return this.codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	

	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getQuantidade(){
		return this.quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
	
	
	
	
}
