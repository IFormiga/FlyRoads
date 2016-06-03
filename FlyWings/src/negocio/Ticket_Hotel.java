package negocio;
import java.time.LocalDate;
import java.time.Period;


public class Ticket_Hotel {

	public LocalDate data_entrada;
	public LocalDate data_saida;
	public Quarto quarto;
	public Period periodo_data;
	
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
	
	public String quarto_usuario(Quarto quarto)
	{
		return quarto.toString();
	}
	
	public String toString() {
		return "Ticket_Hotel [data_entrada=" + data_entrada + ", data_saida="
				+ data_saida + ", quarto=" + quarto + ", periodo_data="
				+ periodo_data + "]";
	}
	
	
}
