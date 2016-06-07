package dados;

import java.util.ArrayList;
import java.util.List;

import exceptions.QEException;
import exceptions.QNException;
import negocio.Quarto;


public class RepositorioQuarto {

	public List<Quarto> listaQuartos = new ArrayList<Quarto>();
	
	//Criar um método listarQuartos
	
	public void SalvarQuarto(Quarto quarto1) throws QEException
	{
	   	if(!listaQuartos.contains(quarto1))
	   	{
		   listaQuartos.add(quarto1);
	   	}
	   	else
	   	{
	   		QEException qee = new QEException(quarto1.getNumero_quarto(),quarto1.Status_Quarto(quarto1.getNumero_quarto()));
	   		throw qee;
	   	}
	   		
	}
	
	public void DeletarQuarto(Quarto quarto1)throws QNException
	{
		
	    if(listaQuartos.contains(quarto1))
			{
				listaQuartos.remove(quarto1);
				
			}
		else
		{
			QNException qne = new QNException(quarto1.getNumero_quarto(),quarto1.status_quarto);
	   		throw qne;
		}
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
	
	public void AtualizarQuarto(Quarto quarto_para_alt, Quarto quarto_alt) throws QEException, QNException
	{
		
		if((listaQuartos.contains(quarto_para_alt)))
		{
		
			listaQuartos.remove(quarto_para_alt);
		
			if(!listaQuartos.contains(quarto_alt))
		{
		  listaQuartos.add(quarto_alt);
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
	
	
	
	
	
	
}
