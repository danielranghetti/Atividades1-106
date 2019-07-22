
public class TesteCliente {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();

		cliente1.nome = "Jean Tironi";
		cliente1.codigo = 1245;

		cliente2.nome = "Rian Santos";
		cliente2.codigo = 1452;

		System.out.println("*********Cliente 1 ***********");
		System.out.println("Nome: " + cliente1.nome + "\n" + "Código: " + cliente1.codigo);
		System.out.println("*********Cliente 2 ***********");
		System.out.println("Nome: " + cliente2.nome + "\n" + "Código: " + cliente2.codigo);

	}

}
