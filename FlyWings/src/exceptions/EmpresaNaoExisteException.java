package exceptions;

public class EmpresaNaoExisteException extends Exception {

	private String cnpj;

	public EmpresaNaoExisteException(String cnpj) {
		super("A empresa com este" +cnpj+ " n�o existe");
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}


}
