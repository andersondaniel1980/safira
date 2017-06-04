package entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DadosBancario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column
	private String banco;
	@Column
	private String agencia;
	@Column
	private String contacorrente;
	
	public DadosBancario() {
	}

	public DadosBancario(Integer id, String banco, String agencia, String contacorrente) {
		this.id = id;
		this.banco = banco;
		this.agencia = agencia;
		this.contacorrente = contacorrente;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getContacorrente() {
		return contacorrente;
	}

	public void setContacorrente(String contacorrente) {
		this.contacorrente = contacorrente;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "DadosBancario [id=" + id + ", banco=" + banco + ", agencia=" + agencia + ", contacorrente="
				+ contacorrente + "]";
	}
	
	
	

	
}
