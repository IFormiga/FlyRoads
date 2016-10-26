package dados;

import java.util.ArrayList;
import java.util.Collections;

import negocio.ViagemOnibus;

public class RepositorioViagensOnibus implements IRepositorioViagensOnibus {


	private ArrayList<ViagemOnibus> listaviagens;
	private static RepositorioViagensOnibus instance;

	private RepositorioViagensOnibus(){
		this.listaviagens = new ArrayList<ViagemOnibus>();
	}
	public static RepositorioViagensOnibus getInstance(){
		if(instance == null){
			instance = new RepositorioViagensOnibus();
		}
		return instance;
	}


	/* (non-Javadoc)
	 * @see dados.IRepositorioViagensOnibus#cadastrarViagem(negocio.ViagemOnibus)
	 */
	@Override
	public boolean cadastrarViagem(ViagemOnibus v1){
		boolean r = false;
		if(v1 != null){
		if(listaviagens.contains(v1) != true){
            listaviagens.add(v1);
            r = true;
		}

		}
		return r;
	}

	/* (non-Javadoc)
	 * @see dados.IRepositorioViagensOnibus#removerViagem(java.lang.String)
	 */
	@Override
	public boolean removerViagem(ViagemOnibus viagem){

		boolean r = false;
          if(viagem != null){
        	  this.listaviagens.remove(viagem);
        	  r = true;
				}
          	return r;
		}



	/* (non-Javadoc)
	 * @see dados.IRepositorioViagensOnibus#listarViagens()
	 */
	@Override
	public java.util.List<ViagemOnibus> listarViagens(){
		return Collections.unmodifiableList(this.listaviagens);
	}



	/* (non-Javadoc)
	 * @see dados.IRepositorioViagensOnibus#alterarViagem(negocio.ViagemOnibus, negocio.ViagemOnibus)
	 */
	@Override
	public boolean alterarViagem(ViagemOnibus v_para_alterar,ViagemOnibus v_alterada){
		boolean r = false;
		if(v_para_alterar != null && v_alterada != null){
			if(listaviagens.contains(v_para_alterar)){
				listaviagens.remove(v_para_alterar);
				listaviagens.add(v_alterada);
				r = true;
			}
		}
		return r;
	}

	/* (non-Javadoc)
	 * @see dados.IRepositorioViagensOnibus#existe(java.lang.String)
	 */
	@Override
	public boolean existe(String codigo){
		boolean verifica = false;
		for (ViagemOnibus viagemOnibus : listaviagens) {
			if(viagemOnibus.getCodigo().equals(codigo)){
				verifica = true;
			}
		}
		return verifica;
	}


	/* (non-Javadoc)
	 * @see dados.IRepositorioViagensOnibus#procurar(java.lang.String)
	 */
	@Override
	public ViagemOnibus procurar(String codigo){
		ViagemOnibus resultado = null;

		for (int i = 0; i < this.listaviagens.size(); i++) {
			     if (this.listaviagens.get(i).getCodigo().equals(codigo)) {
			        resultado = this.listaviagens.get(i);
			      }
		}

		return resultado;
	}

}