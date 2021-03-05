package exerciciosClasses0203;

public class TesteTresAnimais {
	
	public static void main(String[] args) {
		
		AnimalCachorro cachorro = new AnimalCachorro("Oswald", 9);
		AnimalCavalo cavalo = new AnimalCavalo("P� de Pano", 12);
		AnimalPreguica preguica = new AnimalPreguica("Judy", 5);
		
		System.out.println("Nome do cachorro: " + cachorro.getNome());
		System.out.println("Idade do cachorro: " + cachorro.getIdade());
		System.out.println("A��o do cachorro: " + cachorro.correr());
		System.out.println("Som emitido pelo cachorro: " + cachorro.somEmitido("Baw Waw"));
		System.out.println();
		System.out.println("Nome do cavalo: " + cavalo.getNome());
		System.out.println("Idade do cavalo: " + cavalo.getIdade());
		System.out.println("A��o do cavalo: " + cavalo.correr());
		System.out.println("Som emitido pelo cavalo: " + cavalo.somEmitido("RumRumRum"));
		System.out.println();
		System.out.println("Nome do bicho-pregui�a: " + preguica.getNome());
		System.out.println("Idade do bicho-pregui�a: " + preguica.getIdade());
		System.out.println("A��o do bicho-pregui�a: " + preguica.escalar());
		System.out.println("Som emitido pelo bicho-pregui�a: " + preguica.somEmitido("AaAaAaAa"));		
	}
}
