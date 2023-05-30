package Lista4_Classes_e_Objetos.Atividade4_Produto_vendas;

public class Produto {
	private String nome;
	private double precoCusto;
	private double precoVenda;
	
	public Produto() {};
	public Produto(String nome, double precoCusto, double precoVenda) {
		this.nome = nome;
		this.precoCusto = precoCusto;
		this.precoVenda = precoVenda;
		
		if(precoCusto > precoVenda) {
			System.out.println("Valor de venda abaixo do esperado, reconsidere valor!");
		}
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPrecoCusto() {
		return this.precoCusto;
	}
	
	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}
	
	public double getPrecoVenda() {
		return this.precoVenda;
	}
	
	public void setPrecoVenda(double precoVenda) {
		
		if(getPrecoCusto() > getPrecoVenda()) {
			System.out.println("Preco de Venda muito baixo, reconsidere valor");
		}else {
			this.precoVenda = precoVenda;
		}
		
	}
	
	
	double calcularMargemLucro(){
		var lucro = getPrecoVenda() - getPrecoCusto();
		
		return lucro;
	}
	
	double calcularMargemLucroPercentual(){	
		var lucro = getPrecoVenda() - getPrecoCusto();
		var margemLucro = (float) (lucro / getPrecoVenda())*100;
		return margemLucro;

	}
	
}
