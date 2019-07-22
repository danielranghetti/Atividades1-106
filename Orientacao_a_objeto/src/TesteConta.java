
public class TesteConta {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		
		conta1.numero = 259874;
		conta1.saldo = 2548.61;
		conta1.limite = 1000.36;
		
		conta2.numero = 214563;
		conta2.saldo = 15478.65;
		conta2.limite = 980.65;
		
		System.out.println("***** Conta 1 ******");
		System.out.println("Número: " + conta1.numero + "\n" + "Saldo: " + conta1.saldo + "\n" + "Limite: " + conta1.limite);
		System.out.println("***** Conta 2 ******");
		System.out.println("Número: " + conta2.numero + "\n" + "Saldo: " + conta2.saldo + "\n" + "Limite: " + conta2.limite);
		
	}

}
