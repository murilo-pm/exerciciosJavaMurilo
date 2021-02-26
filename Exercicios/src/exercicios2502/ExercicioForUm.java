package exercicios2502;

public class ExercicioForUm {
	
	public static void main(String[] args) {
	
		int divisor = 11, i;
		
		for(i=1000; i<2000; i++) {
			if(i%11==5) {
				System.out.println(i);
			}
		}
	}
}
/*Informar todos os números de 1000 a 1999 
* que quando divididos por 11 obtemos resto = 5. (FOR)
*/
