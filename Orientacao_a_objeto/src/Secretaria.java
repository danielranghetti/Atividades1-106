
public class Secretaria extends Funcionario {
	private int ramal;

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}

	public int getRamal() {
		return ramal;
	}

	@Override
	String consultaDadosFuncionario() {
		return super.consultaDadosFuncionario() + "/" + Integer.toString(this.ramal);
	}
}