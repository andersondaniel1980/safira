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
public class Estufe  implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
 	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Column(unique=true)
	private String nomeLocal;
	
	@JoinColumn(name = "endereco_id", referencedColumnName = "id" )
    @OneToOne(optional = false, fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    private Endereco endereco;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeLocal() {
		return nomeLocal;
	}

	public void setNomeLocal(String nomeLocal) {
		this.nomeLocal = nomeLocal;
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
	
	public Estufe() {
		// TODO Auto-generated constructor stub
	}

	public Estufe(Integer id, String nomeLocal, Endereco endereco) {
		super();
		this.id = id;
		this.nomeLocal = nomeLocal;
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return nomeLocal;
	}
	
	
	
	
}
