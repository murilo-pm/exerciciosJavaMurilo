package exercicios2502;
import java.util.Scanner;

public class ExercicioDoWhileDois{

	public static void main(String[] args){

		Scanner leia = new Scanner(System.in);
		double numero, soma = 0, contador = 0, media = 0;

		do{System.out.print("Digite um n�mero: ");
			numero = leia.nextInt();
			if (numero != 0 && numero % 3 == 0) {
				contador++;
				soma += numero;
				media = soma / contador;
			}
		}while (numero != 0);
		System.out.println("A m�dia do n� m�ltiplo de 3 �: " + media);
	}
}
//Escrever um programa que receba v�rios n�meros inteiros no teclado. 
//E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0