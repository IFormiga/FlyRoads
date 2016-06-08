package dados;

import java.util.List;

import negocio.Passagem;

public interface IRepositorioPassagem {

	public abstract boolean cadastrarPassagem(Passagem passagem);

	public abstract boolean alterarPassagem(Passagem a_ser_alterado,Passagem alterado);

	public abstract List<Passagem> listaPassagens();
	
	public abstract boolean existePassagem(String codigo);

	public abstract Passagem procurarPassagem(String codigo);

	public abstract boolean removerPassagem(String codigo);

}