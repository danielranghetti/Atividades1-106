
public class Funcionario {
	String nomeFuncionario;
	double salario;
	
	double aumentoSalario (double valor) {
		return this.salario += valor;
	}
	
	String consultaDadosFuncionari () {
		return this.salario + " / " + this.nomeFuncionario;
	}

}
