
public class Funcionario {
	private String nomeFuncionario;
	private double salario = 1000;
	private double valeRefeicao;
	String entrada;
	String saida;
	
	
	
	
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getValeRefeicao() {
		return valeRefeicao;
	}

	public void setValeRefeicao(double valeRefeicao) {
		this.valeRefeicao = valeRefeicao;
	}
	public void RegistraEntrada(String entrada) {
		this.entrada = entrada;
	}
	
	public void RegistraSaida(String saida) {
		this.saida = saida;
	}

	double aumentoSalario(double valor) {
		return this.salario += valor;
	}

	String consultaDadosFuncionario() {
		return this.salario + " / " + this.nomeFuncionario;
	}

	public void AjustaTaxaValeRefeicao(double taxa) {
		valeRefeicao += ((valeRefeicao / 100) * taxa);
	}
	public double calculaBonificacao() {
		return this.salario = this.salario * 0.10 + this.salario;
	}
	
}
