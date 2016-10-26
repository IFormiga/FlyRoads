package dados;

import java.util.ArrayList;
import java.util.Collections;

import negocio.ViagemOnibus;

public class RepositorioViagensOnibus implements IRepositorioViagensOnibus {


	private ArrayList<ViagemOnibus> listaviagens;
	private static IRepositorioViagensOnibus instance;

	private RepositorioViagensOnibus(){
		this.listaviagens = new ArrayList<ViagemOnibus>();
	}
	public static IRepositorioViagensOnibus getInstance(){
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
		else
			System.out.println("Objeto ja existe");
		}
		return r;
	}

	/* (non-Javadoc)
	 * @see dados.IRepositorioViagensOnibus#removerViagem(java.lang.String)
	 */
	@Override
	public boolean removerViagem(String codigo){

		boolean r = false;
		if(codigo != null){
		for (ViagemOnibus viagemOnibus : listaviagens) {
			if(viagemOnibus.getCodigo() == codigo){
				listaviagens.remove(viagemOnibus);
				r = true;
			}
		}
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
		if(codigo != null){
		for (ViagemOnibus viagemOnibus : listaviagens) {
			if(viagemOnibus.getCodigo().equals(codigo)){
				resultado = viagemOnibus;
			}
		}
		}
		return resultado;
	}

}
