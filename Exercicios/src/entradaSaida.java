import java.util.Scanner;

public class entradaSaida {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int a, b, soma;
		System.out.println("Digite o número A: ");
		a = leia.nextInt();
		System.out.println("Digite o número B: ");
		b = leia.nextInt();
		soma =  a+b;
		System.out.println("O resultado da soma é: " + soma);
	}
}
