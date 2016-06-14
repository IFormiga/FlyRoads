package negocio;
 
import java.util.ArrayList;
import java.util.List;

import dados.IRepositorioQuarto;
import exceptions.QEException;
import exceptions.QNException;


   public class CadastroQuarto {

	private IRepositorioQuarto repositorio;

	public CadastroQuarto(IRepositorioQuarto repositorio) {
		
		this.repositorio = repositorio;
	}
	
	public void cadastrarQuarto(Quarto quarto1) throws QEException
	{
		if(quarto1 == null)
		{
			throw new IllegalArgumentException("Parâmetro inválido");
		}
		else if(!repositorio.existe(quarto1))
		{
			this.repositorio.salvarQuarto(quarto1);
		}
		
		else
		{
			throw new QEException(quarto1.getnumeroQuarto(),quarto1.statusQuarto(quarto1.getnumeroQuarto()));
		}
		
  		
	}
	
    public void descadastrarQuarto(Quarto quarto1) throws QNException
    {
    	
    	if(quarto1 == null)
    	{
    		throw new IllegalArgumentException("Parâmetro inválido");
    	}
    	else if(repositorio.existe(quarto1))
    	{
    		repositorio.deletarQuarto(quarto1);
    	}
    	
    	else
    	{
    		throw new QNException(quarto1.getnumeroQuarto(),quarto1.statusQuarto(quarto1.getnumeroQuarto()));
    	}

    }
   
  
    public void removerQuarto(Quarto quarto)
    {
        this.repositorio.remover(quarto);
    }
   
    public Quarto procurarQuarto(String numero_quarto)
    {
        return this.repositorio.procurar(numero_quarto);
    }
    
    
    
}