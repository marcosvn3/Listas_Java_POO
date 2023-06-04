package Lista5_Pilares_Da_ProgramaçãoOO_pt1.Atividade2;

public class ImovelNovo extends Imovel {

	public ImovelNovo(String endereco, double preco) {
		super(endereco, preco);
		
		preco = preco*0.10;
	}

	@Override
	String mostrarEndereco() {
		
		return getEndereco();
	}

	@Override
	double mostrarValor() {
		return getPreco();
	}

}
