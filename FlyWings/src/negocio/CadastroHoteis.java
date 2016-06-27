package negocio;

import java.util.ArrayList;
import java.util.List;

import dados.IRepositorioHoteis;
import exceptions.HEException;
import exceptions.HNException;

public class CadastroHoteis {

	private IRepositorioHoteis repositorio;


	public CadastroHoteis(IRepositorioHoteis repositorio) {

		this.repositorio = repositorio;
	}


	public void cadastrarHotel(Hotel hotel) throws HEException
	{
		if(hotel == null || (this.repositorio.existe(hotel)== true))
		{
			throw new IllegalArgumentException("Parâmetro inválido");
		}
		else if(hotel != null && (this.repositorio.existe(hotel) == false))
		{
			repositorio.salvarHotel(hotel);
			repositorio.salvarArquivo();
		}
		else
		{
			throw new HEException(hotel.getEndereço(),hotel.getCEP(),hotel.getNome_Hotel());
		}
	}

	public void descadastrarHotel(Hotel hotel) throws HNException
    {

    	if(hotel == null || (this.repositorio.existe(hotel) == false ))
    	{
    		throw new IllegalArgumentException("Parâmetro inválido");
    	}
    	else if(repositorio.existe(hotel))
    	{
    		repositorio.remover(hotel);
    		repositorio.salvarArquivo();
    	}
    	else
    	{
    		throw new HNException(hotel.getEndereço(),hotel.getCEP(),hotel.nomeHotel);
    	}

    }

	public Hotel procurarHotel(Hotel hotel) throws HNException
    {
    	return this.repositorio.procurarHotel(hotel);
    }


	public List<Quarto> criarQuartos(Hotel hotel)
    {
		List<Quarto> quartosCriados = new ArrayList<Quarto>();
    	if(hotel != null)
    	{

    		hotel.setListaQuarto(quartosCriados);

    	 }
    	return quartosCriados;

    }


}
