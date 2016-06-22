package dados;

import exceptions.HEException;
import exceptions.TEException;
import exceptions.TNException;

import negocio.Quarto;
import negocio.TicketReserva;

public interface IHotelFachada {

	public abstract void cadastrarReserva(TicketReserva ticket) throws TEException;
    public abstract void descadastrarReserva(TicketReserva ticket) throws TNException;
    public abstract TicketReserva procuraTicket(TicketReserva ticket) throws TNException;
    public abstract void associarQuartoaReserva(Quarto quarto, TicketReserva ticket) throws HEException;

    
	
	
}
