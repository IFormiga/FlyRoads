package negocio;

public class Usuario extends Pessoa {
	private String nick;
	private String senha;
	private String dica_de_senha; //Podemos consertar o problema de Usuário mestre com um booleano de autenticação
	private boolean confirmacao = false;
	static String senha_mestre = "123456";
	
	public Usuario(String nome, String cpf, int idade, String endereço, String sexo, String nick, String senha, String dica_de_senha){
		super(nome,cpf,idade,endereço,sexo);
		this.setNick(nick);
		this.senha = senha;
		this.verificaHierarquia(senha);
		this.setDica(dica_de_senha);
	}
	public void verificaHierarquia(String senha){
		boolean r = false;
		if(senha.equals(Usuario.senha_mestre)){
		r = true;
		}
		this.confirmacao = r;
	}
	public String getNick(){
		return this.nick;
	}
	public String getDica(){
		return this.dica_de_senha;
	}
	public void setNick(String nick){
		this.nick = nick;
	}
	public void setDica(String dica_de_senha){
		this.dica_de_senha = dica_de_senha;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (dica_de_senha == null) {
			if (other.dica_de_senha != null)
				return false;
		} else if (!dica_de_senha.equals(other.dica_de_senha))
			return false;
		if (nick == null) {
			if (other.nick != null)
				return false;
		} else if (!nick.equals(other.nick))
			return false;
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else if (!senha.equals(other.senha))
			return false;
		return true;
	}
	
}
