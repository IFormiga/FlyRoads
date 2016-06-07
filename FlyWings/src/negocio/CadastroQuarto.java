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
	
	public void CadastrarQuarto(Quarto quarto1) throws QEException
	{
		if(!repositorio.existe(quarto1))
		{
			this.repositorio.SalvarQuarto(quarto1);
		}
		else if(quarto1 == null)
		{
			throw new IllegalArgumentException("Par�metro inv�lido");
		}
		else
		{
			throw new QEException(quarto1.getNumero_quarto(),quarto1.Status_Quarto(quarto1.getNumero_quarto()));
		}
		
  		
	}
	
    public void DescadastrarQuarto(Quarto quarto1) throws QNException
    {
    	if(repositorio.existe(quarto1))
    	{
    		repositorio.DeletarQuarto(quarto1);
    	}
    	else if(quarto1 == null)
    	{
    		throw new IllegalArgumentException("Par�metro inv�lido");
    	}
    	else
    	{
    		throw new QNException(quarto1.getNumero_quarto(),quarto1.Status_Quarto(quarto1.getNumero_quarto()));
    	}
    }
	
    
}
