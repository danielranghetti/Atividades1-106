
public class TesteTurma {

	public static void main(String[] args) {
		Turma turma1 = new Turma();
		Turma turma2 = new Turma();
		
		turma1.periodo = "Nortuno";
		turma1.serie = "2º";
		turma1.sigla = "JG";
		turma1.ensino = "2º grau";
		
		turma2.periodo = "Vespertino";
		turma2.serie = "9ª";
		turma2.sigla = "JG";
		turma2.ensino = "Fundamental";
		
		System.out.println("**** Turma 1 *****");
		System.out.println("Período: " + turma1.periodo + "\n" + "Série: " + turma1.serie + "\n" + 
								"Sigla: " + turma1.sigla + "\n" + "Ensino: " + turma1.ensino);
		System.out.println("**** Turma 2 *****");
		System.out.println("Período: " + turma2.periodo + "\n" + "Série: " + turma2.serie + "\n" + 
								"Sigla: " + turma2.sigla + "\n" + "Ensino: " + turma2.ensino);
	}

}
