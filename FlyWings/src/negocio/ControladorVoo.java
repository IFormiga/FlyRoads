package negocio;
import java.util.List;

import dados.IRepositorioVoo;

public class ControladorVoo {
	private IRepositorioVoo repositorio;
	
	public ControladorVoo(IRepositorioVoo instanciaRepositorio){
		this.repositorio = instanciaRepositorio;
	}
	
	public void cadastrarVoo(Voo v) /*throws VooJaExisteException*/{
		  if (v != null && (this.repositorio.existe(v.getCodigo_do_voo()) == false)) {
		        this.repositorio.cadastrarVoo(v);
		      } 
		      else {
		    	  if(v == null){
		    		  IllegalArgumentException x = new IllegalArgumentException("");
		    		  throw x;
		    	  }
		    	  else{
		    		  //VooJaExisteException z = new VooJaExisteException();
		    		  //throw z;
		    	  }
		      }
	}
	
	public void removerVoo(Voo v) /*throw VooNaoExisteException*/{
		  if (v == null) {
		    } 
		  else {
		      if (this.repositorio.existe(v.getCodigo_do_voo()) == false) {
		        this.repositorio.removerVoo(v.getCodigo_do_voo());
		      } 
		      else {
		        //throw new VooJaExisteException(c.getNumero());
		      }
		    }
	}
	
	public Voo procurar(int cod)/*throw VooNaoExisteException*/{
		if(this.repositorio.existe(cod) == true){
		return this.repositorio.procurarVoo(cod);
		}
		else{
			return null;
			//throw new VooNaoExisteException;
		}
	}
	
	public List<Voo> listaVoo(){
		return this.listaVoo();
	}
	
	public void alterarVoo(Voo voo_alterado, Voo voo2){
		if(voo_alterado != null && voo2 != null){
			this.repositorio.alterarVoo(voo_alterado, voo2);
		}
		else{
			if(voo_alterado == null || voo2 == null){
	    		  IllegalArgumentException x = new IllegalArgumentException("");
	    		  throw x;	
			}
		}
	}
	
}
