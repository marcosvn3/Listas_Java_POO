package Lista4_Classes_e_Objetos.Atividade1_livros;

public class AppLivros {

	public static void main(String[] args) {
		Livro livro1 = new Livro("AAA-01","JAVA-Doc",1);
		Livro livro2 = new Livro("BBB-01","Python-Doc",30);
		Livro livro3 = new Livro("CCC-01","Javascript-Doc",23);
		
		System.out.printf("Quantidade restante do livro %S e de: %d.\n",livro1.getNome(),livro1.getQuantidade());
		System.out.printf("Quantidade restante do livro %S e de: %d.\n",livro2.getNome(),livro2.getQuantidade());
		System.out.printf("Quantidade restante do livro %S e de: %d.\n\n",livro3.getNome(),livro3.getQuantidade());
		
		
		livro1.setQuantidade(9);
		livro2.setQuantidade(17);
		livro3.setQuantidade(44);
		
		
		
		
		
		System.out.printf("Quantidade restante do livro %S atualizada e de: %d.\n",livro1.getNome(),livro1.getQuantidade());
		System.out.printf("Quantidade restante do livro %S atualizada e de: %d.\n",livro2.getNome(),livro2.getQuantidade());
		System.out.printf("Quantidade restante do livro %S atualizada e de: %d.\n",livro3.getNome(),livro3.getQuantidade());
	}

}
