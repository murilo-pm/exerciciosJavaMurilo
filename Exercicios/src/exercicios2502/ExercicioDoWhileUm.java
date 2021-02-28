package exercicios2502;
import java.util.Scanner;

public class ExercicioDoWhileUm {

	public static void main(String[] args) {			

		Scanner leia = new Scanner(System.in);
		int numero, contador = 0, soma = 0;
		do{System.out.print("Digite um número: ");
		numero = leia.nextInt();
		contador++;
		soma += numero;	
		System.out.println();
		}while (numero != 0);
		System.out.println("A soma dos números digitados é: " + soma);	
	}
}
//Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
//No final, mostre a soma dos números digitados.(DO...WHILE)
