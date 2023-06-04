package Lista5_Pilares_Da_ProgramaçãoOO_pt1.Atividade4;

public class Mulher extends PessoaIMC{

	public Mulher(String nome, String data, double peso, double altura) {
		super(nome, data, peso, altura);
		// TODO Auto-generated constructor stub
	}
	
	public void resultIMC() {
		var imc = getPeso()/(getAltura()*getAltura());
		
		if(imc <19) {
			System.out.println("Abaixo do peso ideal.");
		}else if(imc >= 19 && imc <25.8) {
			System.out.println("Peso ideal.");
		}else {
			System.out.println("Acima do peso ideal.");
		}
	}

}
