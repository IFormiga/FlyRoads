package dados;

import java.util.ArrayList;
import java.util.List;

import negocio.Voo;
public class RepositorioVoos {
	private List<Voo> listaVoos = new ArrayList<Voo>();
	
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
	public void listarVoos(){
		for(Voo voo2 : listaVoos){
			System.out.println("Nome da Empresa: "+voo2.getNome_empresa());
			System.out.println("C�digo do voo: "+voo2.getCodigo_do_voo());
			System.out.println("Origem: "+voo2.getOrigem());
			System.out.println("Destino: "+voo2.getDestino());
			System.out.println("Hora de Saida: "+voo2.getSaida());
			System.out.println("Hora de Chegada: "+voo2.getChegada());
			System.out.println("---------------------------------------");
		}
	}
	
	public Voo procurarVoo(int codigo_do_voo){
		int cod;
		Voo r = null;
		for(Voo voo2 : listaVoos){
			cod = voo2.getCodigo_do_voo();
			if(cod == codigo_do_voo){
				System.out.println("Nome da Empresa: "+voo2.getNome_empresa());
				System.out.println("C�digo do voo: "+voo2.getCodigo_do_voo());
				System.out.println("Origem: "+voo2.getOrigem());
				System.out.println("Destino: "+voo2.getDestino());
				System.out.println("Hora de Saida: "+voo2.getSaida());
				System.out.println("Hora de Chegada: "+voo2.getChegada());
				System.out.println("---------------------------------------");	
			}
		r = voo2;
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
				System.out.println("Nome da Empresa: "+voo2.getNome_empresa());
				System.out.println("C�digo do voo: "+voo2.getCodigo_do_voo());
				System.out.println("Origem: "+voo2.getOrigem());
				System.out.println("Destino: "+voo2.getDestino());
				System.out.println("Hora de Saida: "+voo2.getSaida());
				System.out.println("Hora de Chegada: "+voo2.getChegada());
				System.out.println("---------------------------------------");	
			}
		}
		return r;
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
