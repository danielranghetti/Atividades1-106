
public class TesteContaAgencia {

	public static void main(String[] args) {
		Agencia agencia = new Agencia(100);
		Conta conta = new Conta(478512);

		//agencia.numero = 210;
	
		conta.limite = 200;
		conta.saldo = 3254.5;
		conta.agencia = agencia;

		System.out.println("Dados conta e agência: " + "\n" + conta.agencia.numero + "\n" + conta.numero + "\n" + conta.limite
				+ "\n" + conta.saldo + "\n" + conta.saldo);


	}

}
