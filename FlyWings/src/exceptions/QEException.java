package exceptions;

public class QEException extends Exception {

	private String numero_quarto;
	private boolean status_quarto;
	
	public QEException(String numero_quarto, boolean status_quarto) {
		super("Quarto ja existe");
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
