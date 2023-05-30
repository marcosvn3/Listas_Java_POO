package Lista4_Classes_e_Objetos.Atividade3_Funcionario;

public class AppFuncionario {

	public static void main(String[] args) {
		Funcionario  fun1 = new Funcionario("Marcos","Masculino","Dev-Junior",3400.50);
		
		fun1.bonificarFuncionario(15);
		
		
		System.out.println(fun1.getSalario());
		System.out.println(fun1.ganhoAnualFuncionario());
	}

}
