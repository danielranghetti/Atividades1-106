
public class TesteCartaoCredito {

	public static void main(String[] args) {
		CartaoCredito cdc1 = new CartaoCredito(89745120);
		CartaoCredito cdc2 = new CartaoCredito(21547856);
		
		cdc1.dataDeValidade = "22/03/2019";
		
		cdc2.dataDeValidade = "21/06/2027";
		
		
		System.out.println("********* Cartao 1 ******");	
		System.out.println("Data Validade: " + cdc1.dataDeValidade + "\n" + "Número: " + cdc1.numero);
		System.out.println("********* Cartao 2 ******");
		System.out.println("Data Validade: " + cdc2.dataDeValidade + "\n" + "Número: " + cdc2.numero);
	}

}
