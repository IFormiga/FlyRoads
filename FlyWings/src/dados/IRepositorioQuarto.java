package dados;

import negocio.Quarto;

public interface IRepositorioQuarto {
	public abstract String ProcurarQuarto(Quarto quarto1);
	public abstract boolean SalvarQuarto(Quarto quarto1);
	public abstract boolean DeletarQuarto(Quarto quarto1);
	public abstract boolean AtualizarQuarto(Quarto quarto_para_alt, Quarto quarto_alt);
	public abstract boolean existe(Quarto quarto1);
	
}