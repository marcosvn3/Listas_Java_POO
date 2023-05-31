package Lista4_Classes_e_Objetos.Atividade5_Conta;

public class Conta {
	private String nome;
	private int numeroConta;
	private double saldo;
	private double limite;
	
	public Conta(){};
	public Conta(String nome, int numConta,double saldo,double limite) {
		this.nome = nome;
		this.numeroConta = numConta;
		this.saldo = saldo;
		
		if(limite > 940) {
			System.out.println("Acima do limite permitido");
			this.limite = limite;
		}else{
			this.limite = limite;
		}
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroConta() {
		return this.numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	double getLimite() {
		return this.limite;
	}
	void setLimite(double limite){
		if(limite > 940) {
			System.out.println("Acima do limite");
		}else{
			this.limite = limite;
		}
	}
	
	
	double depositar(double valor) {
		return this.saldo+=valor;
	}
	
	
	void sacar() {
		if(this.saldo > this.limite){
			if(this.limite <= 940) {
				System.out.println(true);
				this.saldo -= this.limite;
			}else {
				System.out.println(false);
			}
		}else {
			System.out.println(false);
		}
	}
	
	
	void statusConta() {
		System.out.println(getNome());
		System.out.println(getSaldo());
	}
	
}
