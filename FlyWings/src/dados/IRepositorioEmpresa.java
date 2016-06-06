package dados;

import exceptions.EEException;
import exceptions.ENException;
import negocio.Empresa;

public interface IRepositorioEmpresa {

	public abstract void cadastrarEmpresa(Empresa empresa1) throws EEException;

	public abstract void deletarEmpresa(Empresa empresa1) throws ENException;

	public abstract Empresa procurarEmpresa(String nome_da_empresa,String cnpj) throws ENException;

	public abstract boolean existeEmpresa(String cnpj);
	
	public abstract boolean atualizarEmpresa(Empresa empresa_para_alt,Empresa emp_alt);

}