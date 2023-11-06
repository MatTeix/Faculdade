package entities;

public class User {
	
	private String usuario;
	private String senha;
	private String permisao;
	
	public User(String usuario, String senha, String permisao) {
		this.usuario = usuario;
		this.senha = senha;
		this.permisao = permisao;
	}
	
	
	public User(String usuario, String senha) {
		super();
		this.usuario = usuario;
		this.senha = senha;
		this.permisao = "CLIENT";
	}



	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getPermisao() {
		return permisao;
	}

	public void setPermisao(String permisao) {
		this.permisao = permisao;
	}
	
	
	
}
