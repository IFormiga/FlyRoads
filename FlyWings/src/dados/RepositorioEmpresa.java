package dados;
import java.util.ArrayList;
import java.util.List;

import exceptions.EEException;
import exceptions.ENException;
import negocio.Empresa;




public class RepositorioEmpresa implements IRepositorioEmpresa{


	private List<Empresa> listaEmpresa = new ArrayList<Empresa>();
	private static RepositorioEmpresa instancia = new RepositorioEmpresa();

	private RepositorioEmpresa()
	{

	}

	public static RepositorioEmpresa getInstance() {

	    return instancia;
	  }

	public void cadastrarEmpresa(Empresa empresa1)throws EEException
	{
	   	if(empresa1 != null)
	   	{
           if(listaEmpresa.contains(empresa1))
           {
        	   EEException eee = new EEException(empresa1.getNomeEmpresa(), empresa1.getCnpj());
 	   		   throw eee;
           }
           listaEmpresa.add(empresa1);
	   	}
	}

	public void deletarEmpresa(Empresa empresa1)throws ENException
	{
	    if(listaEmpresa.contains(empresa1))
			{
	    	    listaEmpresa.remove(empresa1);
			}
	    else if(!listaEmpresa.contains(empresa1))
	    {
	    	ENException ene = new ENException(empresa1.getNomeEmpresa(), empresa1.getCnpj());
	   		   throw ene;
	    }
	}

	public Empresa procurarEmpresa(String nome_da_empresa, String cnpj)throws ENException{
		String cnpj2;
		Empresa r = null;
		for(Empresa empresa2 : this.listaEmpresa){
			cnpj2 = empresa2.getCnpj();
			if(cnpj2.equals(cnpj)){
				r = empresa2;
			}
		}
			if(r == null){
			ENException ene = new ENException(nome_da_empresa, cnpj);
	   		throw ene;
		}
		return r;
	}

	public boolean atualizarEmpresa(Empresa empresa_para_alt, Empresa emp_alt)
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

	public boolean existeEmpresa(String cnpj) {
		boolean r = false;
		String cnpj2;
		for(Empresa empresa2 : this.listaEmpresa){
			cnpj2 = empresa2.getCnpj();
			if(cnpj2.equals(cnpj)){
				r = true;
			}
		}
		return r;
	}



}

