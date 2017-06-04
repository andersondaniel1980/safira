package entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

@Entity
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(unique=true)
	private String nomeEmpresa;
//	@Pattern(regexp="[A-Za-z0-9]+@[A-Za-z0-9]+\\.[a-z]+?\\.?[a-z]+",message="Favor preencher o E-mail da empresa")

	private String emailEmpresa;

	private String nomeContato;
//	@Pattern(regexp="[A-Za-z0-9]+@[A-Za-z0-9]+\\.[a-z]+?\\.?[a-z]+",message="Favor preencher o o e-mail do contato")

	private String emailContato;

	private String cnpj;

	private String telefone;

	private String tipo;

	private Double valorPadrao;

	@Lob @Basic(fetch=FetchType.LAZY)
	@Column(name="observacao")
	private String observacao;
	
		@JoinColumn(name = "endereco_id", referencedColumnName = "id")
	    @OneToOne(optional = false, fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	    private Endereco endereco;
	 
	public Cliente() {
	}
	
	public Cliente(Integer id) {
		this.id = id;
	}

	public Cliente(Integer id, String nomeEmpresa, String emailEmpresa, String nomeContato, String emailContato,
			String cnpj, String telefone, String tipo, Double valorPadrao, String observacao, Endereco endereco) {
		this.id = id;
		this.nomeEmpresa = nomeEmpresa;
		this.emailEmpresa = emailEmpresa;
		this.nomeContato = nomeContato;
		this.emailContato = emailContato;
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.tipo = tipo;
		this.valorPadrao = valorPadrao;
		this.observacao = observacao;
		this.endereco = endereco;
	}
	
	

	public Cliente(Integer id, String nomeEmpresa, String emailEmpresa, String nomeContato, String emailContato,
			String cnpj, String telefone, String tipo, Double valorPadrao, String observacao) {
		this.id = id;
		this.nomeEmpresa = nomeEmpresa;
		this.emailEmpresa = emailEmpresa;
		this.nomeContato = nomeContato;
		this.emailContato = emailContato;
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.tipo = tipo;
		this.valorPadrao = valorPadrao;
		this.observacao = observacao;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getEmailEmpresa() {
		return emailEmpresa;
	}

	public void setEmailEmpresa(String emailEmpresa) {
		this.emailEmpresa = emailEmpresa;
	}

	public String getNomeContato() {
		return nomeContato;
	}

	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}

	public String getEmailContato() {
		return emailContato;
	}

	public void setEmailContato(String emailContato) {
		this.emailContato = emailContato;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getValorPadrao() {
		return valorPadrao;
	}

	public void setValorPadrao(Double valorPadrao) {
		this.valorPadrao = valorPadrao;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return nomeEmpresa;
	}

	public Integer getId() {
		return id;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
		result = prime * result + ((emailContato == null) ? 0 : emailContato.hashCode());
		result = prime * result + ((emailEmpresa == null) ? 0 : emailEmpresa.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nomeContato == null) ? 0 : nomeContato.hashCode());
		result = prime * result + ((nomeEmpresa == null) ? 0 : nomeEmpresa.hashCode());
		result = prime * result + ((observacao == null) ? 0 : observacao.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		result = prime * result + ((valorPadrao == null) ? 0 : valorPadrao.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		if (emailContato == null) {
			if (other.emailContato != null)
				return false;
		} else if (!emailContato.equals(other.emailContato))
			return false;
		if (emailEmpresa == null) {
			if (other.emailEmpresa != null)
				return false;
		} else if (!emailEmpresa.equals(other.emailEmpresa))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nomeContato == null) {
			if (other.nomeContato != null)
				return false;
		} else if (!nomeContato.equals(other.nomeContato))
			return false;
		if (nomeEmpresa == null) {
			if (other.nomeEmpresa != null)
				return false;
		} else if (!nomeEmpresa.equals(other.nomeEmpresa))
			return false;
		if (observacao == null) {
			if (other.observacao != null)
				return false;
		} else if (!observacao.equals(other.observacao))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		if (valorPadrao == null) {
			if (other.valorPadrao != null)
				return false;
		} else if (!valorPadrao.equals(other.valorPadrao))
			return false;
		return true;
	}

	

}
