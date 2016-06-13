package exceptions;

public class VooNaoExisteException extends Exception {

	private int codigo;
	
	public VooNaoExisteException(int codigo){
		super("O voo de codigo: "+codigo+" n�o existe");
		this.codigo = codigo;
	}

	public int getCodigo(){
		return this.codigo;
	}
	
}
