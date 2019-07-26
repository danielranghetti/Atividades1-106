
public class TesteConta {

	public static void main(String[] args) {
		
		
		System.out.println("Contas criadas: " + Conta.qtdContas );
		Conta conta1 = new Conta(Conta.qtdContas++);
		Conta.ZerarContador();
		Conta conta2 = new Conta(Conta.qtdContas++);
		Conta conta3 = new Conta(Conta.qtdContas++);
		
		
		
		conta1.saldo = 2550.61;
		conta1.limite = 1000.36;
		//conta1.depoisitar(100.5);
		//conta1.sacar(50.5);
		conta1.consultarSaldoDisponivel();
		conta1.imprimiExtrato();
		
		
		
		conta2.saldo = 15478.65;
		conta2.limite = 980.65;
		
		
		Conta.TraferenciaEntreContas(100, conta1, conta2);
		
		System.out.println("***** Conta 1 ******");
		System.out.println("Número: " + conta1.numero + "\n" + "Saldo: " + conta1.saldo + "\n" + "Limite: " + conta1.limite
							+ "\n" + "Extrato: " + conta1.imprimiExtrato() + "\n" + "Saldo Disponivel: " + conta1.consultarSaldoDisponivel());
		System.out.println("***** Conta 2 ******");
		System.out.println("Número: " + conta2.numero + "\n" + "Saldo: " + conta2.saldo + "\n" + "Limite: " + conta2.limite);
		System.out.println("****************");
		System.out.println("***** Conta 3 ******");
		System.out.println("Número: " + conta3.numero);
		
		System.out.println("Contas criadas: " + Conta.qtdContas);
	}

}
