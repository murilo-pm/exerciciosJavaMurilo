package exerciciosClasses0203;

public class Aviao {
	
	public String modelo;
	public int numeroAssentos;
	public int numeroJanelas;
	public int peso;
	public String cor;
	public double velocidadeAtual;
	
	void ligue(){
		System.out.println("O avião está ligado");
	}void acelere(double velocidade){
		double velocidadeNova = this.velocidadeAtual+velocidade;
		this.velocidadeAtual = velocidadeNova;	
		System.out.println("A velocidade atual do avião é: " + velocidadeNova + "km");
	}void decole(){
		if(this.velocidadeAtual>200){
			System.out.println("O avião está a decolar");
		}
	}
}
