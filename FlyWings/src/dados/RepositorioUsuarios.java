package dados;

import java.util.ArrayList;
import java.util.List;

import negocio.Usuario;

public class RepositorioUsuarios {
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
	
	public void procurarUsuario(String cpf){
		for(Usuario user1 : listaUsuarios){
			if(user1.getCpf().equals(cpf)){
				System.out.println("---------------------------------------");
				System.out.println("Nome do cliente: "+user1.getNome());
				System.out.println("CPF: "+user1.getCpf());
				System.out.println("Idade: "+user1.getIdade());
				System.out.println("Sexo: "+user1.getSexo());
				System.out.println("Nick: "+user1.getNick());
				System.out.println("---------------------------------------");
			}
		}
	}
	public void listarUsuarios(){
		for(Usuario user1 : listaUsuarios){
			System.out.println("---------------------------------------");
			System.out.println("Nome do cliente: "+user1.getNome());
			System.out.println("CPF: "+user1.getCpf());
			System.out.println("Idade: "+user1.getIdade());
			System.out.println("Sexo: "+user1.getSexo());
			System.out.println("Nick: "+user1.getNick());
			System.out.println("---------------------------------------");
		}
	}
}