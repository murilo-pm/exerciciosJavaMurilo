package exercicios2502;
import java.util.Scanner;

public class ExercicioDoWhileUm {

	public static void main(String[] args) {			

		Scanner leia = new Scanner(System.in);
		int numero, contador = 0, soma = 0;
		do{System.out.print("Digite um n�mero: ");
		numero = leia.nextInt();
		contador++;
		soma += numero;	
		System.out.println();
		}while (numero != 0);
		System.out.println("A soma dos n�meros digitados �: " + soma);	
	}
}
//Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
//No final, mostre a soma dos n�meros digitados.(DO...WHILE)
