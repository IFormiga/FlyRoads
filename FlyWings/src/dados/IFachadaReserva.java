package dados;

import exceptions.TEException;
import exceptions.TNException;
import negocio.TicketReserva;

public interface IFachadaReserva {

	public abstract void cadastrarReserva(TicketReserva ticket) throws TEException;
    public abstract void descadastrarReserva(TicketReserva reserva) throws TNException;
    public abstract TicketReserva procuraTicket(TicketReserva ticket) throws TNException;

}
