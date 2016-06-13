package exceptions;

public class VooJaExisteException extends Exception {
	
	private int codigo;
	
	public VooJaExisteException(int codigo){
		super("O voo de codigo: "+codigo+" j� existe");
		this.codigo = codigo;
	}

	public int getCodigo(){
		return this.codigo;
	}
	
}
