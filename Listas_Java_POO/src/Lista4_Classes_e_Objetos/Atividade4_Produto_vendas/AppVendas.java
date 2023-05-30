package Lista4_Classes_e_Objetos.Atividade4_Produto_vendas;

public class AppVendas {
	public static void main(String[] args) {
		Produto p1 = new Produto("Notebook",1800,2450);

		System.out.println(p1.calcularMargemLucro());
		System.out.printf("Margem de lucro Percentual: %.2f \n\n",p1.calcularMargemLucroPercentual());
		
		
		Produto p2 = new Produto("Geladeira",1250,1200);
		
		System.out.println(p2.calcularMargemLucro());
		System.out.printf("Margem de lucro Percentual: %.2f",p2.calcularMargemLucroPercentual());
	}
}
