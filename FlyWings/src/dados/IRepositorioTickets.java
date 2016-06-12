package dados;

import negocio.TicketReserva;

import exceptions.TEException;
import exceptions.TNException;

public interface IRepositorioTickets {
	
	public abstract boolean salvarTicket(TicketReserva ticket1)throws TEException;
	public abstract Boolean deletarTicket(TicketReserva ticket1)throws TNException;
	public abstract TicketReserva procurarTicket(TicketReserva ticket1)throws TNException;
	public abstract boolean atualizarTicket(TicketReserva ticket1, TicketReserva ticket2)throws TEException, TNException;
	public abstract boolean existe(TicketReserva ticket);
	public abstract boolean remover(TicketReserva ticket);
	
	
	
	
	

}
