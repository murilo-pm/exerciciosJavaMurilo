package exercicios2502;
import java.util.Scanner;

public class ExercicioForDois {
	
	public static void main(String[] args) {		
		
		Scanner leia = new Scanner(System.in);		
		int numero, contadorPar = 0;
		
		for(int i = 0; i < 10; i++){
			System.out.println("Digite um n�mero: ");
			numero = leia.nextInt();
			if(numero%2==0) {
			contadorPar++;
			}
		}System.out.println("Total de n�mero pares: " + contadorPar);
		 System.out.println("Total de n�mero �mpares: " + (10 - contadorPar));
	}		
}
//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares