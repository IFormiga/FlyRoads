package dados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import negocio.Voo;
public class RepositorioVoos implements IRepositorioVoo{
	private List<Voo> listaVoos = new ArrayList<Voo>();
	
	//lista de passageiros pra usar nas regras de negocio
	
	public RepositorioVoos(){
	}
	public boolean cadastrarVoo(Voo voo){
		try{
			listaVoos.add(voo);
		}
		catch (Exception e){
			return false;
		}
		return true;
	}
	public boolean removerVoo(int codigo_do_voo){
		int cod;
		boolean r = false;
		for(Voo voo2 : listaVoos){
			cod = voo2.getCodigo_do_voo();
			if(cod == codigo_do_voo){
				listaVoos.remove(voo2);
				r = true;
			}
		}
		return r;
	}
	public List<Voo> listaVoos(){
		return Collections.unmodifiableList(this.listaVoos);
	}
	
	public Voo procurarVoo(int codigo_do_voo){
		int cod;
		Voo r = null;
		for(Voo voo2 : listaVoos){
			cod = voo2.getCodigo_do_voo();
			if(cod == codigo_do_voo){
				r = voo2;
			}
		}
		return r;
	}
	
	public boolean existe(int codigo_do_voo){
		int cod;
		boolean r = false;
		for(Voo voo2 : listaVoos){
			cod = voo2.getCodigo_do_voo();
			if(cod == codigo_do_voo){
				r = true;	
			}
		}
		return r;
	}
	
	public boolean verificaHorario(Voo v){
		boolean verificacao = false;
		for(Voo voo : listaVoos){
			if((v.getOrigem().equals(voo.getOrigem()) && v.getSaida().equals(voo.getSaida())) || (v.getDestino().equals(voo.getDestino()) && v.getChegada().equals(voo.getChegada()))){
				verificacao = true;
			}
		}
		return verificacao;
	}
	
	public void alterarVoo(Voo a_ser_alterado, Voo alterado){
		for(Voo voo2 : listaVoos){
			if(voo2.getCodigo_do_voo() == a_ser_alterado.getCodigo_do_voo()){
				listaVoos.remove(voo2);
				listaVoos.add(alterado);
			}
		}
	}
}
