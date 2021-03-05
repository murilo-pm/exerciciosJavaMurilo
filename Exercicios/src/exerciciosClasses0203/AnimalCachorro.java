package exerciciosClasses0203;

public class AnimalCachorro extends Animal{
	
	public String correr;
	
	public AnimalCachorro(String nome, int idade) {
		super(nome, idade);
		
	}
	public String getCorrer() {
		return correr;
	}
	public void setCorrer(String correr) {
		this.correr = correr;
	}

	public String correr() {
		return "Vrum Vrum";
	}
	@Override
	public String somEmitido(String somAnimal) {
		return somAnimal;
	}
}
