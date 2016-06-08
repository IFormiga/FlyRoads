package negocio;
import java.time.LocalDate;
import java.time.Period;


public class Ticket_Hotel {

	public Quarto getQuarto() {
		return quarto;
	}
	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}
	public Period getPeriodo_data() {
		return periodo_data;
	}
	public void setPeriodo_data(Period periodo_data) {
		this.periodo_data = periodo_data;
	}

	public LocalDate data_entrada;
	public LocalDate data_saida;
	public Quarto quarto;
	public Period periodo_data;
	
	
	
	public Ticket_Hotel(LocalDate data_entrada, LocalDate data_saida,
			Quarto quarto, Period periodo_data) {
		super();
		this.data_entrada = data_entrada;
		this.data_saida = data_saida;
		this.quarto = quarto;
		this.periodo_data = periodo_data;
	}
	public LocalDate getData_entrada() {
		return data_entrada;
	}
	public void setData_entrada(LocalDate data_entrada) {
		this.data_entrada  = LocalDate.now();
		this.data_entrada = data_entrada;
	}
	public LocalDate getData_saida() {
		return data_saida;
	}
	public void setData_saida(LocalDate data_saida) {
		this.data_saida = data_saida;
	}
	
	public Period PeriodoQuarto(LocalDate data_entrada, LocalDate data_saida)
	{
		periodo_data = Period.between(data_entrada,data_saida);
		return periodo_data;
	}
	
	public Quarto quarto_usuario(String numero_quarto)
	{
		if(quarto.Status_Quarto(numero_quarto) == false)
		{
			return quarto;
		}
		else 
		    return quarto;
		
			
	}
	
	public String toString() {
		return "Ticket_Hotel [data_entrada=" + data_entrada + ", data_saida="
				+ data_saida + ", quarto=" + quarto + ", periodo_data="
				+ periodo_data + "]";
	}
	
	
}
