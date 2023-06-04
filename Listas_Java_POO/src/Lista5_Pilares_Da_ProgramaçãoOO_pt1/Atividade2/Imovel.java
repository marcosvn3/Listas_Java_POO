package Lista5_Pilares_Da_ProgramaçãoOO_pt1.Atividade2;

public abstract class Imovel {
	private String endereco;
	private double preco;
	
	
	
	public Imovel(String endereco, double preco) {
		setEndereco(endereco);
		setPreco(preco);
		
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	abstract String mostrarEndereco();
	abstract double mostrarValor();
}


