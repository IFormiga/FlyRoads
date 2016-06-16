package dados;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import exceptions.HEException;
import exceptions.HNException;

import negocio.Hotel;



public class RepositorioHoteis implements IRepositorioHoteis {

private List<Hotel> listaHoteis = new ArrayList<Hotel>();


	public void salvarHotel(Hotel hotel1)throws HEException
	{
	   	if(listaHoteis.contains(hotel1))
	   	{
		   HEException hee = new HEException(hotel1.getEndereço(),hotel1.getCEP(),hotel1.getNome_Hotel());
		   throw hee;
	   	}
	   	else
	   	{
	   		this.listaHoteis.add(hotel1);
	   	}
	}

	public void deletarHotel(Hotel hotel1)throws HNException
	{

	    if(listaHoteis.contains(hotel1))
			{
				listaHoteis.remove(hotel1);
			}
		else
		{
			HNException hne = new HNException(hotel1.getEndereço(),hotel1.getCEP(),hotel1.getNome_Hotel());
			throw hne;
		}
	}

	public Hotel procurarHotel(Hotel hotel1)throws HNException
	{
		if(listaHoteis.contains(hotel1))
		{
			return hotel1;

		}
		else
		{
			throw new HNException(hotel1.getEndereço(),hotel1.getCEP(),hotel1.getNome_Hotel());
		}
	}

	public boolean atualizarHotel(Hotel hotel_para_alt, Hotel hotel_alt)throws HNException, HEException
	{
		boolean r = false;
		if(listaHoteis.contains(hotel_para_alt))
		{
			listaHoteis.remove(hotel_para_alt);

			if(!listaHoteis.contains(hotel_alt))
			{
				listaHoteis.add(hotel_alt);
				r = true;
			}
			else
			{
				 HEException hee = new HEException(hotel_alt.getEndereço(),hotel_alt.getCEP(),hotel_alt.getNome_Hotel());
				  throw hee;
			}

		}
		else
		{
			HNException hne = new HNException(hotel_para_alt.getEndereço(),hotel_para_alt.getCEP(),hotel_para_alt.getNome_Hotel());
			throw hne;
		}

		return r;
	}


	public List<Hotel> listarHoteis() {
		return Collections.unmodifiableList(this.listaHoteis);
	}


	public boolean existe(Hotel hotel) {
		boolean resultado = false;
		for (Hotel hotel2 : listaHoteis) {
		     {
				if(hotel2.equals(hotel))
				{
					resultado = true;
				}

		    }

		}
		return resultado;
	}



	public boolean remover(Hotel hotel) {
		boolean resultado = false;
		for (Hotel hotel2 : listaHoteis) {
			if(hotel2.equals(hotel))
			{
				listaHoteis.remove(hotel2);
				resultado = true;
			}
		}
		return resultado;
	}

}
