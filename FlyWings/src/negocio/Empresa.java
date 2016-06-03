package negocio;

public class Empresa {

	public String nome_empresa;
	public String cnpj;
	
	public Empresa(String nome_empresa, String cnpj){
		this.nome_empresa = nome_empresa;
		this.cnpj = cnpj;
	}
	
	public String getNome_empresa() {
		return nome_empresa;
	}
	public void setNome_empresa(String nome_empresa) {
		this.nome_empresa = nome_empresa;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}	
	
	public String toString() {
		return "Empresa [nome_empresa=" + nome_empresa + ", cnpj=" + cnpj + "]";
	}
	
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		
		if (cnpj != other.cnpj)
			return false;
		return true;
	}	
}