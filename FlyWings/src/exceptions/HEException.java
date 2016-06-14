package exceptions;

public class HEException extends Exception {

	public String endereço;
	public String cep;
	public String nome;
	
	
	public HEException(String endereço, String cEP, String nome) {
		super("Hotel ja existe");
		this.endereço = endereço;
		this.cep = cEP;
		this.nome = nome;
		
	}
	
	
	
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public String getCEP() {
		return cep;
	}
	public void setCEP(String cEP) {
		cep = cEP;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
	
	
}
