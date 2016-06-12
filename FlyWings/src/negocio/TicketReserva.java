package negocio;

import java.time.LocalDate;
import java.time.Period;

public class TicketReserva {
	public LocalDate dataEntrada;
    public LocalDate dataSaida;
    public Quarto quarto;
   
public TicketReserva(LocalDate data_entrada, LocalDate data_saida,
            Quarto quarto) {
        super();
        this.dataEntrada = data_entrada;
        this.dataSaida = data_saida;
        this.quarto = quarto;
       
    }
    public Quarto getQuarto() {
        return quarto;
    }
    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }
   
 
    public LocalDate getData_entrada() {
        return dataEntrada;
    }
    public void setData_entrada(LocalDate data_entrada) {
        this.dataEntrada  = LocalDate.now();
        this.dataEntrada = data_entrada;
    }
    public LocalDate getData_saida() {
        return dataSaida;
    }
    public void setData_saida(LocalDate data_saida) {
        this.dataSaida = data_saida;
    }
   
    public Period quantasnoites(TicketReserva ticket)
   {
       if(ticket != null)
       {
    	   return Period.between(ticket.getData_entrada(), ticket.getData_saida());
    	   
       }
	return null;
   }
   
    public Quarto quarto_usuario(String numero_quarto)
    {
        if(quarto.statusQuarto(numero_quarto) == false)
        {
            return quarto;
        }
        else
            return quarto;
       
           
    }
   
    public String toString() {
        return "Ticket_Hotel [data_entrada=" + dataEntrada + ", data_saida="
                + dataSaida + ", quarto=" + quarto + "";
    }
   
   
}

