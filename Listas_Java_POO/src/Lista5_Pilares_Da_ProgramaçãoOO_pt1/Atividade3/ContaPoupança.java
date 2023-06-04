package Lista5_Pilares_Da_ProgramaçãoOO_pt1.Atividade3;

public class ContaPoupança extends Conta{
	
	
	
	public ContaPoupança(double saldo, double taxa) {
		super(saldo, taxa);
	}
	public void atualizarConta() {
		setSaldo(getSaldo()*((getTaxa()*3)+1));
	}
	
}
