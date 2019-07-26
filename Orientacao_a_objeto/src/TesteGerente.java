
public class TesteGerente {

	public static void main(String[] args) {
		Gerente gerente1 = new Gerente();
		Gerente gerente2 = new Gerente();
		
		gerente1.Nome = "Daniel Ranghetti";
		gerente1.salario = 10000.50;
		gerente1.aumentoFixo();
		
		gerente2.Nome = "Daniela";
		gerente2.salario = 11000.50;
		gerente2.aumentotaxa(0.50);
		
		
		System.out.println("******Gerente aumento fixo*******");
		System.out.println("Nome: " + gerente1.Nome + "\n" + "Salário: " + gerente1.salario);
		System.out.println("******Gerente aumento taxa*******");
		System.out.println("Nome: " + gerente2.Nome + "\n" + "Salário: " + gerente2.salario);
		

	}

}
