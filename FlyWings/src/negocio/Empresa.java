package negocio;

public class Empresa {

	public String nome_empresa;
	public String cnpj;
	public String ramo;
	
	public Empresa(String nome_empresa, String cnpj, String ramo){
		this.nome_empresa = nome_empresa;
		this.cnpj = cnpj;
	}
	
	public String getRamo() {
		return ramo;
	}

	public void setRamo(String ramo) {
		this.ramo = ramo;
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
		return "Empresa [nome_empresa=" + nome_empresa + ", cnpj=" + cnpj + ", ramo=" + ramo + "]";
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		if (nome_empresa == null) {
			if (other.nome_empresa != null)
				return false;
		} else if (!nome_empresa.equals(other.nome_empresa))
			return false;
		if (ramo == null) {
			if (other.ramo != null)
				return false;
		} else if (!ramo.equals(other.ramo))
			return false;
		return true;
	}
}