import java.util.Scanner;		
								//S. Paulo, 24 de fevereiro de 2021
public class mediaFinal {		//Murilo Paulino Machado 
	
	public static void main(String[] args) {
		
		double notaUm, notaDois, notaTres;
		double mediaFinal;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		notaUm = leia.nextInt();
		System.out.print("Digite a segunda nota: ");
		notaDois = leia.nextInt();
		System.out.print("Digite a terceira nota: ");
		notaTres = leia.nextInt();
		mediaFinal = (notaUm*2+notaDois*3+notaTres*5)/10;
		System.out.print("A média final é do(a) aluno(a): " + mediaFinal);
		
	}
}

