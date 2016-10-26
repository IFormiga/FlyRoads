package dados;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import negocio.Empresa;




public class RepositorioEmpresa implements IRepositorioEmpresa{


	private List<Empresa> listaEmpresa;
	private static RepositorioEmpresa instancia;

	private RepositorioEmpresa(){
            this.listaEmpresa = new ArrayList<Empresa>();
	}

	public static RepositorioEmpresa getInstance() {

		if(instancia == null){
			instancia = new RepositorioEmpresa();
		}
	    return instancia;
	  }

	public void cadastrarEmpresa(Empresa empresa1){
	   	if(empresa1 != null){
           if(listaEmpresa.contains(empresa1) == false){
        	   listaEmpresa.add(empresa1);
           }

	   	}
	}

	public void deletarEmpresa(Empresa empresa1)
	{
	    if(listaEmpresa.contains(empresa1))
			{
	    	    listaEmpresa.remove(empresa1);
			}

	}

	public Empresa procurarEmpresa(String nome_da_empresa, String cnpj){
		String cnpj2;
		Empresa r = null;
		for(Empresa empresa2 : this.listaEmpresa){
			cnpj2 = empresa2.getCnpj();
			if(cnpj2.equals(cnpj)){
				r = empresa2;
			}
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
	
	public List<Empresa> listar(){
		return Collections.unmodifiableList(this.listaEmpresa);
	}


}

