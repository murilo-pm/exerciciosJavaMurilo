package exercicios2502;
import java.util.Scanner;
public class ClassificacaoIdade{
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		int idade;
		
		System.out.print("Por favor, digite sua idade: ");
		idade = leia.nextInt();
		
		if(idade>=10 && idade<=14){
			System.out.print("Voc� est� na classifica��o infantil");
		}else if(idade>=15 && idade<=17){
			System.out.print("Voc� est� na classifica��o juvenil");
		}else if(idade>=18 && idade<=25){
			System.out.println("Voc� est� na classifica��o adulto");
		}else {
			System.out.println("O n�mero que voc� digitou n�o se encaixa nas classifica��es.");
		}
//Fa�a um programa que receba a idade de uma pessoa 
//e mostre na sa�da em qual categoria ela se encontra:
//10-14 infantil
//15-17 juvenil
//18-25 adulto
	}
}