/**
 * 
 */
package Lista3_Estruturas_De_Repeticao;

/**
 * @author Marco
 *
 */
public class PotenciaDe3 {

	/**
	 * 6 --> Faça um programa em Java que use um laço para exibir
	 *  as potências de 3, de 3^0 até e inclusive 3^9.
	 */
	public static void main(String[] args) {
		
		for(int i = 0; i<=9 ;i++) {
			System.out.println((int)Math.pow(3, i));
		}
	}

}
