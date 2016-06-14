package negocio;

import java.util.ArrayList;
import java.util.List;

public class CadastroHoteis {

	
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
