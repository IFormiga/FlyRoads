package dados;

import negocio.Ticket_Hotel;
import exceptions.TEException;
import exceptions.TNException;

public interface IRepositorioTickets {
	
	public abstract boolean SalvarTicket(Ticket_Hotel ticket1)throws TEException;
	public abstract Boolean DeletarTicket(Ticket_Hotel ticket1)throws TNException;
	public abstract Ticket_Hotel ProcurarTicket(Ticket_Hotel ticket1)throws TNException;
	public abstract boolean AtualizarTicket(Ticket_Hotel ticket1, Ticket_Hotel ticket2)throws TEException, TNException;
	public abstract boolean existe(String numero_quarto);
	public abstract boolean remover(String numero_quarto);
	public abstract boolean cadastrar(String numero_quarto);
	
	
	
	

}
