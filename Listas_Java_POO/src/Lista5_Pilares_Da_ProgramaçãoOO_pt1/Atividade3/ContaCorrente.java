package Lista5_Pilares_Da_ProgramaçãoOO_pt1.Atividade3;

public class ContaCorrente extends Conta {

	public ContaCorrente(double saldo, double taxa) {
		super(saldo, taxa);
		taxa = taxa*2;
		
	}
	
	public void atualizarConta() {
		setSaldo(getSaldo()*((getTaxa()*2)+1));
	}
	
	public void depositarSaldo(double v) {
		 setSaldo((getSaldo() + v) - 0.10);
	}

}
