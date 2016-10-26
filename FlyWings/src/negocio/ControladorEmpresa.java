package negocio;

import dados.IRepositorioEmpresa;


public class ControladorEmpresa {

	private IRepositorioEmpresa repositorio;

	public ControladorEmpresa(IRepositorioEmpresa irepemp){
		repositorio = irepemp;
	}

	public boolean existe(String cnpj){
		return this.repositorio.existeEmpresa(cnpj);
	}
	public Empresa procurar(String nomeDaEmpresa, String cnpj){
		Empresa e1 = this.repositorio.procurarEmpresa(nomeDaEmpresa, cnpj);
		return e1;
	}

	public void cadastrar(Empresa e){
		if (e.equals(null)) {
		      throw new IllegalArgumentException("Parâmetro inválido");
		    }
		if(this.existe(e.getCnpj()) == false){
			this.repositorio.cadastrarEmpresa(e);
		}
	}

	public void descadastrar(String nomeDaEmpresa,String cnpj){
		Empresa e1 = this.repositorio.procurarEmpresa(nomeDaEmpresa, cnpj);

		if(nomeDaEmpresa == null && cnpj == null){
			throw new IllegalArgumentException("Parâmetro inválido");
		}
		else
			this.repositorio.deletarEmpresa(e1);
	}

   //implementando alterar
	public void alterar(Empresa e1, Empresa e2){
		this.repositorio.atualizarEmpresa(e1, e2);
	}


}
