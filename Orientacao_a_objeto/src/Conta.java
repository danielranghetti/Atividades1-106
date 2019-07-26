
public class Conta {
	int numero;
	double saldo;
	double limite = 100;
	Agencia agencia;
	
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
