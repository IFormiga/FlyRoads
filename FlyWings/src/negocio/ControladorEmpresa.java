package negocio;

import java.util.List;

import dados.IRepositorioEmpresa;
import exceptions.EmpresaJaExisteException;
import exceptions.EmpresaNaoExisteException;


public class ControladorEmpresa {

	private IRepositorioEmpresa repositorio;

	public ControladorEmpresa(IRepositorioEmpresa irepemp){
		repositorio = irepemp;
	}

	public boolean existe(String cnpj){
		return this.repositorio.existe(cnpj);
	}
	public Empresa procurar(String nomeDaEmpresa, String cnpj) throws EmpresaNaoExisteException{
		Empresa e1 = null;
		if(nomeDaEmpresa== null || cnpj==null){
			throw new IllegalArgumentException("Paramentro inválido");
		}
		else if(this.repositorio.existe(cnpj) == false){
			EmpresaNaoExisteException ene = new EmpresaNaoExisteException(cnpj);
			throw ene;
		}
		else{
			e1 = this.repositorio.procurar(nomeDaEmpresa, cnpj);
			return e1;
		}
	}

	public void cadastrar(Empresa e) throws EmpresaJaExisteException{
		if (e.equals(null)) {
		      throw new IllegalArgumentException("Parâmetro inválido");
		    }
		else if(this.existe(e.getCnpj())){
			EmpresaJaExisteException eje = new EmpresaJaExisteException(e.getCnpj());
			throw eje;
		}
		else{
			this.repositorio.inserir(e);
		}
	}

	public List<Empresa> listar(){
		return this.repositorio.listar();
	}

	public void descadastrar(String nomeDaEmpresa,String cnpj) throws EmpresaNaoExisteException{


		if(nomeDaEmpresa == null && cnpj == null){
			throw new IllegalArgumentException("Parâmetro inválido");
		}
		else if(this.repositorio.existe(cnpj)== false){
			EmpresaNaoExisteException ene = new EmpresaNaoExisteException(cnpj);
			throw ene;
		}
		else{
			Empresa e1 = this.procurar(nomeDaEmpresa, cnpj);
			this.repositorio.deletar(e1);
		}
		}

   //implementando alterar
	public void alterar(Empresa e1){
		if(e1.equals(null)){
			throw new IllegalArgumentException("Paramentro inválido");
		}
		else{
			this.repositorio.atualizar(e1);
		}

	}


}
