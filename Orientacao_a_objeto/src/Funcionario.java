
public class Funcionario {
	String nomeFuncionario;
	double salario = 1000;
	
	double aumentoSalario (double valor) {
		return this.salario += valor;
	}
	
	String consultaDadosFuncionari () {
		return this.salario + " / " + this.nomeFuncionario;
	}

}
