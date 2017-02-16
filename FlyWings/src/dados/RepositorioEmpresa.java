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

	public void inserir(Empresa empresa1){
	   	if(empresa1 != null){
           if(listaEmpresa.contains(empresa1) == false){
        	   listaEmpresa.add(empresa1);
           }

	   	}
	}

	public void deletar(Empresa empresa1)
	{
	    if(listaEmpresa.contains(empresa1))
			{
	    	    listaEmpresa.remove(empresa1);
			}

	}

	public Empresa procurarEmpresa(String nomeDaEmpresa, String cnpj){
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

	public boolean atualizar(Empresa empresaAlt)
	{

		boolean r = false;
		if(listaEmpresa.contains(empresaAlt) == false)
		{
			for (Empresa empresa : listaEmpresa) {
				if(empresa.getCnpj() == empresaAlt.getCnpj()){
					listaEmpresa.remove(empresa);
					listaEmpresa.add(empresaAlt);
					r = true;
				}
			}


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

