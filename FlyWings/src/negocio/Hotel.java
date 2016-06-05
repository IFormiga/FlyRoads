package negocio;

public class Hotel {

	public String endereço;
	public String CEP;
    public String nome_hotel;
    public boolean quarto_disp;
    
    
	
    public Hotel(String endereço, String cEP, String nome_hotel,boolean quarto_disp) {
		
		this.endereço = endereço;
		CEP = cEP;
		this.nome_hotel = nome_hotel;
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
		return nome_hotel;
	}
	public void setNome(String nome) {
		this.nome_hotel = nome;
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
		if (nome_hotel == null) {
			if (other.nome_hotel != null)
				return false;
		} else if (!nome_hotel.equals(other.nome_hotel))
			return false;
		return true;
	}
	
	
	public String toString() {
		return "Hotel [endereço=" + endereço + ", CEP=" + CEP + ", nome_hotel="
				+ nome_hotel + ", quarto_disp=" + quarto_disp + "]";
	}
	
    
	
}
