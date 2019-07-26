
public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario fun1 = new Funcionario();
		Funcionario fun2 = new Funcionario();
		
		fun1.setNomeFuncionario("Jean");
		fun1.setSalario(2540.68);
		fun1.aumentoSalario(100.50);
		fun1.consultaDadosFuncionario();
		fun1.setValeRefeicao(100);
		fun1.AjustaTaxaValeRefeicao(10);
		fun1.calculaBonificacao();
		
		fun2.setNomeFuncionario("Daniela");
		fun2.setSalario(6987.25);
		fun2.AjustaTaxaValeRefeicao(10);
		
		System.out.println("***** Funcion�rio 1 *******");
		System.out.println("Nome: " + fun1.getNomeFuncionario() + "\n" + "Sal�rio: " + fun1.getSalario() + "\n" + 
								"Dados: " + fun1.consultaDadosFuncionario() + "\n" + "Vale refei��o: " + fun1.getValeRefeicao());
		
		System.out.println("***** Funcion�rio 2 *******");
		System.out.println("Nome: " + fun2.getNomeFuncionario() + "\n" + "Sal�rio: " + fun2.getSalario());
		

	}

}
