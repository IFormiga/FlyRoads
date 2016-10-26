package dados;

import java.util.ArrayList;

import negocio.ViagemOnibus;

public interface IRepositorioViagensOnibus {

	boolean cadastrarViagem(ViagemOnibus v1);

	boolean removerViagem(ViagemOnibus viagem);

	java.util.List<ViagemOnibus> listarViagens();

	boolean alterarViagem(ViagemOnibus v_para_alterar, ViagemOnibus v_alterada);

	boolean existe(String codigo);

	ViagemOnibus procurar(String codigo);



}