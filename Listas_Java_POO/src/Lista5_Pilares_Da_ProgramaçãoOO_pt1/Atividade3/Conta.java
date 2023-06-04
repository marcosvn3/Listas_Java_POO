package Lista5_Pilares_Da_ProgramaçãoOO_pt1.Atividade3;

public class Conta {
	private double saldo = 0;
	private double taxa;
	
	

	public Conta(double saldo, double taxa) {
		setSaldo(saldo);
		setTaxa(taxa);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public double verificarSaldo() {
		return getSaldo();
	}
	
	
	public void depositarSaldo(double v) {
		 setSaldo(getSaldo() + v);
	}
	
	public void sacarSaldo(double valor) {
		if(getSaldo() >= 0 && getSaldo() >= valor) {
			this.saldo -= valor;
		}else {
			System.out.println("Valor indisponivel na conta.");
		}
	}
	
	public void atualizarConta() {
		this.saldo = this.saldo*(this.taxa +1);
	}
}
