package dados;


import negocio.Hotel;

import exceptions.HEException;
import exceptions.HNException;

public interface IRepositorioHoteis {

	public boolean atualizarHotel(Hotel hotel_para_alt, Hotel hotel_alt)throws HNException, HEException;
	public void procurarHotel(Hotel hotel1)throws HNException;
	public void deletarHotel(Hotel hotel1)throws HNException;
	public void salvarHotel(Hotel hotel1)throws HEException;


}
