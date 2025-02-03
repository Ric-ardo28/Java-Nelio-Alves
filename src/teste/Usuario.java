package teste;

public class Usuario {
	private String nome;
	private String email;
	private String jogoFavorito;

	public Usuario(String nome, String email, String jogoFavorito) {
		this.nome = nome;
		this.email = email;
		this.jogoFavorito = jogoFavorito;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJogoFavorito() {
		return jogoFavorito;
	}

	public void setJogoFavorito(String jogoFavorito) {
		this.jogoFavorito = jogoFavorito;
	}

	@Override
	public String toString() {
		return "Usuario{" +
				"nome='" + nome + '\'' +
				", email='" + email + '\'' +
				", jogoFavorito='" + jogoFavorito + '\'' +
				'}';
	}
}
