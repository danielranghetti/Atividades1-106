
public class TesteClienteCartao {

	public static void main(String[] args) {
		Cliente cli = new Cliente();
		CartaoCredito cdc = new CartaoCredito(12345674);
		cli.nome = "Daniela";
		
		cdc.dataDeValidade = "21/07/2025";
		cdc.cliente = cli;

		System.out.println("Dados cliente e cartão: " + "\n" + cdc.cliente.nome + 
									"\n" + cdc.numero + "\n" + cdc.dataDeValidade);

	}

}
