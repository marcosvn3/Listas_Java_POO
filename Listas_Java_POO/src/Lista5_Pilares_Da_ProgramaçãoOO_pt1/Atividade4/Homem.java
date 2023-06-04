package Lista5_Pilares_Da_ProgramaçãoOO_pt1.Atividade4;

public class Homem extends PessoaIMC {

	public Homem(String nome, String data, double peso, double altura) {
		super(nome, data, peso, altura);
	}
	
	public void resultIMC() {
		var imc = getPeso()/(getAltura()*getAltura());
		
		if(imc <20.7) {
			System.out.println("Abaixo do peso ideal.");
		}else if(imc >= 20.7 && imc <26.4) {
			System.out.println("Peso ideal.");
		}else {
			System.out.println("Acima do peso ideal.");
		}
	}
}
