import javax.sound.midi.Soundbank;

import br.com.util.Teclado;

public class TesteFuncionario2 {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		
		funcionario.nomeFuncionario = (Teclado.lerTexto("Digite o nome do funcionario: "));
		
		
		int num;
		while(1<2) {
			num = Teclado.lerInt("\n" + "Alterar salario do funcionario(1)" + "\n" +"Alterar nome do funcionario(2)"+ "\n" +"Ver status do funcionario(3)"+ "\n" +"Sair(4)");
			
			switch (num) {
			
			case 1:
			funcionario.salario =(Teclado.lerDouble("Digite o novo salario: "));
			break;
			
			case 2:
			funcionario.nomeFuncionario =(Teclado.lerTexto("Digite o nome do funcionario: "));
			break;
		
			case 3:
			System.out.println(funcionario.consultaDadosFuncionari()); 
			
			break;
			
			case 4:
			break;
			
			default:
				System.out.println("Erro");
			
			}
			if(num == 4) {
				break;
			}
		}

	}

}
