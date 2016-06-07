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
	
	public void CadastrarTicket(Ticket_Hotel ticket1) throws TEException
	{
		if(ticket1 == null)
		{
			throw new IllegalArgumentException("Parâmetro inválido");
		}
		else if(!repositorio.existe(ticket1))
		{
			this.repositorio.SalvarTicket(ticket1);
		}
		
		else
		{
			throw new TEException(ticket1.getData_entrada(),ticket1.getData_saida(),ticket1.getQuarto(),ticket1.getPeriodo_data());
		}
		
  		
	}
	
    public void DescadastrarTicket(Ticket_Hotel ticket1) throws TNException
    {
    	
    	if(ticket1 == null)
    	{
    		throw new IllegalArgumentException("Parâmetro inválido");
    	}
    	else if(repositorio.existe(ticket1))
    	{
    		repositorio.existe(ticket1);
    	}
    	
    	else
    	{
    		throw new TNException(ticket1.getData_entrada(),ticket1.getData_saida(),ticket1.getQuarto(),ticket1.getPeriodo_data());
    	}
    }
	
        
    public Ticket_Hotel ProcurarTicket(Ticket_Hotel ticket1) throws TNException
    {
    	return this.repositorio.ProcurarTicket(ticket1);
    }
}



