package dados;

import negocio.Usuario;

public interface IRepositorioUsuario {

	public abstract boolean cadastrarUsuario(Usuario user);

	public abstract boolean alterarUsuario(Usuario a_ser_alterado,
			Usuario alterado);

	public abstract boolean removerUsuario(String cpf);

	public abstract void procurarUsuario(String cpf);

	public abstract void listarUsuarios();

}