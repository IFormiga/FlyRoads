package negocio;

public class Quarto {
 
   
    public String numeroQuarto;
    public boolean statusQuarto;
    private Hotel hotel;
   
 public Quarto(String numero_quarto, boolean status_quarto,Hotel hotel) {
       
        this.numeroQuarto = numero_quarto;
        this.statusQuarto = status_quarto;
        this.setHotel(hotel);
 }
   
    public String getnumeroQuarto() {
        return numeroQuarto;
    }
    public void setnumeroQuarto(String numero_quarto) {
        this.numeroQuarto = numero_quarto;
    }
   
    public Hotel getHotel()
    {
    	return hotel;
    }
    
    public void setHotel(Hotel hotel)
    {
    	if(hotel != null)
    	  this.hotel = hotel;
    }
   
   
    public boolean quartovazio(String numero_quarto)
    {
        statusQuarto = false;
        return statusQuarto;
    }
   
    public boolean quartoocupado(String numero_quarto)
    {
        statusQuarto = true;
        return statusQuarto;
    }
   
    public boolean statusQuarto(String numero_quarto)
    {
        return statusQuarto;
    }
   
 
   
   
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Quarto other = (Quarto) obj;
        if (numeroQuarto != other.numeroQuarto)
            return false;
        return true;
    }
   
    public String toString() {
        return "Quarto [numero_quarto=" + numeroQuarto + ", status_quarto="
                + statusQuarto + "]";
    }
   
   
}


