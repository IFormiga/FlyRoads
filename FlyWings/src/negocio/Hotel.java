package negocio;

public class Hotel {

	public String endereço;
	public String CEP;
    public String nomeHotel;
    public boolean quarto_disp;
    
    
	
    public Hotel(String endereço, String cEP, String nome_hotel,boolean quarto_disp) {
		
		this.endereço = endereço;
		CEP = cEP;
		this.nomeHotel = nome_hotel;
		this.quarto_disp = quarto_disp;
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
    
    public boolean disponibilidadequarto(Quarto quarto)
    {
    	if(quarto != null)
    	{
    		quarto_disp = quarto.Status_Quarto(quarto.getNumero_quarto());
    		return quarto_disp;
    	}
    	else
    	{
    		quarto_disp = false; 
    		return quarto_disp;
    		// quarto não existe
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
				+ nomeHotel + ", quarto_disp=" + quarto_disp + "]";
	}
	
    
	
}
