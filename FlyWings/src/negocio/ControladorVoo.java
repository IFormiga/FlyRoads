package negocio;
import exceptions.VooJaExisteException;
import exceptions.VooNaoExisteException;
import exceptions.JaExisteVooNesseHorarioException;
import java.util.List;
import dados.IRepositorioVoo;

public class ControladorVoo {
	private IRepositorioVoo repositorio;
	
	public ControladorVoo(IRepositorioVoo instanciaRepositorio){
		this.repositorio = instanciaRepositorio;
	}
	
	public void cadastrarVoo(Voo v) throws VooJaExisteException, JaExisteVooNesseHorarioException{
		boolean verificacao = false;
		
		if (v != null && this.repositorio.existe(v.getCodigoDoVoo()) == false) {
			if(this.repositorio.verificaHorario(v) == true){
				verificacao = true;
			}
			if(verificacao == false){
				this.repositorio.cadastrarVoo(v);
			}
			if(verificacao == true){
				JaExisteVooNesseHorarioException m = new JaExisteVooNesseHorarioException(v.getCodigoDoVoo());
				throw m;
			}
		} 
			else {
				if(v == null){
					IllegalArgumentException x = new IllegalArgumentException("");
					throw x;
				}
					else{
						VooJaExisteException z = new VooJaExisteException(v.getCodigoDoVoo());
						throw z;
					}
		      }
	}
	
	public void removerVoo(Voo v) /*throw VooNaoExisteException*/{
		  if (v == null) {
			  throw new IllegalArgumentException("");
		  } 
		  else{
			  if (this.repositorio.existe(v.getCodigoDoVoo()) == true) {
				  this.repositorio.removerVoo(v.getCodigoDoVoo());
			  } 
			  else if(this.repositorio.existe(v.getCodigoDoVoo()) == false){
				  //throw new VooNaoExisteException();
			  }
		  }
	}
	
	public Voo procurar(int cod) throws VooNaoExisteException{
		if(this.repositorio.existe(cod) == true){
		return this.repositorio.procurarVoo(cod);
		}
		else{
			throw new VooNaoExisteException(cod);
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
	

