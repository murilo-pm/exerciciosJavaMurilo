package exerciciosClasses0203;

public class TesteDadosCliente {

	public static void main(String[] args) {
		
		Cliente clienteUm = new Cliente();
		clienteUm.setNome("Pedro");
		clienteUm.setAnoNascimento(1998);
		clienteUm.setCpf("14785236931");
		clienteUm.setEmail("pedro@gmail.com");
		clienteUm.setTelefone("968474073");
		
		System.out.println(clienteUm.getNome());
		System.out.println(clienteUm.getAnoNascimento());
		System.out.println(clienteUm.getCpf());
		System.out.println(clienteUm.getEmail());
		System.out.println(clienteUm.getTelefone());
	}	
	
}
