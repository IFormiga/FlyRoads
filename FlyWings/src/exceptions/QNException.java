package exceptions;

public class QNException extends Exception {

	private String numero_quarto;
	private boolean status_quarto;
	
	public QNException(String numero_quarto, boolean status_quarto) {
		super("Quarto não existe");
		this.numero_quarto = numero_quarto;
		this.status_quarto = status_quarto;
	}
	
	
	
	public String getNumero_quarto() {
		return numero_quarto;
	}

	public void setNumero_quarto(String numero_quarto) {
		this.numero_quarto = numero_quarto;
	}

	public boolean isStatus_quarto() {
		return status_quarto;
	}

	public void setStatus_quarto(boolean status_quarto) {
		this.status_quarto = status_quarto;
	}

	
	
	
}
