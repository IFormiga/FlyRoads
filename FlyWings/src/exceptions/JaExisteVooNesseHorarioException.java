package exceptions;

public class JaExisteVooNesseHorarioException extends Exception {
	
	private int codigo;
	
	public JaExisteVooNesseHorarioException(int codigo){
		super("Já existe voo neste horário.");
		this.codigo = codigo;
	}

	public int getCodigo(){
		return this.codigo;
	}
	
}
