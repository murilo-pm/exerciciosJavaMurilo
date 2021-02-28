package exercicios2502;
import java.util.Scanner;

public class ExercicioDoWhileDois{

	public static void main(String[] args){

		Scanner leia = new Scanner(System.in);
		double numero, soma = 0, contador = 0, media = 0;

		do{System.out.print("Digite um número: ");
			numero = leia.nextInt();
			if (numero != 0 && numero % 3 == 0) {
				contador++;
				soma += numero;
				media = soma / contador;
			}
		}while (numero != 0);
		System.out.println("A média do nº múltiplo de 3 é: " + media);
	}
}
//Escrever um programa que receba vários números inteiros no teclado. 
//E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0