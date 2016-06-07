package dados;

import java.util.ArrayList;
import java.util.List;

import exceptions.QEException;
import exceptions.QNException;
import negocio.Quarto;


public class RepositorioQuarto implements IRepositorioQuarto {

	public List<Quarto> listaQuartos = new ArrayList<Quarto>();
	
	//Criar um método listarQuartos
	
	public boolean SalvarQuarto(Quarto quarto1) throws QEException
	{
	   	boolean resultado = false;
		if(!listaQuartos.contains(quarto1))
	   	{
		   listaQuartos.add(quarto1);
		   resultado = true;
	   	}
	   	else
	   	{
	   		QEException qee = new QEException(quarto1.getNumero_quarto(),quarto1.Status_Quarto(quarto1.getNumero_quarto()));
	   		throw qee;
	   	}
		return resultado;
	   		
	}
	
	public boolean DeletarQuarto(Quarto quarto1)throws QNException
	{
		boolean resultado = false;
	    if(listaQuartos.contains(quarto1))
			{
				listaQuartos.remove(quarto1);
				resultado = true;
				
			}
		else
		{
			QNException qne = new QNException(quarto1.getNumero_quarto(),quarto1.status_quarto);
	   		throw qne;
		}
	    return resultado;
	}
	
	public Quarto ProcurarQuarto(Quarto quarto1)throws QNException //Tem que retornar um quarto
	{
		
		if(listaQuartos.contains(quarto1))
		{
			return quarto1;
		 }
		else
		{
			QNException qne = new QNException(quarto1.getNumero_quarto(),quarto1.status_quarto);
	   		throw qne;
		}
		
	}
	
	public boolean AtualizarQuarto(Quarto quarto_para_alt, Quarto quarto_alt) throws QEException, QNException
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
				QEException qee = new QEException(quarto_alt.getNumero_quarto(),quarto_alt.status_quarto);
		   		throw qee;
			}
		
       }
		else
		{
			QNException qne = new QNException(quarto_para_alt.getNumero_quarto(),quarto_para_alt.status_quarto);
	   		throw qne;
		}
	
		return resultado;
	} 
	
	public boolean existe(String numero_quarto)
	{
		boolean verifica = false;
		for (Quarto quarto : listaQuartos) 
		{
			if(quarto.Status_Quarto(numero_quarto))
			{
                   verifica = true;
                   return verifica;
	     	}
	}
		return verifica;
	}
	
	public boolean remover(String numero_quarto)
	{
		boolean verifica = false;
		for (Quarto quarto : listaQuartos) {
			if(quarto.quartovazio(numero_quarto))
			{
			   listaQuartos.remove(quarto);
			   verifica = true;
			   return verifica;
			}
		}
		return verifica;
	}
	
	public Quarto procurar(String numero_quarto) 
	{
		Quarto resultado = null;
		for (Quarto quarto : listaQuartos) {
			if(this.existe(numero_quarto))
			{
				 resultado = quarto;
				 return resultado;
			}
		}
		return resultado;
		}
		
	}
	
	
	
	
	

