
public class TesteAluno {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();

		aluno1.nomeAluno = "Daniel";
		aluno1.rg = 12457851;
		aluno1.datanascimento = "20/03/1997";
		aluno2.nomeAluno = "Helen";
		aluno2.rg = 478569451;
		aluno2.datanascimento = "10/03/1998";
		
		System.out.println("****** Aluno 1 ********");
		System.out.println("Nome: " + aluno1.nomeAluno + "\n" + "RG: " + aluno1.rg + "\n" + "Data nascimento: " + aluno1.datanascimento);
		System.out.println("****** Aluno 2 ********");
		System.out.println("Nome: " + aluno2.nomeAluno + "\n" + "RG: " + aluno2.rg  + "\n" + "Data nascimento: " + aluno2.datanascimento);
		

	}

}
