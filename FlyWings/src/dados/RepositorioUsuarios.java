package dados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import negocio.Usuario;

public class RepositorioUsuarios implements IRepositorioUsuario{
	private List<Usuario> listaUsuarios = new ArrayList<Usuario>();
	
	public RepositorioUsuarios(){
		
	}
	public boolean cadastrarUsuario(Usuario user){
		
		try{
			this.listaUsuarios.add(user);
		}
		catch (Exception e){
			return false;
		}
		return true;
	}
	public boolean alterarUsuario(Usuario a_ser_alterado,Usuario alterado){
		boolean r = false;
		for(Usuario user1 : listaUsuarios){
			if(user1.getCpf().equals(a_ser_alterado.getCpf())){
				listaUsuarios.remove(a_ser_alterado);
				listaUsuarios.add(alterado);
				r = true;
			}
		}
		return r;
	}
	
	public boolean removerUsuario(String cpf){
		boolean r = false;
		for(Usuario user1 : listaUsuarios){
			if(user1.getCpf().equals(cpf)){
				listaUsuarios.remove(user1);
				r = true;
			}
		}
		return r;
	}
	
	public Usuario procurarUsuario(String cpf){
		Usuario user = null;
		for(Usuario user1 : listaUsuarios){
			if(user1.getCpf().equals(cpf)){
			user = user1;
			}
		}
		return user;
	}
	
	public boolean existeUsuario(String cpf){
		boolean r = false;
		for(Usuario user1 : listaUsuarios){
			if(user1.getCpf().equals(cpf)){
				r = true;
			}
		}
		return r;
	}
	
	public List<Usuario> listaUsuarios(){
		return Collections.unmodifiableList(this.listaUsuarios);
	}
}
