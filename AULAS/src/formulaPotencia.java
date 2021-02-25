import java.util.Scanner;		
import java.lang.Math;				//S. Paulo, 24 de fevereiro de 2021
									//Murilo Paulino Machado 
public class formulaPotencia {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double a, b, c;
		int quadrado;
		quadrado = 2;
		
		System.out.print("Digite o valor de A: ");
		a = leia.nextInt();
		System.out.print("Digite o valor de B: ");
		b = leia.nextInt();
		System.out.print("Digite o valor de C: ");
		c = leia.nextInt();
		
		System.out.println("D = " + ((Math.pow(a+b, quadrado)+Math.pow(b+c, quadrado))/2));
		
	}
}

