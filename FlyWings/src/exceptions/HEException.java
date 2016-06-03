package exceptions;

public class HEException extends Exception {

	
	public HEException(String endereço, String cEP, String nome,
			boolean quarto_disp) {
		super("Hotel ja existe");
		this.endereço = endereço;
		this.CEP = cEP;
		this.nome = nome;
		this.quarto_disp = quarto_disp;
	}
	public String endereço;
	public String CEP;
	public String nome;
	public boolean quarto_disp;
	
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
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
