package negocio;

import dados.IRepositorioQuarto;
import exceptions.QEException;
import exceptions.QNException;

public class CadastroQuarto {

	private IRepositorioQuarto repositorio;

	public CadastroQuarto(IRepositorioQuarto repositorio) {
		super();
		this.repositorio = repositorio;
	}
	
	public void CadastrarQuarto(Quarto quarto1) throws QEException, QNException
	{
		if(repositorio.ProcurarQuarto(quarto1) != null)
		{
			this.repositorio.SalvarQuarto(quarto1);
		}
		else if(quarto1 == null)
		{
			throw new IllegalArgumentException("Parâmetro inválido");
		}
		else
		{
			throw new QEException(quarto1.getNumero_quarto(),quarto1.Status_Quarto(quarto1.getNumero_quarto()));
		}
		
		
			
		
	}
	
}
