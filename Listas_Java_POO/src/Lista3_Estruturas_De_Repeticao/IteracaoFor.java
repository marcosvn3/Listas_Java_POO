/**
 * 
 */
package Lista3_Estruturas_De_Repeticao;

/**
 * @author Marcos Vinicius
 *
 */
public class IteracaoFor {

	/**
	 * 5 --> Nem sempre a expressão de iteração de um laço for tem de alterar uma
		variável de controle de laço adicionando ou subtraindo um valor fixo. Em vez
		disso, a variável de controle pode mudar de qualquer maneira arbitrária.
		Usando esse conceito, faça um programa em Java que use um laço for para
		gerar e exibir a progressão 1, 2, 4, 8, 16 e 32. 
	 */
	public static void main(String[] args) {
		int termo = 1;
		int razao = 2;
		
		 for (int i = 0; i < 6; i++) { 
		      System.out.println(termo);
		      termo = termo * razao;
		 }
	}

}
