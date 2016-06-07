package negocio;

public class Quarto {

	
	public String numero_quarto;
	public boolean status_quarto;
	
	
	public String getNumero_quarto() {
		return numero_quarto;
	}
	public void setNumero_quarto(String numero_quarto) {
		this.numero_quarto = numero_quarto;
	}
	
	public String toString() {
		return "Quarto [numero_quarto=" + numero_quarto + ", status_quarto="
				+ status_quarto + "]";
	}
	public Quarto(String numero_quarto, boolean status_quarto) {
		
		this.numero_quarto = numero_quarto;
		this.status_quarto = status_quarto;
	}
	public boolean quartovazio(String numero_quarto)
	{
		status_quarto = true;
		return status_quarto;
	}
	
	public boolean quartoocupado(String numero_quarto)
	{
		status_quarto = true;
		return status_quarto;
	}
	
	public boolean Status_Quarto(String numero_quarto)
	{
		return status_quarto;
	}
	
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Quarto other = (Quarto) obj;
		if (numero_quarto != other.numero_quarto)
			return false;
		return true;
	}
	
	
	
}
