package exercicios2502;
import java.util.Scanner;
public class ClassificacaoIdade{
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		int idade;
		
		System.out.print("Por favor, digite sua idade: ");
		idade = leia.nextInt();
		
		if(idade>=10 && idade<=14){
			System.out.print("Você está na classificação infantil");
		}else if(idade>=15 && idade<=17){
			System.out.print("Você está na classificação juvenil");
		}else if(idade>=18 && idade<=25){
			System.out.println("Você está na classificação adulto");
		}else {
			System.out.println("O número que você digitou não se encaixa nas classificações.");
		}
//Faça um programa que receba a idade de uma pessoa 
//e mostre na saída em qual categoria ela se encontra:
//10-14 infantil
//15-17 juvenil
//18-25 adulto
	}
}