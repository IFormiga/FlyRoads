package exceptions;

import java.time.LocalDate;
import java.time.Period;

import negocio.Quarto;

public class TEException extends Exception {

	public LocalDate data_entrada;
	public LocalDate data_saida;
	public Quarto quarto;
	public Period periodo_data;
	
	public TEException(LocalDate data_entrada, LocalDate data_saida,
			Quarto quarto, Period periodo_data) {
		super("Ticket ja existe");
		this.data_entrada = data_entrada;
		this.data_saida = data_saida;
		this.quarto = quarto;
		this.periodo_data = periodo_data;
	}
	
	
	
	public LocalDate getData_entrada() {
		return data_entrada;
	}
	public void setData_entrada(LocalDate data_entrada) {
		this.data_entrada = data_entrada;
	}
	public LocalDate getData_saida() {
		return data_saida;
	}
	public void setData_saida(LocalDate data_saida) {
		this.data_saida = data_saida;
	}
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
	
	
}
