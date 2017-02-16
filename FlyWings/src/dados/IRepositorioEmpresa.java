package dados;

import java.util.List;

import negocio.Empresa;

public interface IRepositorioEmpresa {

	public abstract void inserir(Empresa empresa1);

	public abstract void deletarEmpresa(Empresa empresa1) ;

	public abstract Empresa procurarEmpresa(String nome_da_empresa,String cnpj); //TODO mudar o nome das variaveis tirar o "_" e o abstract é irrelevante

	public abstract boolean existeEmpresa(String cnpj);

	public abstract boolean atualizarEmpresa(Empresa emp_alt); //TODO Apenas com o objeto da entidade já dá pra alterar. Mudar em todos os códigos
	
	public abstract List<Empresa> listar();

}