package exceptions;

public class JaExisteVooNesseHorarioException extends Exception {
	
	private int codigo;
	
	public JaExisteVooNesseHorarioException(int codigo){
		super("J� existe voo neste hor�rio.");
		this.codigo = codigo;
	}

	public int getCodigo(){
		return this.codigo;
	}
	
}
