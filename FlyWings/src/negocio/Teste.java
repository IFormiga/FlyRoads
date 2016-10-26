package negocio;

import java.time.LocalDate;
import java.time.LocalTime;

import dados.IRepositorioViagensOnibus;

public class Teste {

	public static void main(String[] args) {

		
		ControladorViagemOnibus controlador = new ControladorViagemOnibus();

		String assentos[] = {"1A","2A"};
		LocalTime saida = LocalTime.of(9,0);
		LocalTime chegada = LocalTime.of(10,30);
		LocalDate data_origem = LocalDate.of(2016, 10, 25);
		LocalDate data_chegada = LocalDate.of(2016, 10, 26);
		ViagemOnibus viagem1 = new ViagemOnibus("910","40",assentos,"Piedade","Rio doce",saida,chegada,data_origem,data_chegada);

		controlador.cadastrar(viagem1);
		System.out.println("Existe a viagem de cod" + viagem1.getCodigo());
		System.out.println(controlador.existe("40"));

		System.out.println(controlador.procurar("40").toString());

		controlador.descadastrar("40");
		System.out.println(controlador.existe("40"));






}
}
