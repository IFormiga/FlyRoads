package negocio;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import dados.IRepositorioViagensOnibus;
import exceptions.ViagemEmAndamentoException;

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
		return this.repositorio.listar();
	}

	public void cadastrar(ViagemOnibus viagem){
		if(viagem.equals(null)){
			throw new IllegalArgumentException("Parâmetro inválido");
		}
		else if(this.existe(viagem.getCodigo()) == false){
			this.repositorio.cadastrar(viagem);
		}
	}

	// Adicionar exception de Viagem não existe
	public void descadastrar(String codigo) throws ViagemEmAndamentoException{
		ViagemOnibus v1 = this.repositorio.procurar(codigo);

		if(codigo == null){
			throw new IllegalArgumentException("Parâmetro inválido");
		}
		else if(v1.getChegada().isAfter(LocalTime.now()) && v1.getDatachegada().isAfter(LocalDate.now()) ){

			ViagemEmAndamentoException vae = new ViagemEmAndamentoException(codigo);
			throw vae;
		}
		else{
			this.repositorio.remover(v1);
		}

	}
	//implementando alterar
	public void alterar(ViagemOnibus v1){
		this.repositorio.alterar(v1);
	}




}
