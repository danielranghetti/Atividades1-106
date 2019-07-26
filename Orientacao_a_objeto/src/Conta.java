
public class Conta {
	int numero;
	double saldo;
	double limite = 100;
	Agencia agencia;

	public Conta(int numero) {
		super();
		this.numero = numero;
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

}
