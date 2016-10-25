package dados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import negocio.Usuario;

public class RepositorioUsuarios implements IRepositorioUsuario{
	private List<Usuario> listaUsuarios;
	private static RepositorioUsuarios instance;
	
	private RepositorioUsuarios(){
		this.listaUsuarios = new ArrayList<Usuario>();
	}
	
	public static RepositorioUsuarios getInstance(){
	    if (instance == null) {
		      instance = lerDoArquivo();
		    }
		    return instance;
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
	
	public void salvarArquivo() {

		if (instance == null) {
		      return;
		    }

		    File arqUsuarios = new File("RepositorioUsuarios.dat");
		    FileOutputStream fos = null;
		    ObjectOutputStream oos = null;

		    try {
		      fos = new FileOutputStream(arqUsuarios);
		      oos = new ObjectOutputStream(fos);
		      oos.writeObject(instance);
		    } catch (Exception e) {
		      e.printStackTrace();
		    } finally {
		      if (oos != null) {
		        try {
		          oos.close();
		        } catch (IOException e) {
		          }
		      }
		    }
		  }
	
	private static RepositorioUsuarios lerDoArquivo() {
		RepositorioUsuarios instanciaLocal = null;

	    File arqUsuarios = new File("RepositorioUsuarios.dat");
	    FileInputStream fis = null;
	    ObjectInputStream ois = null;
	    try {
	      fis = new FileInputStream(arqUsuarios);
	      ois = new ObjectInputStream(fis);
	      Object o = ois.readObject();
	      instanciaLocal = (RepositorioUsuarios) o;
	    } catch (Exception e) {
	      instanciaLocal = new RepositorioUsuarios();
	    } finally {
	      if (ois != null) {
	        try {
	          ois.close();
	        } catch (IOException e) {
	        }
	      }
	    }

	    return instanciaLocal;
	  }
	
}
