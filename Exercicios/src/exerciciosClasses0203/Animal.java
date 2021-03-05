package exerciciosClasses0203;

public class Animal {
	
	private String nome;	//ATRIBUTOS
	private int idade;
	
	public Animal(String nome, int idade) { 		//CONSTRUTOR
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	//ENCAPSULAMENTO
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String somEmitido(String somAnimal) {
		return somAnimal;
	}
}
/*Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e comportamentos (observe a tabela), utilize os seus conhecimentos 
 * e distribua as características de forma que tudo o que for comum a todos os animais fique na classe Animal:*/ 
