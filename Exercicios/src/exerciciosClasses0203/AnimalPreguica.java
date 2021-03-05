package exerciciosClasses0203;

public class AnimalPreguica extends Animal {
	
	public String escalar;

	
	public AnimalPreguica(String nome, int idade) {
		super(nome, idade);
	}
	public String getEscalar() {
		return escalar;
	}
	public void setEscalar(String escalar) {
		this.escalar = escalar;
	}
	public String escalar() {
		return 	  ".°.°.°.°";
	}
	@Override
	public String somEmitido(String somAnimal) {
		return somAnimal;
	}
}
