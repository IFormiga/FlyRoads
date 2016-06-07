package dados;

import exceptions.QEException;
import exceptions.QNException;
import negocio.Quarto;

public interface IRepositorioQuarto {
	public abstract String ProcurarQuarto(Quarto quarto1)throws QNException;
	public abstract boolean SalvarQuarto(Quarto quarto1)throws QEException;
	public abstract boolean DeletarQuarto(Quarto quarto1)throws QNException;
	public abstract boolean AtualizarQuarto(Quarto quarto_para_alt, Quarto quarto_alt)throws QEException,QNException;
    public abstract boolean existe(Quarto quarto);
	
}