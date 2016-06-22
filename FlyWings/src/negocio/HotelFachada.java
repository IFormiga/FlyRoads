package negocio;

import dados.IHotelFachada;
import dados.RepositorioQuarto;
import dados.RepositorioTickets;
import exceptions.HEException;
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
	public void cadastrarReserva(TicketReserva ticket) throws TEException {
		
      
	}

	@Override
	public void descadastrarReserva(TicketReserva ticket) throws TNException {
		

	}

	@Override
	public TicketReserva procuraTicket(TicketReserva ticket) throws TNException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void associarQuartoaReserva(Quarto quarto, TicketReserva ticket) throws HEException {
		

	}

}
