package dados;

import java.util.List;

import exceptions.QEException;
import exceptions.QNException;

import negocio.Quarto;

public abstract interface IRepositorioQuarto {
	public abstract Quarto procurarQuarto(Quarto quarto1)throws QNException;
	public abstract boolean salvarQuarto(Quarto quarto1)throws QEException;
	public abstract boolean deletarQuarto(Quarto quarto1)throws QNException;
	public abstract boolean atualizarQuarto(Quarto quarto_para_alt, Quarto quarto_alt)throws QEException,QNException;
    public abstract boolean existe(Quarto quarto);
    public abstract boolean remover(Quarto quarto);
    public abstract Quarto procurar(String numeroQuarto);
    public abstract List<Quarto> listarQuartos();
    public  void salvarArquivo();
	public RepositorioQuarto lerDoArquivo();


}