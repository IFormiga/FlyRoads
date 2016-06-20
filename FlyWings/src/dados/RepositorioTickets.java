package dados;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import exceptions.TEException;
import exceptions.TNException;
import negocio.TicketReserva;



public class RepositorioTickets implements IRepositorioTickets{

private List<TicketReserva> listaTickets = new ArrayList<TicketReserva>();
	private static RepositorioTickets instance;


	public static IRepositorioTickets getInstance() {
	    if (instance == null) {
	      instance = lerDoArquivo();
	    }
	    return instance;
	  }

	public boolean salvarTicket(TicketReserva ticket1)throws TEException // retorno tem que ser boolean
	{
	   	boolean resultado = false;
		if(listaTickets.contains(ticket1))
	   	{
		     TEException tee = new TEException(ticket1.getData_entrada(),ticket1.getData_saida(),ticket1.quarto);
		     throw tee;
	   	}
	   	else
	   	{
	   		listaTickets.add(ticket1);
	   		resultado = true;

	   	}
	   	return resultado;
	}

	public Boolean deletarTicket(TicketReserva ticket1)throws TNException //Retorno tem que ser boolean
	{
		boolean resultado = false;
	    if(listaTickets.contains(ticket1))
			{
				listaTickets.remove(ticket1);
				resultado = true;
			}

	    else
		{
		  TNException tne = new TNException(ticket1.getData_entrada(),ticket1.getData_saida(),ticket1.quarto);
		  throw tne;
		}
	    return resultado;
	}

	public TicketReserva procurarTicket(TicketReserva ticket1)throws TNException // retornar um ticket
	{
		if(listaTickets.contains(ticket1))
		{
			return ticket1;

		}
		else
		{
			TNException tne = new TNException(ticket1.getData_entrada(),ticket1.getData_saida(),ticket1.quarto);
			throw tne;
		}


	}

	public boolean atualizarTicket(TicketReserva ticket_para_alt, TicketReserva ticket_alt)throws TEException, TNException
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
				TEException tee = new TEException(ticket_alt.getData_entrada(),ticket_alt.getData_saida(),ticket_alt.quarto);
			    throw tee;
			}

		}
		else
		{
			TNException tne = new TNException(ticket_para_alt.getData_entrada(),ticket_para_alt.getData_saida(),ticket_para_alt.quarto);
			 throw tne;
		}

		return r;
	}


	public boolean existe(TicketReserva ticket) {

		boolean resultado = false;
		for (TicketReserva ticketReserva : listaTickets) {
		     {
				if(ticketReserva.equals(ticket))
				{
					resultado = true;
				}

		    }

		}
		return resultado;
	}

	public boolean remover(TicketReserva ticket)
	{
		boolean resultado = false;
		for (TicketReserva ticket2 : listaTickets) {
			if(ticket2.equals(ticket))
			{
				listaTickets.remove(ticket2);
				resultado = true;
			}
		}
		return resultado;

	}


	public List<TicketReserva> listarTickets() {

		return Collections.unmodifiableList(this.listaTickets);
	}


	public static RepositorioTickets lerDoArquivo() {
	    RepositorioTickets instanciaLocal = null;

	    File arqtickets = new File("ReservasTickets.dat");
	    FileInputStream fis = null;
	    ObjectInputStream ois = null;
	    try {
	      fis = new FileInputStream(arqtickets);
	      ois = new ObjectInputStream(fis);
	      Object o = ois.readObject();
	      instanciaLocal = (RepositorioTickets) o;
	    } catch (Exception e) {
	      instanciaLocal = new RepositorioTickets();
	    } finally {
	      if (ois != null) {
	        try {
	          ois.close();
	        } catch (IOException e) {
	        }
	      }
	    }

	    return instanciaLocal;
	  }

	public void salvarArquivo() {
	    if (instance == null) {
	      return;
	    }

	    File arqtickets = new File("ReservasTickets.dat");
	    FileOutputStream fos = null;
	    ObjectOutputStream oos = null;

	    try {
	      fos = new FileOutputStream(arqtickets);
	      oos = new ObjectOutputStream(fos);
	      oos.writeObject(instance);
	    } catch (Exception e) {
	      e.printStackTrace();
	    } finally {
	      if (oos != null) {
	        try {
	          oos.close();
	        } catch (IOException e) {
	          }
	      }
	    }
	  }




}


