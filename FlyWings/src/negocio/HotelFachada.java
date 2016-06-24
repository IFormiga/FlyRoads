package negocio;

import dados.IHotelFachada;
import dados.RepositorioQuarto;
import dados.RepositorioTickets;
import exceptions.HEException;
import exceptions.QEException;
import exceptions.TEException;
import exceptions.TNException;

public class HotelFachada implements IHotelFachada {


	private static IHotelFachada instance;
	private CadastroTicket reserva;
	private CadastroQuarto cadquarto;


	private static IHotelFachada getInstance()
	{
		if(instance == null)
		{
			instance = new HotelFachada();
		}
		return instance;
	}

	private HotelFachada() {

		this.reserva = new CadastroTicket(RepositorioTickets.getInstance());
		this.cadquarto = new CadastroQuarto(RepositorioQuarto.getInstance());
	}


	@Override
	public void cadastrarReserva(TicketReserva ticket, Quarto quarto) throws TEException {

		if(cadquarto.procurarQuarto(quarto.getnumeroQuarto()).statusQuarto(quarto.getnumeroQuarto()))
				{
			        this.reserva.cadastrarReserva(ticket, quarto.getHotel());
				}


	}

	@Override
	public void descadastrarReserva(TicketReserva ticket) throws TNException {

		if(this.reserva.existeReserva(ticket))
		{
			this.reserva.descadastrarReserva(ticket);
		}


	}

	@Override
	public TicketReserva procuraTicket(TicketReserva ticket) throws TNException {

		TicketReserva ticketclone = null;
		if(this.reserva.existeReserva(ticket))
		{
			ticket = ticketclone;
		}
		return ticketclone;
	}

	public void cadastrarQuarto(Quarto quarto) throws QEException
	{
		this.cadquarto.cadastrarQuarto(quarto);
	}


}
