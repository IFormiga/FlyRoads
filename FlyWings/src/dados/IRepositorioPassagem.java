package dados;

import negocio.Passagem;

public interface IRepositorioPassagem {

	public abstract boolean venderPassagem(Passagem passagem);

	public abstract boolean alterarPassagem(Passagem a_ser_alterado,
			Passagem alterado);

	public abstract void listarPassagens();
	
	public abstract boolean existePassagem(String codigo);

	public abstract void procurarPassagem(String codigo);

	public abstract boolean removerPassagem(String codigo);

}