package Dados;


import java.util.ArrayList;
import java.util.Collections;

import Negocios.ViagemOnibus;



public class RepositorioViagemOnibus {

	private ArrayList<ViagemOnibus> listaviagens = new ArrayList<ViagemOnibus>();

	public boolean cadastrarViagem(ViagemOnibus v1){
		boolean r = false;
		if(v1 != null){
		if(listaviagens.contains(v1) != true)
		{
            listaviagens.add(v1);
            r = true;
		}
		else
			System.out.println("Objeto ja existe");
		}
		return r;
	}

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

	public java.util.List<ViagemOnibus> listarViagens()
	{
		return Collections.unmodifiableList(this.listaviagens);

	}


	public ViagemOnibus procurarViagem(String codigo){
		for (ViagemOnibus viagemOnibus : listaviagens) {
			if(viagemOnibus.getCodigo() == codigo)
			{
				return viagemOnibus;
			}
		}
		return null;
}

	public boolean alterarViagem(ViagemOnibus v_para_alterar,ViagemOnibus v_alterada)
	{
		boolean r = false;
		if(v_para_alterar != null && v_alterada != null){
			if(listaviagens.contains(v_para_alterar))
			{
				listaviagens.remove(v_para_alterar);
				listaviagens.add(v_alterada);
				r = true;
			}
		}
		return r;
	}
}

