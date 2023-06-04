package Lista5_Pilares_Da_ProgramaçãoOO_pt1.Atividade2;

public class ImovelVelho extends Imovel {

	public ImovelVelho(String endereco, double preco) {
		super(endereco, preco);
	}
	
	@Override
	void statusImovel() {
		System.out.println(getEndereco());
		System.out.println(getPreco()*0.70);
	}


}
