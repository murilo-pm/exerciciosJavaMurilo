package exercicios2502;

import java.util.Scanner;

public class ExercicioDoWhileUm {

	public static void main(String[] args) {			

		Scanner leia = new Scanner(System.in);
		int numero, i, acumulador = 0;
		
		for (i = 1; i > 0; i++) {
		System.out.print("Digite um n�mero: ");
		numero = leia.nextInt();
		acumulador+=numero;
		System.out.println("O resultado da soma � " + acumulador);
		}
	}
}
//Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
//No final, mostre a soma dos n�meros digitados.(DO...WHILE)
