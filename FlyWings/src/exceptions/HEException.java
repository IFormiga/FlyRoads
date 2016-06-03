package exceptions;

public class HEException extends Exception {

	
	public HEException(String endere�o, String cEP, String nome,
			boolean quarto_disp) {
		super("Hotel ja existe");
		this.endere�o = endere�o;
		this.CEP = cEP;
		this.nome = nome;
		this.quarto_disp = quarto_disp;
	}
	public String endere�o;
	public String CEP;
	public String nome;
	public boolean quarto_disp;
	
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String cEP) {
		CEP = cEP;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isQuarto_disp() {
		return quarto_disp;
	}
	public void setQuarto_disp(boolean quarto_disp) {
		this.quarto_disp = quarto_disp;
	}
	
	
	
	
}
