package exceptions;

public class PassagemNaoExisteException extends Exception {

	private String codigo;

	public PassagemNaoExisteException(String codigo){
		super("A passagem de número: "+codigo+" não existe");
		this.codigo = codigo;
	}
	
	public String getCodigo(){
		return this.codigo;
	}

}
