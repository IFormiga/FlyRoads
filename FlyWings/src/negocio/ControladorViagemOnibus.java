package negocio;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import dados.IRepositorioViagensOnibus;

public class ControladorViagemOnibus {

	private IRepositorioViagensOnibus repositorio;

	public ControladorViagemOnibus(IRepositorioViagensOnibus irep){
		this.repositorio = irep;
	}

	public boolean existe(String codigo){
		return this.repositorio.existe(codigo);
	}
	public ViagemOnibus procurar(String codigo){
		ViagemOnibus v1 = this.repositorio.procurar(codigo);
        return v1;
	}
	
	public List<ViagemOnibus> listar(){
		return this.repositorio.listarViagens();
	}

	public void cadastrar(ViagemOnibus viagem){
		if(viagem.equals(null)){
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
			this.repositorio.removerViagem(v1);
		}

	}
	//implementando alterar
	public void alterar(ViagemOnibus v1,ViagemOnibus v2){
		this.repositorio.alterarViagem(v1, v2);
	}




}
