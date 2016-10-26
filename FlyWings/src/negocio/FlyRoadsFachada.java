package negocio;

import java.util.List;
import java.util.ArrayList;

import dados.RepositorioPassagens;
import dados.RepositorioVoos;
import exceptions.JaExisteVooNesseHorarioException;
import exceptions.PassagemJaExisteException;
import exceptions.PassagemNaoExisteException;
import exceptions.VooJaExisteException;
import exceptions.VooNaoExisteException;

public class FlyRoadsFachada implements IFlyRoads{
	private ControladorEmpresa empresas;
	private ControladorPassagem passagens;
	private ControladorVoo voos;
	private ControladorUsuario usuarios;
	private ControladorViagemOnibus viagensOnibus;
	
	private static IFlyRoads instance;
	
	private FlyRoadsFachada(){
		this.empresas = new ControladorEmpresa();
		this.passagens = new ControladorPassagem(RepositorioPassagens.getInstance());
		this.voos = new ControladorVoo(RepositorioVoos.getInstance());
		this.usuarios = new ControladorUsuario();
		this.viagensOnibus = new ControladorViagemOnibus();
	}
	
	public static IFlyRoads getInstance(){
		if(instance == null){
			instance = new FlyRoadsFachada();
		}
		return instance;
	}
	//    CADASTRAR/VENDER
	
	/*public void cadastrarEmpresa(Empresa empresa){
		
	}*/
	public void venderPassagem(Passagem passagem) throws PassagemJaExisteException{
		this.passagens.venderPassagem(passagem);
	}
	public void cadastrarVoo(Voo voo) throws VooJaExisteException, JaExisteVooNesseHorarioException{
		this.voos.cadastrarVoo(voo);
	}
	/*public void cadastrarUsuario(Usuario u){
		this.usuarios.cadastrarUsuario;
	}*/
	public void CadastrarViagemOnibus(ViagemOnibus viagem){
		this.viagensOnibus.cadastrar(viagem);
	}
	
	//REMOVER
	/*
	public void removerEmpresa(Empresa e){
		this.empresas.removerEmpresa(e);
	}*/
	public void removerPassagem(Passagem passagem) throws PassagemNaoExisteException, PassagemJaExisteException{
		this.passagens.removerPassagem(passagem);
	}
	public void removerVoo(Voo v){
		this.voos.removerVoo(v);
	}
	/*
	public void removerUsuario(Usuario u){
		this.usuarios.removerUsuario(u);
	}*/
	public void removerViagemOnibus(String codigo){
		this.viagensOnibus.descadastrar(codigo);;
	}
	//ALTERAR
	/*public void alterarEmpresa(){
		
	}*/
	public void alterarPassagem(Passagem passagemAlterada, Passagem passagem) throws PassagemNaoExisteException{
		this.passagens.alterarPassagem(passagemAlterada, passagem);
	}
	public void alterarVoo(Voo vooAlterado, Voo voo){
		this.voos.alterarVoo(vooAlterado, voo);
	}
	/*public void alterarUsuario(){
		
	}*/
	/*public void alterarViagemOnibus(){
		this.viagensOnibus.alterar();
	}
	*/
	//PROCURAR
	/*public void procurarEmpresa(){
		this.empresas.procurar();
	}*/
	public void procurarPassagem(String cod) throws PassagemNaoExisteException{
		this.passagens.procurarPassagem(cod);
	}
	public void procurarVoo(int cod) throws VooNaoExisteException{
		this.voos.procurar(cod);
	}
	/*public void procurarUsuario(){
		this.usuarios.procurar();
	}*/
	public void procurarViagemOnibus(String codigo){
		this.viagensOnibus.procurar(codigo);
	}
	// LISTAR
	/*public ArrayList listaEmpresas(){
		return this.empresas.listar();
	}*/
	public List<Passagem> listaPassagens(){
		return this.passagens.listaPassagens();
	}
	public List<Voo> listaVoos(){
		return this.voos.listaVoo();
	}
	/*public List<Usuario> listaUsuarios(){
		return this.usuarios.listaUsuarios();
	}*/
	public List<ViagemOnibus> listaViagensOnibus(){
		return this.viagensOnibus.;
	}

}
