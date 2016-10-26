package exceptions;

public class EmpresaJaExisteException extends Exception {

	private String cnpj;

	public EmpresaJaExisteException(String cnpj) {
		super("A empresa com este" +cnpj+ " existe");
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}





}
