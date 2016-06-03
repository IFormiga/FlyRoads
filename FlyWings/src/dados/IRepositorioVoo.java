package dados;

import negocio.Voo;

public interface IRepositorioVoo {

	public abstract boolean cadastrarVoo(Voo voo);

	public abstract boolean removerVoo(int codigo_do_voo);

	public abstract void listarVoos();

	public abstract Voo procurarVoo(int codigo_do_voo);

	public abstract boolean existe(int codigo_do_voo);
	
	public abstract void alterarVoo(Voo a_ser_alterado, Voo alterado);

}