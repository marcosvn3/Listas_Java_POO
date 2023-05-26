/**
 * 
 */
package Lista2_Estrutras_Condicionais.exercicio9;

/**
 * @author Marcos vinicius
 *
 */
public class AppTempo {
	public static void main(String[] args) {
		Tempo t1 = new Tempo(7, 44, 54);
		Tempo t2 = new Tempo(7, 45, 28);
		
		if(t1.transformarEmSegundos() > t2.transformarEmSegundos()) {
			int diferençaDeTempo = t1.transformarEmSegundos() - t2.transformarEmSegundos();
			System.out.println(diferençaDeTempo);
		}else {
			int diferençaDeTempo = t2.transformarEmSegundos() - t1.transformarEmSegundos();
			System.out.println(diferençaDeTempo);
		}
		
	}

}
