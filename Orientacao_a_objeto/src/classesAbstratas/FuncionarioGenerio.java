package classesAbstratas;

public abstract class FuncionarioGenerio {

	private String nome;
	private double salario;
	
	
	
	public abstract void Bonificacao();
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	
	
}
