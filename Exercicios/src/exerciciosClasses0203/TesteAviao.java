package exerciciosClasses0203;

public class TesteAviao {
	
	public static void main(String[] args) {
		
		Aviao oAviao = new Aviao();
		oAviao.cor = "branco";
		oAviao.modelo = "Cessna 152";
		oAviao.numeroAssentos = 2;
		oAviao.numeroJanelas = 2;
		oAviao.peso = 745;
		oAviao.velocidadeAtual = 0;
		
		oAviao.ligue();
		
		oAviao.acelere(107);
		oAviao.acelere(5);
		
		oAviao.decole(); //somente se velocidadeAtual>200
	}
}
