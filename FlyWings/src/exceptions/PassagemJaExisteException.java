package exceptions;

public class PassagemJaExisteException extends Exception {
	
	private String codigo;
	
	public PassagemJaExisteException(String codigo){
		super("A passagem de c�digo: "+codigo+" j� existe");
		this.codigo = codigo;
		
	}
	
	public String getCodigo(){
		return this.codigo;
	}
}
