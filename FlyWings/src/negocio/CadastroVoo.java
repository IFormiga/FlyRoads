package negocio;
import dados.IRepositorioVoo;

public class CadastroVoo {
	private IRepositorioVoo repositorio;
	
	public CadastroVoo(IRepositorioVoo instanciaRepositorio){
		this.repositorio = instanciaRepositorio;
	}
	public void cadastrarVoo(Voo v){
		  if (v == null) {
		    } 
		  else {
		      if (this.repositorio.existe(v.getCodigo_do_voo()) == false) {
		        this.repositorio.cadastrarVoo(v);
		      } 
		      else {
		        //throw new ContaJaExisteException(c.getNumero());
		      }
		    }
	}
	
	public void removerVoo(){
		
	}
	
	public Voo procurar(int cod){
		return this.repositorio.procurarVoo(cod);
	}
	
	


}
