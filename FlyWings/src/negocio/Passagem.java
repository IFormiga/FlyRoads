package negocio;


public class Passagem {
	private String codigo;
	private Usuario user;
	private Voo flight;
	private String assento;
	
	public Passagem(String codigo,Usuario user,Voo flight,String assento){
		this.codigo = codigo;
		this.user = user;
		this.flight = flight;
		this.assento = assento;
	}
	
	public void setAssento(String assento){
		flight.escolherAssento(assento);
	}
	
	public String getAssento(){
		return this.assento;
	}
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}

	public Voo getFlight() {
		return flight;
	}

	public void setFlight(Voo flight) {
		this.flight = flight;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Passagem other = (Passagem) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (flight == null) {
			if (other.flight != null)
				return false;
		} else if (!flight.equals(other.flight))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Passagem [codigo=" + codigo + ", user=" + user + ", flight=" + flight + "]";
	}
	 
}
