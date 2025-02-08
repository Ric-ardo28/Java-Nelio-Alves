package pooEx11.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	String nome;
	String email;
	Date dataNascimento;

	public Client(String nome, String email, Date dataNascimento) {
		this.nome = nome;
		this.email = email;
		this.dataNascimento = dataNascimento;
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

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return 	nome + " (" + sdf.format(dataNascimento) + ") - " + email;

	}
}
