package exceptions;

public class HEException extends Exception {

	public String endere�o;
	public String cep;
	public String nome;
	
	
	public HEException(String endere�o, String cEP, String nome) {
		super("Hotel ja existe");
		this.endere�o = endere�o;
		this.cep = cEP;
		this.nome = nome;
		
	}
	
	
	
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
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
