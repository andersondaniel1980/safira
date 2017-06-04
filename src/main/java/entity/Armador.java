package entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Armador implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(unique = true)
	private String nome;

	@Column(unique = true)
	private String cnpj;

	@JoinColumn(name = "dadosBancario_id", referencedColumnName = "id")
    @OneToOne(optional = false, fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	private DadosBancario banco;

	public Armador() {
	}

	public Armador(Integer id) {
		this.id = id;
	}
	
	public Armador(Integer id, String nome, String cnpj, DadosBancario banco) {
		super();
		this.id = id;
		this.nome = nome;
		this.cnpj = cnpj;
		this.banco = banco;
	}

	public Armador(Integer id, String nome, String cnpj) {
		super();
		this.id = id;
		this.nome = nome;
		this.cnpj = cnpj;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public DadosBancario getBanco() {
		return banco;
	}

	public void setBanco(DadosBancario banco) {
		this.banco = banco;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((banco == null) ? 0 : banco.hashCode());
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Armador other = (Armador) obj;
		if (banco == null) {
			if (other.banco != null)
				return false;
		} else if (!banco.equals(other.banco))
			return false;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	
	
}
