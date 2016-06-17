package negocio;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

	public String endereço;
	public String CEP;
    public String nomeHotel;
   private List<Quarto> listaQuartos = new ArrayList<Quarto>();
    
    
    
	
    public Hotel(String endereço, String cEP, String nome_hotel,List<Quarto> listaQuartos) {
		
		this.endereço = endereço;
		CEP = cEP;
		this.nomeHotel = nome_hotel;
		this.listaQuartos = listaQuartos;
		
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String cEP) {
		CEP = cEP;
	}
	public String getNome_Hotel() {
		return nomeHotel;
	}
	public void setNome(String nome) {
		this.nomeHotel = nome;
	} 
	
	public List<Quarto> getListaQuarto()
	{
		return listaQuartos;
	}
	
	public void setListaQuarto(List<Quarto> lista)
	{
		this.listaQuartos = lista;
	}
    
    public boolean disponibilidadequarto(Quarto quarto)
    {
    	boolean resultado = false;
    	if(quarto != null)
    	{
    		if(listaQuartos.contains(quarto))  
    		{
    			if(quarto.statusQuarto(quarto.getnumeroQuarto()))
    					{
    				            resultado = false;
    					}
    			else
    			{
                      resultado = true;
    		   }
    	
        }
    	
    }
    	return resultado;
    }
    
    
    public void addQuartos(Quarto quarto)
    {
      if(quarto != null)
    {
      if(!this.getListaQuarto().contains(quarto))
    {
       listaQuartos.add(quarto);
     }
     
    }
       
    }
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hotel other = (Hotel) obj;
		if (CEP != other.CEP)
			return false;
		if (endereço == null) {
			if (other.endereço != null)
				return false;
		} else if (!endereço.equals(other.endereço))
			return false;
		if (nomeHotel == null) {
			if (other.nomeHotel != null)
				return false;
		} else if (!nomeHotel.equals(other.nomeHotel))
			return false;
		return true;
	}
	
	
	public String toString() {
		return "Hotel [endereço=" + endereço + ", CEP=" + CEP + ", nome_hotel="
				+ nomeHotel + "";
	}
	
    
	
}
