package dados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import negocio.Passagem;
public class RepositorioPassagens implements IRepositorioPassagem {
	private List<Passagem> listaPassagens = new ArrayList<Passagem>();
	
	public RepositorioPassagens(){
		
	}
	public boolean cadastrarPassagem(Passagem passagem){
		try{
			listaPassagens.add(passagem);
		}
		catch (Exception e){
			return false;
		}
		return true;
	}
	public boolean alterarPassagem(Passagem a_ser_alterado,Passagem alterado){
		boolean r = false;
		for(Passagem passagem2 : listaPassagens){
			if(passagem2.getCodigo() == a_ser_alterado.getCodigo()){
				listaPassagens.remove(passagem2);
				listaPassagens.add(alterado);
				r = true;
			}
		}
		return r;
	}
	
	public List<Passagem> listaPassagens(){
		return Collections.unmodifiableList(this.listaPassagens);
	}
	
	public Passagem procurarPassagem(String codigo){
		String cod;
		Passagem r = null;
		for(Passagem passagem1 : listaPassagens){
			cod = passagem1.getCodigo();
			if(cod.equals(codigo)){
				r = passagem1;
			}
		}
		return r;
	}
	
	public boolean existePassagem(String codigo){
		boolean r = false;
		String cod;
		for(Passagem passagem1 : listaPassagens){
			cod = passagem1.getCodigo();
			if(cod.equals(codigo)){
				r = true;
			}
		}
		return r;
	}
	
	public boolean removerPassagem(String codigo){
		String cod;
		boolean r = false;
		for(Passagem passagem1 : listaPassagens){
			cod = passagem1.getCodigo();
			if(cod.equals(codigo)){
				listaPassagens.remove(passagem1);
				r = true;
			}
		}
		return r;
	}
}
