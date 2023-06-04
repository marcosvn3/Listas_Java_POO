package Lista5_Pilares_Da_ProgramaçãoOO_pt1.Atividade3;

import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
		DecimalFormat farmat = new DecimalFormat("#,###.00");
		
		ContaCorrente c1 = new ContaCorrente(1000,0.10);
		c1.depositarSaldo(200);
		c1.atualizarConta();
		c1.sacarSaldo(450);
		c1.atualizarConta();
		
		System.out.println(farmat.format(c1.getSaldo()));
		System.out.println("--------------------------------------------");
		
		ContaPoupança c2 = new ContaPoupança(0,0.12 );
		c2.depositarSaldo(150);
		c2.atualizarConta();
		c2.sacarSaldo(200);
		
		System.out.println(farmat.format(c2.getSaldo()));
		
	}
}
