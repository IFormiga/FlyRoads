package dados;

import negocio.Empresa;

public interface IRepositorioEmpresa {

	public abstract boolean SalvarEmpresa(Empresa empresa1);

	public abstract boolean DeletarEmpresa(Empresa empresa1);

	public abstract String ProcurarEmpresa(Empresa empresa1);

	public abstract boolean AtualizarEmpresa(Empresa empresa_para_alt,
			Empresa emp_alt);

}