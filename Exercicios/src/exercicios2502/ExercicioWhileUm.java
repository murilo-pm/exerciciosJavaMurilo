package exercicios2502;
import java.util.Scanner;

public class ExercicioWhileUm {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int idade = 0, contadorUm = 0, contadorDois = 0;
	
		System.out.println("Por favor, digite sua idade: ");
		idade = leia.nextInt();
		while(idade > 0 && idade != -99) {
		if(idade != -99 && idade < 21){
			contadorUm++;
			System.out.println("Por favor, digite sua idade: ");
			idade = leia.nextInt();		
			}else if(idade != -99 && idade > 50){
				contadorDois++;
				System.out.println("Por favor, digite sua idade: ");
				idade = leia.nextInt();	
					}else if(idade == -99){
						System.out.println("Por favor, digita uma idade válida: ");
			}
			System.out.println("Quantidade de pessoas com menos de 21 anos: " + contadorUm);
			System.out.println("Quantidade de pessoas com mais de 50 anos: " + contadorDois);
		}
	}
}
/*
 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
 * 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando a
 * idade for =-99. (WHILE)
 */
