
public class TesteAgencia {

	public static void main(String[] args) {
		Agencia agencia1 = new Agencia();
		Agencia agencia2 = new Agencia();
		
		agencia1.numero = 214563;
		agencia2.numero = 214578;
		
		System.out.println("***** Agencia 1 *******");
		System.out.println("N�mero: " + agencia1.numero);

		System.out.println("***** Agencia 2 *******");
		System.out.println("N�mero: " + agencia2.numero);
	}

}
