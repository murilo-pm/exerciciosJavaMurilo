package exerciciosClasses0203;

public class AnimalCavalo extends Animal {
	
	public String correr;
	
	public AnimalCavalo(String nome, int idade) {
		super(nome, idade);
	}
	
	public String getCorrer() {
		return correr;
	}
	public void setCorrer(String correr) {
		this.correr = correr;
	}	
	public String correr() {
		return "pocot�, pocot�";
	}	
	@Override
	public String somEmitido(String somAnimal) {
		return somAnimal;
	}

}
