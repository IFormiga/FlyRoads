package negocio;
import dados.IRepositorioTickets;

import exceptions.TEException;
import exceptions.TNException;

public class CadastroTicket {
	
	private IRepositorioTickets repositorio;

	public CadastroTicket(IRepositorioTickets repositorio) {
		super();
		this.repositorio = repositorio;
	}
	
	public void CadastrarTicket(String numero_quarto) 
	{
		if(numero_quarto == null)
		{
			throw new IllegalArgumentException("Parâmetro inválido");
		}
		else if(!repositorio.existe(numero_quarto))
		{
			repositorio.cadastrar(numero_quarto);
		}
		
		
		
  		
	}
	
    public void DescadastrarTicket(String numero_quarto) 
    {
    	
    	if(numero_quarto == null)
    	{
    		throw new IllegalArgumentException("Parâmetro inválido");
    	}
    	else if(repositorio.existe(numero_quarto))
    	{
    		repositorio.remover(numero_quarto);
    	}
    	
    	
    }
	
        
    public Ticket_Hotel ProcurarTicket(Ticket_Hotel ticket1) throws TNException
    {
    	return this.repositorio.ProcurarTicket(ticket1);
    }
}



