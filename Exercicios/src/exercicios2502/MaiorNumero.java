package exercicios2502;
import java.util.Scanner;

public class MaiorNumero{

	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		int numeroA, numeroB, numeroC;
		
		for(int i = 0; i<=3; i++);
		System.out.print("Insira tr�s n�meros inteiros distintos: ");
		numeroA = leia.nextInt();
		numeroB = leia.nextInt();
		numeroC = leia.nextInt();
		if(numeroA>numeroB && numeroA>numeroC){
			System.out.print("O maior n�mero � " + numeroA);
		}else if(numeroB>numeroA && numeroB>numeroC){
			System.out.print("O maior n�mero � " + numeroB);
		}else {
			System.out.print("O maior n�mero � " + numeroC);
		}
	}
}
//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior
//static int	max(int a, int b)
//Returns the greater of two int values
