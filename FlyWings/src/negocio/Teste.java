package negocio;

import java.time.LocalDate;
import java.time.LocalTime;

import exceptions.JaExisteVooNesseHorarioException;
import exceptions.PassagemNaoExisteException;
import exceptions.ViagemOnibusJaExisteException;
import exceptions.ViagemOnibusNaoExisteException;
import exceptions.VooJaExisteException;
import exceptions.VooNaoExisteException;

public class Teste {

	public static void main(String[] args) throws VooJaExisteException, JaExisteVooNesseHorarioException, VooNaoExisteException, PassagemNaoExisteException, ViagemOnibusNaoExisteException, ViagemOnibusJaExisteException {

		// teste com erro
		/*ControladorViagemOnibus controlador = new ControladorViagemOnibus();

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
		*/
		IFlyRoads fachada = FlyRoadsFachada.getInstance();

//		Usuario user = new Usuario("Igor", "123456", 20, "Boa Viagem", "Masculino", "IFormiga", "admin", "Senha: Admin");
//		fachada.cadastrarUsuario(user);
//		System.out.printf("%s\n", fachada.procurarUsuario("123456").toString());
//
//		Voo voo = new Voo(10, 00, 13, 30, "S�o Paulo","Recife", 2016, 10, 26, 2016, 10, 26, 6244, "Gol");
//		fachada.cadastrarVoo(voo);
//		System.out.printf("%s\n", fachada.procurarVoo(voo.getCodigoDoVoo()).toString());
//
//		Empresa empresa = new Empresa("Gol", "85753", "A�reo");
//		fachada.cadastrarEmpresa(empresa);
//		System.out.printf("%s\n", fachada.procurarEmpresa(empresa.getNomeEmpresa(), empresa.getCnpj()).toString());


//		ViagemOnibus viagem = new ViagemOnibus("linha 3", "81237556", "Bras�lia", "S�o Paulo",10,0,11,30, 2017, 8, 25,2017, 8, 26);
//
//		try {
//			fachada.CadastrarViagemOnibus(viagem);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

//		try {
//		System.out.println(fachada.procurarViagemOnibus("81237556"));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}


//		try {
//			fachada.removerViagemOnibus("81237556");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}


//			System.out.println(fachada.listaViagensOnibus());

//			try {
//				fachada.removerViagemOnibus("81237556");
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//
//			System.out.println(fachada.listaViagensOnibus());





//		// teste atualizar
//		Empresa empresaatu = new Empresa("Tam", "85753", "Aereo");
//		fachada.alterarEmpresa(empresaatu);
//		System.out.println(fachada.procurarEmpresa("Tam", "85753").toString());






}
}
