package dados;

import java.util.List;

import negocio.Empresa;

public interface IRepositorioEmpresa {

	public abstract void cadastrarEmpresa(Empresa empresa1);

	public abstract void deletarEmpresa(Empresa empresa1) ;

	public abstract Empresa procurarEmpresa(String nome_da_empresa,String cnpj) ;

	public abstract boolean existeEmpresa(String cnpj);

	public abstract boolean atualizarEmpresa(Empresa empresa_para_alt,Empresa emp_alt);
	
	public abstract List<Empresa> listar();

}