package negocio;

import java.time.LocalDate;
import java.time.LocalTime;


import dados.RepositorioViagensOnibus;

public class ControladorViagemOnibus {

	private RepositorioViagensOnibus repositorio;

	public ControladorViagemOnibus(){
		this.repositorio = RepositorioViagensOnibus.getInstance();
	}

	public boolean existe(String codigo){
		return this.repositorio.existe(codigo);
	}
	public ViagemOnibus procurar(String codigo){
		return this.repositorio.procurar(codigo);
	}

	public void cadastrar(ViagemOnibus viagem){
		if(viagem == null){
			throw new IllegalArgumentException("Parâmetro inválido");
		}
		else if(this.existe(viagem.getCodigo()) == false){
			this.repositorio.cadastrarViagem(viagem);
		}
	}

	public void descadastrar(String codigo){
		ViagemOnibus v1 = this.repositorio.procurar(codigo);

		if(codigo == null){
			throw new IllegalArgumentException("Parâmetro inválido");
		}
		else if(v1.getChegada().isAfter(LocalTime.now()) && v1.getData_chegada().isAfter(LocalDate.now()) ){
			//uma viagem está em andamento, portanto não pode ser removida
		}
		else{
			this.repositorio.removerViagem(codigo);
		}

	}




}
