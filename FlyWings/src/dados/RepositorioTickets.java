package dados;
import java.util.ArrayList;
import java.util.List;

import exceptions.TEException;
import exceptions.TNException;
import negocio.Ticket_Hotel;


public class RepositorioTickets {

private List<Ticket_Hotel> listaTickets = new ArrayList<Ticket_Hotel>();
	
	
	public void Salvarticket(Ticket_Hotel ticket1)throws TEException // retorno tem que ser boolean
	{
	   	if(listaTickets.contains(ticket1))
	   	{
		     TEException tee = new TEException(ticket1.getData_entrada(),ticket1.getData_saida(),ticket1.quarto,ticket1.PeriodoQuarto(ticket1.data_entrada,ticket1.data_saida));
		     throw tee;
	   	}
	   	
	}
	
	public void DeletarTicket(Ticket_Hotel ticket1)throws TNException //Retorno tem que ser boolean
	{
		
	    if(listaTickets.contains(ticket1))
			{
				listaTickets.remove(ticket1);
				
			}
		
	    else
		{
		  TNException tne = new TNException(ticket1.getData_entrada(),ticket1.getData_saida(),ticket1.quarto,ticket1.PeriodoQuarto(ticket1.data_entrada,ticket1.data_saida));
		  throw tne;
		}
	}
	
	public void ProcurarTicket(Ticket_Hotel ticket1)throws TNException // retornar um ticket
	{
		if(listaTickets.contains(ticket1))
		{
			System.out.println(ticket1.toString());
			
		}
		else
		{
			TNException tne = new TNException(ticket1.getData_entrada(),ticket1.getData_saida(),ticket1.quarto,ticket1.PeriodoQuarto(ticket1.data_entrada,ticket1.data_saida));
			throw tne;
		}
			
			
	}
	
	public boolean AtualizarTicket(Ticket_Hotel ticket_para_alt, Ticket_Hotel ticket_alt)throws TEException, TNException
	{
		boolean r = false;
		if(listaTickets.contains(ticket_para_alt))
		{
			listaTickets.remove(ticket_para_alt);
			
			if (!listaTickets.contains(ticket_alt)) 
			{
				listaTickets.add(ticket_alt);
				r = true;
			} 
			else 
			{
				TEException tee = new TEException(ticket_alt.getData_entrada(),ticket_alt.getData_saida(),ticket_alt.quarto,ticket_alt.PeriodoQuarto(ticket_alt.data_entrada,ticket_alt.data_saida));
			    throw tee;
			}
			
		}
		else
		{
			TNException tne = new TNException(ticket_para_alt.getData_entrada(),ticket_para_alt.getData_saida(),ticket_para_alt.quarto,ticket_para_alt.PeriodoQuarto(ticket_para_alt.data_entrada,ticket_para_alt.data_saida));
			 throw tne;
		}
		
		return r;
	} 
	
}