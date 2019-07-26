
public class Gerente {
	String Nome;
	double salario;

	double aumentoFixo() {
		return this.salario += this.salario * 0.1;

	}
	double aumentotaxa (double taxa) {
		return this.salario += this.salario * taxa;
	}
}
