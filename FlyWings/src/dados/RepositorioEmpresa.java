package dados;
import java.util.ArrayList;
import java.util.List;

import exceptions.EEException;
import exceptions.ENException;
import negocio.Empresa;




public class RepositorioEmpresa {

	private List<Empresa> listaEmpresa = new ArrayList<Empresa>();
	
	
	public void SalvarEmpresa(Empresa empresa1)throws EEException
	{
	   	if(empresa1 != null)
	   	{
           if(listaEmpresa.contains(empresa1))
           {
        	   EEException eee = new EEException(empresa1.getNome_empresa(), empresa1.getCnpj());
 	   		   throw eee;
           }
	   		
           listaEmpresa.add(empresa1);
	   	
	   	}
	   	
	}
	
	public void DeletarEmpresa(Empresa empresa1)throws ENException
	{
		
	    if(listaEmpresa.contains(empresa1))
			{
				
	    	    listaEmpresa.remove(empresa1);
			}
	    
	    else if(!listaEmpresa.contains(empresa1))
	    {
	    	ENException ene = new ENException(empresa1.getNome_empresa(), empresa1.getCnpj());
	   		   throw ene;
	    }
			
		
		
	}
	
	public void ProcurarEmpresa(Empresa empresa1)throws ENException
	{
	   
		
			if(listaEmpresa.contains(empresa1))
			{
				
				System.out.println(empresa1.toString());
			}
		
		
		else if(!listaEmpresa.contains(empresa1))
		{
			
			ENException ene = new ENException(empresa1.getNome_empresa(), empresa1.getCnpj());
	   		throw ene;
	   		
		     	
		}
	
	}
	
	public boolean AtualizarEmpresa(Empresa empresa_para_alt, Empresa emp_alt)
	{
		boolean r = false;
		if(listaEmpresa.contains(empresa_para_alt))
		{
			listaEmpresa.remove(empresa_para_alt);
			listaEmpresa.add(emp_alt);
			r = true;
			
			
		}
		
		return r;
	} 
	
	
}

