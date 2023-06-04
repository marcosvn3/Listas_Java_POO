package Lista5_Pilares_Da_ProgramaçãoOO_pt1.Atividade2;

public class ImovelNovo extends Imovel {

	public ImovelNovo(String endereco, double preco) {
		super(endereco, preco);
	}



	@Override
	void statusImovel() {
		System.out.println(getEndereco());
		System.out.println(getPreco()*1.1);
		
	}

}
