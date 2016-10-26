package negocio;

import java.util.List;

import dados.IRepositorioUsuario;

public class ControladorUsuario {
	private IRepositorioUsuario repositorio;
	
	public ControladorUsuario(IRepositorioUsuario instanciaRepositorio){
		this.repositorio = instanciaRepositorio;
	}
	public void cadastrarUsuario(Usuario user){
		if(user!=null){
			this.repositorio.cadastrarUsuario(user);
		}
	}
	public void removerUsuario(String cpf){
		if(cpf!=null){
			this.repositorio.removerUsuario(cpf);
		}
	}
	public void alterarUsuario(Usuario aSerAlterado, Usuario alterado){
		if(aSerAlterado!=null && alterado!=null){
			this.repositorio.alterarUsuario(aSerAlterado, alterado);
		}
	}
	public List<Usuario> listar(){
		return this.repositorio.listaUsuarios();
	}
	public Usuario procurarUsuario(String cpf){
		return this.repositorio.procurarUsuario(cpf);
	}
		
}
