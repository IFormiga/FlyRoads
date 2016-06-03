package dados;
import java.util.ArrayList;
import java.util.List;

import exceptions.HEException;
import exceptions.HNException;
import negocio.Hotel;


public class RepositorioHoteis {

private List<Hotel> listaHoteis = new ArrayList<Hotel>();
	
	
	public void SalvarQuarto(Hotel hotel1)throws HEException
	{
	   	if(listaHoteis.contains(hotel1))
	   	{
		   HEException hee = new HEException(hotel1.getEndereço(),hotel1.getCEP(),hotel1.getNome_Hotel(),hotel1.quarto_disp);
		   throw hee;
	   	}
	   	else
	   	{
	   		listaHoteis.add(hotel1);
	   	}
	}
	
	public void DeletarHotel(Hotel hotel1)throws HNException
	{
		
	    if(listaHoteis.contains(hotel1))
			{
				listaHoteis.remove(hotel1);
			}
		else
		{
			HNException hne = new HNException(hotel1.getEndereço(),hotel1.getCEP(),hotel1.getNome_Hotel(),hotel1.quarto_disp);
			throw hne;
		}
	}
	
	public void ProcurarHotel(Hotel hotel1)throws HNException
	{
		if(listaHoteis.contains(hotel1))
		{
			System.out.println(hotel1.toString());
		}
		else
		{
			HNException hne = new HNException(hotel1.getEndereço(),hotel1.getCEP(),hotel1.getNome_Hotel(),hotel1.quarto_disp);
			throw hne;
		}
	}
	
	public boolean AtualizarHotel(Hotel hotel_para_alt, Hotel hotel_alt)throws HNException, HEException
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
				 HEException hee = new HEException(hotel_alt.getEndereço(),hotel_alt.getCEP(),hotel_alt.getNome_Hotel(),hotel_alt.quarto_disp);
				  throw hee;
			}
			
		}
		else
		{
			HNException hne = new HNException(hotel_para_alt.getEndereço(),hotel_para_alt.getCEP(),hotel_para_alt.getNome_Hotel(),hotel_para_alt.quarto_disp);
			throw hne;
		}
		
		return r;
	} 
	
}
