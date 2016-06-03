package dados;

import java.util.ArrayList;
import java.util.List;

import negocio.Passagem;
public class RepositorioPassagens {
	private List<Passagem> listaPassagens = new ArrayList<Passagem>();
	
	public RepositorioPassagens(){
		
	}
	public boolean venderPassagem(Passagem passagem){
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
	
	public void listarPassagens(){
		for(Passagem passagem1 : listaPassagens){
			System.out.println("Nome do cliente: "+passagem1.getUser().getNome());
			System.out.println("Código da passagem: "+passagem1.getCodigo());
			System.out.println("Assento: "+passagem1.getAssento());
			System.out.println("Saindo de: "+passagem1.getFlight().getOrigem());
			System.out.println("Destino: "+passagem1.getFlight().getDestino());
			System.out.println("Hora de Saida: "+passagem1.getFlight().getSaida());
			System.out.println("Hora de Chegada: "+passagem1.getFlight().getChegada());
			System.out.println("---------------------------------------");
		}
	}
	
	public void procurarPassagem(String codigo){
		String cod;
		for(Passagem passagem1 : listaPassagens){
			cod = passagem1.getCodigo();
			if(cod.equals(codigo)){
				System.out.println("---------------------------------------");
				System.out.println("Nome do cliente: "+passagem1.getUser().getNome());
				System.out.println("Código da passagem: "+passagem1.getCodigo());
				System.out.println("Assento: "+passagem1.getAssento());
				System.out.println("Saindo de: "+passagem1.getFlight().getOrigem());
				System.out.println("Destino: "+passagem1.getFlight().getDestino());
				System.out.println("Hora de Saida: "+passagem1.getFlight().getSaida());
				System.out.println("Hora de Chegada: "+passagem1.getFlight().getChegada());
				System.out.println("---------------------------------------");
			}
		}
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
