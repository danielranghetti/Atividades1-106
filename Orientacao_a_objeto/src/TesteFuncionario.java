
public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario fun1 = new Funcionario();
		Funcionario fun2 = new Funcionario();
		
		fun1.nomeFuncionario = "Jean";
		fun1.salario = 2540.68;
		fun1.aumentoSalario(100.50);
		fun1.consultaDadosFuncionari();
		
		fun2.nomeFuncionario = "Daniela";
		fun2.salario = 6987.25;
		
		System.out.println("***** Funcionário 1 *******");
		System.out.println("Nome: " + fun1.nomeFuncionario + "\n" + "Salário: " + fun1.salario + "\n" + "Dados: " + fun1.consultaDadosFuncionari());
		
		System.out.println("***** Funcionário 2 *******");
		System.out.println("Nome: " + fun2.nomeFuncionario + "\n" + "Salário: " + fun2.salario);
		

	}

}
