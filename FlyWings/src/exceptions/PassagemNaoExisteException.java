package exceptions;

public class PassagemNaoExisteException extends Exception {

	private String codigo;

	public PassagemNaoExisteException(String codigo){
		super("A passagem de n�mero: "+codigo+" n�o existe");
		this.codigo = codigo;
	}
	
	public String getCodigo(){
		return this.codigo;
	}

}
