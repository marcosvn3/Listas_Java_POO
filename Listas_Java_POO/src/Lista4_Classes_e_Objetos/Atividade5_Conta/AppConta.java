package Lista4_Classes_e_Objetos.Atividade5_Conta;

public class AppConta {

	public static void main(String[] args) {
		Conta c1 = new Conta("Marcos Santos",80407,1250,940);
		c1.statusConta();
		System.out.println("-----------------------------------");
		
		c1.depositar(100);
		c1.statusConta();
		System.out.println("-----------------------------------");
		c1.sacar();
		c1.statusConta();
	}

}
