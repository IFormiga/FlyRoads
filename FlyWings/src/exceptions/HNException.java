package exceptions;

public class HNException extends Exception {
	
	
	public String endere�o;
	public String CEP;
	public String nome;
	public boolean quarto_disp;
	
	public HNException(String endere�o, String cEP, String nome)
	 {
super("Hotel n�o existe");
this.endere�o = endere�o;
this.CEP = cEP;
this.nome = nome;

}
	
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
	
	
	
	
	

}
