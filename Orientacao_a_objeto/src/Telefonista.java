
public class Telefonista extends Funcionario {
	private int estacaoDeTrabalho;
    
    public void setEstacaoDeTrabalho(int estacaoDeTrabalho) {
        this.estacaoDeTrabalho = estacaoDeTrabalho;
    }
     
    public int getEstacaoDeTrabalho() {
        return estacaoDeTrabalho;
    }
	
    @Override
    String consultaDadosFuncionario() {
    	return super.consultaDadosFuncionario() + "/" + Integer.toString(this.estacaoDeTrabalho);
    
    }
}
