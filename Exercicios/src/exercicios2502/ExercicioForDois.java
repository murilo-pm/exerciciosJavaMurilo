package exercicios2502;
import java.util.Scanner;

public class ExercicioForDois {
	
	public static void main(String[] args) {		
		
		Scanner leia = new Scanner(System.in);		
		int numero, contadorPar = 0;
		
		for(int i = 0; i < 10; i++){
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			if(numero%2==0) {
			contadorPar++;
			}
		}System.out.println("Total de número pares: " + contadorPar);
		 System.out.println("Total de número ímpares: " + (10 - contadorPar));
	}		
}
//Ler 10 números e imprimir quantos são pares e quantos são ímpares