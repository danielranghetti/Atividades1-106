
public class Conta {
	int numero;
	double saldo;
	double limite = 100;
	Agencia agencia;

	public static int qtdContas;

	public Conta(int numero) {
		super();
		this.numero = qtdContas;
	}
	
	public static void ZerarContador() {
	
		qtdContas = 0;
	}

	double depoisitar(double valor) {
		return this.saldo += valor;
	}

	double sacar(double valor) {
		return this.saldo -= valor;
	}

	double imprimiExtrato() {
		return this.saldo;
	}

	double consultarSaldoDisponivel() {
		return this.saldo + this.limite;
	}

	static void TraferenciaEntreContas(int Valor, Conta ContaTrasferencia, Conta ContaRecebe) {
		ContaTrasferencia.saldo -= Valor;
		ContaRecebe.saldo += Valor;
	}
}
