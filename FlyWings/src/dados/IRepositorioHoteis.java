package dados;


import java.util.List;

import negocio.Hotel;
import exceptions.HEException;
import exceptions.HNException;

public interface IRepositorioHoteis {

	public abstract boolean atualizarHotel(Hotel hotel_para_alt, Hotel hotel_alt)throws HNException, HEException;
	public abstract Hotel procurarHotel(Hotel hotel1)throws HNException;
	public abstract void deletarHotel(Hotel hotel1)throws HNException;
	public abstract void salvarHotel(Hotel hotel1)throws HEException;
	public abstract List<Hotel> listarHoteis();
	public abstract boolean existe(Hotel hotel);
	public abstract boolean remover(Hotel hotel);
	public  void salvarArquivo();
	public RepositorioHoteis lerDoArquivo();


}
