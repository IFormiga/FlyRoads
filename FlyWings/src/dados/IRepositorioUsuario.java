package dados;

import java.util.List;

import negocio.Usuario;

public interface IRepositorioUsuario {

	public abstract boolean cadastrarUsuario(Usuario user);

	public abstract boolean alterarUsuario(Usuario aSerAlterado,Usuario alterado);

	public abstract boolean removerUsuario(String cpf);

	public abstract Usuario procurarUsuario(String cpf);
	
	public abstract boolean existeUsuario(String cpf);

	public abstract List<Usuario> listaUsuarios();

}
