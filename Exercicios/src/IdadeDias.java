import java.util.Scanner;

public class IdadeDias {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int anos, meses, dias, idadeDias;
		
		System.out.print("Digite seus anos de vida: ");
		anos = leia.nextInt();
		System.out.print("Digite o nº dos seus meses de vida desde seu último aniversário: ");
		meses = leia.nextInt();
		System.out.print("Digite o dia do mês atual: ");
		dias = leia.nextInt();
		
		idadeDias = anos*365+meses*30+dias;
		
		System.out.println("Sua idade em dias é, aproximadamente: " + (idadeDias+1));
	}
}
