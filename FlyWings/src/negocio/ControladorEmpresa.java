package negocio;

import java.util.List;

import dados.IRepositorioEmpresa;


public class ControladorEmpresa {

	private IRepositorioEmpresa repositorio;

	public ControladorEmpresa(IRepositorioEmpresa irepemp){
		repositorio = irepemp;
	}

	public boolean existe(String cnpj){
		return this.repositorio.existe(cnpj);
	}
	public Empresa procurar(String nomeDaEmpresa, String cnpj){
		Empresa e1 = this.repositorio.procurar(nomeDaEmpresa, cnpj);
		return e1;
	}

	public void cadastrar(Empresa e){
		if (e.equals(null)) {
		      throw new IllegalArgumentException("Parâmetro inválido");
		    }
		if(this.existe(e.getCnpj()) == false){
			this.repositorio.inserir(e);
		}
	}

	public List<Empresa> listar(){
		return this.repositorio.listar();
	}

	public void descadastrar(String nomeDaEmpresa,String cnpj){
		Empresa e1 = this.repositorio.procurar(nomeDaEmpresa, cnpj);

		if(nomeDaEmpresa == null && cnpj == null){
			throw new IllegalArgumentException("Parâmetro inválido");
		}
		else
			this.repositorio.deletar(e1);
	}

   //implementando alterar
	public void alterar(Empresa e1){
		this.repositorio.atualizar(e1);
	}


}
