package negocio;

import dados.IFachadaReserva;
import dados.RepositorioTickets;
import exceptions.TEException;
import exceptions.TNException;

public class FachadaReserva implements IFachadaReserva {

	private static IFachadaReserva instance;
	private CadastroTicket reserva;
	

	private static IFachadaReserva getInstance()
	{
		if(instance == null)
		{
			instance = new FachadaReserva();
		}
		return instance;
	}



	private FachadaReserva() {

		this.reserva = new CadastroTicket(RepositorioTickets.getInstance());
	}



	public void cadastrarReserva(TicketReserva ticket) throws TEException {

     this.reserva.cadastrarReserva(ticket);
	}


	public void descadastrarReserva(TicketReserva ticket) throws TNException {

       this.reserva.descadastrarReserva(ticket);
	}

	@Override
	public TicketReserva procuraTicket(TicketReserva ticket) throws TNException {

		return this.reserva.procurarReserva(ticket);
	}

}
