package exercicios2502;
import java.util.Scanner;

public class MaiorNumero{

	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		int numeroA, numeroB, numeroC;
		
		for(int i = 0; i<=3; i++);
		System.out.print("Insira três números inteiros distintos: ");
		numeroA = leia.nextInt();
		numeroB = leia.nextInt();
		numeroC = leia.nextInt();
		if(numeroA>numeroB && numeroA>numeroC){
			System.out.print("O maior número é " + numeroA);
		}else if(numeroB>numeroA && numeroB>numeroC){
			System.out.print("O maior número é " + numeroB);
		}else {
			System.out.print("O maior número é " + numeroC);
		}
	}
}
//Faça um programa que receba três inteiros e diga qual deles é o maior
//static int	max(int a, int b)
//Returns the greater of two int values
