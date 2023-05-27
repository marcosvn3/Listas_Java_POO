/**
 * 
 */
package Lista3_Estruturas_De_Repeticao;

import java.util.Iterator;

/**
 * @author Marcos Vinicius
 *
 */
public class NumeroPares0a100 {

	/**
	 * 2 --> Faça um programa em java que exiba todos os números pares de 0 a 100.
	 *	      Utilize as 3 estruturas de repetição para responder essa questão.
	 */
	public static void main(String[] args) {
		
		for(int i = 0; i <= 100;i++ ) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
	}

}
