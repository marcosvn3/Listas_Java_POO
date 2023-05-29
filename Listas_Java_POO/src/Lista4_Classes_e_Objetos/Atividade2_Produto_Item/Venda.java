package Lista4_Classes_e_Objetos.Atividade2_Produto_Item;

public class Venda {
	
	public static void main(String[] args) {
		Produto prod1 = new Produto("M-1","Cadeira",16,39.90);
		Produto prod2 = new Produto("M-2","Mesa",4,99.90);
		System.out.println("---------------	Quantidad-EM-Estoque--------------------");
		System.out.println(prod1.getQuantidade());
		System.out.println(prod2.getQuantidade());
		System.out.println("--------------------------------------------------------");
		
		
		Item item1 = new Item("M-1",prod1,4);
		Item item2 = new Item("M-2",prod2,2);
		Item item3 = new Item("P-10",new Produto("p-10","Pc-Gamer",4,2000),0);
		
		
		
		System.out.println("---------------	Quantidad-EM-Estoque--------------------");
		System.out.println(prod1.getQuantidade());
		System.out.println(prod2.getQuantidade());
		System.out.println("--------------------------------------------------------");

		
		
		System.out.println("--------------------------------------------------------");
		item1.statusVenda();
		
		System.out.println("--------------------------------------------------------");
		item2.statusVenda();
		
		System.out.println("--------------------------------------------------------");
		item3.statusVenda();
		
	}

}
