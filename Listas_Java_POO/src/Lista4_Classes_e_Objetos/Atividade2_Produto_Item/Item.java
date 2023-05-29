package Lista4_Classes_e_Objetos.Atividade2_Produto_Item;

public class Item {
	private String codigo;
	Produto produto;
	private int quantidade;
	
	public Item(){};
	
	public Item(String cod, Produto produto, int qtd) {
		this.codigo = cod;
		this.produto = produto;
		this.quantidade = qtd;
		
		this.produto.setQuantidade(produto.getQuantidade() - qtd);
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Produto getProduto() {
		return this.produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	void statusVenda() {
		System.out.println("Nome do produto: "+produto.getNome());
		System.out.println("Preco do produto: "+produto.getPreco());
		System.out.println("Quantidade vendida: "+getQuantidade());
		System.out.println("Valor pago na venda: "+getQuantidade() * produto.getPreco());
	}
	
	
}
