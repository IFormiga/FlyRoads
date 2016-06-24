package dados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import exceptions.QEException;
import exceptions.QNException;
import negocio.Quarto;


public class RepositorioQuarto implements IRepositorioQuarto {

	public List<Quarto> listaQuartos = new ArrayList<Quarto>();

	private static RepositorioQuarto instance;


	public static IRepositorioQuarto getInstance() {
	    if (instance == null) {
	      instance = lerDoArquivo();
	    }
	    return instance;
	  }


	public boolean salvarQuarto(Quarto quarto1) throws QEException
	{
	   	boolean resultado = false;
		if(!listaQuartos.contains(quarto1))
	   	{
		   listaQuartos.add(quarto1);
		   
		   resultado = true;
	   	}
	   	else
	   	{
	   		QEException qee = new QEException(quarto1.getnumeroQuarto(),quarto1.statusQuarto(quarto1.getnumeroQuarto()));
	   		throw qee;
	   	}
		return resultado;

	}

	public boolean deletarQuarto(Quarto quarto1)throws QNException
	{
		boolean resultado = false;
	    if(listaQuartos.contains(quarto1))
			{
				listaQuartos.remove(quarto1);
				resultado = true;

			}
		else
		{
			QNException qne = new QNException(quarto1.getnumeroQuarto(),quarto1.quartovazio(quarto1.getnumeroQuarto()));
	   		throw qne;
		}
	    return resultado;
	}

	public Quarto procurarQuarto(Quarto quarto1)throws QNException //Tem que retornar um quarto
	{

		if(listaQuartos.contains(quarto1))
		{
			return quarto1;
		 }
		else
		{
			QNException qne = new QNException(quarto1.getnumeroQuarto(),quarto1.quartovazio(quarto1.getnumeroQuarto()));
	   		throw qne;
		}

	}

	public boolean atualizarQuarto(Quarto quarto_para_alt, Quarto quarto_alt) throws QEException, QNException
	{
		boolean resultado = false;
		if((listaQuartos.contains(quarto_para_alt)))
		{

			listaQuartos.remove(quarto_para_alt);

			if(!listaQuartos.contains(quarto_alt))
		{
		  listaQuartos.add(quarto_alt);
		  resultado = true;
		}
			else
			{
				QEException qee = new QEException(quarto_alt.getnumeroQuarto(),quarto_alt.statusQuarto(quarto_alt.getnumeroQuarto()));
		   		throw qee;
			}

       }
		else
		{
			QNException qne = new QNException(quarto_para_alt.getnumeroQuarto(),quarto_para_alt.statusQuarto(quarto_alt.getnumeroQuarto()));
	   		throw qne;
		}

		return resultado;
	}

	public boolean existe(Quarto quarto)
	{
		boolean verifica = false;
		for (Quarto quarto2 : listaQuartos) {


				if(quarto2.equals(quarto))
				{
	                   verifica = true;

		     	}
		}



		return verifica;
	}

	public boolean remover(Quarto quarto)
	{
		boolean verifica = false;
		for (Quarto quarto2 : listaQuartos) {
			if(quarto2.equals(quarto)){
				if(quarto.quartovazio(quarto.getnumeroQuarto()))
			{
			   listaQuartos.remove(quarto);
			   verifica = true;

			}
		}
		}
		return verifica;
	}

	public Quarto procurar(String numeroQuarto)
	{
		Quarto resultado = null;
		for (Quarto quarto2 : listaQuartos) {
			if(quarto2.statusQuarto(numeroQuarto))
			{
				 resultado = quarto2;

			}
		}
		return resultado;
		}


	public List<Quarto> listarQuartos() {

		return Collections.unmodifiableList(this.listaQuartos);
	}

	@Override
	public void salvarArquivo() {

		if (instance == null) {
		      return;
		    }

		    File arqquarto = new File("RepositorioQuarto.dat");
		    FileOutputStream fos = null;
		    ObjectOutputStream oos = null;

		    try {
		      fos = new FileOutputStream(arqquarto);
		      oos = new ObjectOutputStream(fos);
		      oos.writeObject(instance);
		    } catch (Exception e) {
		      e.printStackTrace();
		    } finally {
		      if (oos != null) {
		        try {
		          oos.close();
		        } catch (IOException e) {
		          }
		      }
		    }
		  }



	private static RepositorioQuarto lerDoArquivo() {
		RepositorioQuarto instanciaLocal = null;

	    File arqquarto = new File("RepositorioQuarto.dat");
	    FileInputStream fis = null;
	    ObjectInputStream ois = null;
	    try {
	      fis = new FileInputStream(arqquarto);
	      ois = new ObjectInputStream(fis);
	      Object o = ois.readObject();
	      instanciaLocal = (RepositorioQuarto) o;
	    } catch (Exception e) {
	      instanciaLocal = new RepositorioQuarto();
	    } finally {
	      if (ois != null) {
	        try {
	          ois.close();
	        } catch (IOException e) {
	        }
	      }
	    }

	    return instanciaLocal;
	  }
	}











