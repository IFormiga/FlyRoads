package exceptions;

public class EEException extends Exception {

	public String getCnpj() {
		return this.cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	private String cnpj;
	private String nome;
	
	public EEException(String cnpj, String nome) {
		super("Empresa ja existe");
		this.cnpj = cnpj;
		this.nome = nome;
}

}
