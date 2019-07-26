
public class TesteContaAgencia {

	public static void main(String[] args) {
		Agencia agencia = new Agencia();
		Conta conta = new Conta();

		agencia.numero = 210;
		conta.numero = 478512;
		conta.limite = 200;
		conta.saldo = 3254.5;
		conta.agencia = agencia;

		System.out.println("Dados conta e agência: " + "\n" + conta.agencia.numero + "\n" + conta.numero + "\n" + conta.limite
				+ "\n" + conta.saldo + "\n" + conta.saldo);


	}

}
