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
		if(quarto1 == null)
		{
			throw new IllegalArgumentException("Parâmetro inválido");
		}
		else if(!repositorio.existe(quarto1.getNumero_quarto()))
		{
			this.repositorio.SalvarQuarto(quarto1);
		}
		
		else
		{
			throw new QEException(quarto1.getNumero_quarto(),quarto1.Status_Quarto(quarto1.getNumero_quarto()));
		}
		
  		
	}
	
    public void DescadastrarQuarto(Quarto quarto1) throws QNException
    {
    	
    	if(quarto1 == null)
    	{
    		throw new IllegalArgumentException("Parâmetro inválido");
    	}
    	else if(repositorio.existe(quarto1.getNumero_quarto()))
    	{
    		repositorio.DeletarQuarto(quarto1);
    	}
    	
    	else
    	{
    		throw new QNException(quarto1.getNumero_quarto(),quarto1.Status_Quarto(quarto1.getNumero_quarto()));
    	}
    }
	
    public void RemoverQuarto(String numero_quarto)
    {
    	this.repositorio.remover(numero_quarto);
    }
    
    public Quarto ProcurarQuarto(String numero_quarto)
    {
    	return this.repositorio.procurar(numero_quarto);
    }
}
