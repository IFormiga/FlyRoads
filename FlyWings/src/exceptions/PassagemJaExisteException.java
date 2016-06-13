package exceptions;

public class PassagemJaExisteException extends Exception {
	
	private String codigo;
	
	public PassagemJaExisteException(String codigo){
		super("A passagem de código: "+codigo+" já existe");
		this.codigo = codigo;
		
	}
	
	public String getCodigo(){
		return this.codigo;
	}
}
