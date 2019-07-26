
public class TesteTurmaAluno {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		Turma turma = new Turma();

		aluno.nomeAluno = "jean";
		turma.periodo = "Matutino";

		aluno.turma = turma;

		System.out.println("Dados: " + "\n" + aluno.nomeAluno + "\n" + aluno.turma.periodo);


	}

}
