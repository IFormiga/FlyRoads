package exceptions;

/**
 * Empresa não existe exception
 * @author Igor Formiga
 *
 */
public class ENException extends Exception {

	private String cnpj;
	private String nome;
	
	
	public ENException(String cnpj, String nome) {
		super("Empresa não existe");
		this.cnpj = cnpj;
		this.nome = nome;
	}


	public String getCnpj() {
		return cnpj;
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
	
	
}
