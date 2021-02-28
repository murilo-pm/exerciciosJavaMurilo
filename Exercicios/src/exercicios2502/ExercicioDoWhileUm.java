package exercicios2502;

import java.util.Scanner;

public class ExercicioDoWhileUm {

	public static void main(String[] args) {			

		Scanner leia = new Scanner(System.in);
		int numero, i, acumulador = 0;
		
		for (i = 1; i > 0; i++) {
		System.out.print("Digite um número: ");
		numero = leia.nextInt();
		acumulador+=numero;
		System.out.println("O resultado da soma é " + acumulador);
		}
	}
}
//Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
//No final, mostre a soma dos números digitados.(DO...WHILE)
