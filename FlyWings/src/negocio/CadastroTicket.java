package negocio;
import dados.IRepositorioTickets;

import exceptions.TEException;
import exceptions.TNException;

public class CadastroTicket {

	private IRepositorioTickets repositorio;

	public CadastroTicket(IRepositorioTickets instanciaRepositorio){
		this.repositorio = instanciaRepositorio;
	}

	public void cadastrarReserva(TicketReserva ticket, Hotel hotel) throws TEException{

	if(ticket == null || (this.repositorio.existe(ticket)== true) || hotel == null)
		{
			throw new IllegalArgumentException("Parâmetro inválido");
		}
		else if(ticket != null && (this.repositorio.existe(ticket) == false))
		{
			repositorio.salvarTicket(ticket);
			repositorio.salvarArquivo();
		}
		else
		{
			throw new TEException(ticket.getData_entrada(),ticket.getData_saida(),ticket.getQuarto());
		}

}

    public void descadastrarReserva(TicketReserva ticket1) throws TNException
    {

    	if(ticket1 == null || (this.repositorio.existe(ticket1) == false ))
    	{
    		throw new IllegalArgumentException("Parâmetro inválido");
    	}
    	else if(repositorio.existe(ticket1))
    	{
    		repositorio.remover(ticket1);
    		repositorio.salvarArquivo();
    	}
    	else
    	{
    		throw new TNException(ticket1.getData_entrada(),ticket1.getData_saida(),ticket1.getQuarto());
    	}


    }


    public TicketReserva procurarReserva(TicketReserva ticket1) throws TNException
    {
    	return this.repositorio.procurarTicket(ticket1);
    }


    public boolean existeReserva(TicketReserva ticket)
    {
    	boolean resultado = false;

    	if(ticket!= null)
    	{
    	  if(this.repositorio.existe(ticket))
    	  {
    		  resultado = true;
    				  }
    	}
    	return resultado;


    }

}






