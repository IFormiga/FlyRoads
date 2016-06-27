package dados;

import exceptions.HEException;
import exceptions.QEException;
import exceptions.TEException;
import exceptions.TNException;

import negocio.Quarto;
import negocio.TicketReserva;

public interface IHotelFachada {

	public abstract void cadastrarReserva(TicketReserva ticket, Quarto quarto) throws TEException;
    public abstract void descadastrarReserva(TicketReserva ticket) throws TNException;
    public abstract TicketReserva procuraTicket(TicketReserva ticket) throws TNException;
    public void cadastrarQuarto(Quarto quarto) throws QEException;




}
