package negocio;

import java.util.List;

import dados.IRepositorioPassagem;

public class ControladorPassagem {
	private IRepositorioPassagem repositorio;

	public ControladorPassagem(IRepositorioPassagem instanciaRepositorio){
		this.repositorio = instanciaRepositorio;
	}
	public void cadastrarPassagem(Passagem p)/*throws PassagemJaExisteException*/{
		if (p != null && (this.repositorio.existePassagem(p.getCodigo())) == false){
	        this.repositorio.cadastrarPassagem(p);
	      } 
	      else {
	    	  if(p == null){
	    		  IllegalArgumentException x = new IllegalArgumentException("");
	    		  throw x;
	    	  }
	    	  else{
	    		  //PassagemJaExisteException z = new PassagemJaExisteException();
	    		  //throw z;
	    	  }
	      }
	}
	public void alterarPassagem(Passagem passagem_alterada, Passagem passagem) /*throw PassagemNaoExisteException*/{
		if(passagem_alterada != null && passagem != null){
			this.repositorio.alterarPassagem(passagem_alterada, passagem);
		}
		else{
			if(passagem_alterada == null || passagem == null){
	    		  IllegalArgumentException x = new IllegalArgumentException("");
	    		  throw x;	
			}
			else{
				//PassagemJaExisteException z = new PassagemJaExisteException();
	    		//throw z;
			}
		}
	}
	public Passagem procurarPassagem(String cod) /*throw PassagemNaoExisteException*/{
		Passagem passagem = null;
		if(this.repositorio.existePassagem(cod) == true){
			passagem = this.repositorio.procurarPassagem(cod);
			}
			else{
				//throw new VooNaoExisteException;
			}
		return passagem;
	}
	public List<Passagem> listaPassagens(){
		return this.listaPassagens();
	}
	public void removerPassagem(Passagem p) /*throw PassagemNaoExisteException*/{
		 if (p == null) {
		    } 
		  else {
		      if (this.repositorio.existePassagem(p.getCodigo()) == false) {
		        this.repositorio.removerPassagem(p.getCodigo());
		      } 
		      else {
		        //throw new PassagemJaExisteException(c.getNumero());
		      }
		    }
	}
	
}
