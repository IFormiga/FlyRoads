package dados;



import exceptions.EmpresaJaExisteException;
import exceptions.EmpresaNaoExisteException;
import negocio.Empresa;

public interface IRepositorioEmpresa {

	public abstract void cadastrarEmpresa(Empresa empresa1) throws  EmpresaJaExisteException;

	public abstract void deletarEmpresa(Empresa empresa1) throws EmpresaNaoExisteException;

	public abstract Empresa procurarEmpresa(String nome_da_empresa,String cnpj) throws  EmpresaNaoExisteException;

	public abstract boolean existeEmpresa(String cnpj);

	public abstract boolean atualizarEmpresa(Empresa empresa_para_alt,Empresa emp_alt);

}