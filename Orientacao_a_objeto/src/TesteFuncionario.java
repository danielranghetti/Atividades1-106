
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
		
		System.out.println("***** Funcionário 1 *******");
		System.out.println("Nome: " + fun1.getNomeFuncionario() + "\n" + "Salário: " + fun1.getSalario() + "\n" + 
								"Dados: " + fun1.consultaDadosFuncionario() + "\n" + "Vale refeição: " + fun1.getValeRefeicao());
		
		System.out.println("***** Funcionário 2 *******");
		System.out.println("Nome: " + fun2.getNomeFuncionario() + "\n" + "Salário: " + fun2.getSalario());
		

	}

}
