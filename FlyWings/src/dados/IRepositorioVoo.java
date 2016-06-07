package dados;

import java.util.List;

import negocio.Voo;

public interface IRepositorioVoo {

	public abstract boolean cadastrarVoo(Voo voo); //ok

	public abstract boolean removerVoo(int codigo_do_voo); //ok

	public abstract List<Voo> listaVoos(); //ok

	public abstract Voo procurarVoo(int codigo_do_voo); //ok

	public abstract boolean existe(int codigo_do_voo);
	
	public abstract void alterarVoo(Voo a_ser_alterado, Voo alterado); //ok

}