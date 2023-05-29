package Lista4_Classes_e_Objetos.Atividade2_Produto_Item;

public class Produto {
	private String codigo;
	private String nome;
	private int quantidade;
	private double preco;
	
	public Produto() {};
	
	public Produto(String cod, String nome, int quantidade, double preco) {
		this.codigo = cod;
		this.nome = nome;
		this.quantidade =quantidade;
		this.preco =preco;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return this.preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
}
