package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable{
 	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private Integer idUsuario;
	@Column 
	private String  nome;
	@Column 
	private String  login;
	@Column 
	private String  senha;
	@Column
	private String  perfil;
	@Column
	private Boolean ativo;
	
	public Usuario() {
	}

	public Usuario(Integer idUsuario, String nome, String login, String senha, String perfil, Boolean ativo) {
		super();
		this.idUsuario = idUsuario;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.perfil = perfil;
		this.ativo = ativo;
	}


	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nome=" + nome + ", login=" + login + ", senha=" + senha
				+ ", perfil=" + perfil + ", ativo=" + ativo + "]";
	}


	public Integer getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getPerfil() {
		return perfil;
	}


	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}


	public Boolean getAtivo() {
		return ativo;
	}


	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	
}