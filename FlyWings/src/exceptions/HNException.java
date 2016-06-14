package exceptions;

public class HNException extends Exception {
	
	
	public String endereço;
	public String CEP;
	public String nome;
	public boolean quarto_disp;
	
	public HNException(String endereço, String cEP, String nome)
	 {
super("Hotel não existe");
this.endereço = endereço;
this.CEP = cEP;
this.nome = nome;

}
	
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
	
	
	
	
	

}
