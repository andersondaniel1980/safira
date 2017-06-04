package entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Notify implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column
	private String nomeNotify;
	@Lob
	@Basic(fetch = FetchType.LAZY)
	@Column(name = "notify")
	private String notify;

	public Notify() {
	}

	public String getNotify() {
		return notify;
	}

	public void setNotify(String notify) {
		this.notify = notify;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Notify(Integer id, String nomeNotify, String notify) {
		super();
		this.id = id;
		this.nomeNotify = nomeNotify;
		this.notify = notify;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeNotify() {
		return nomeNotify;
	}

	public void setNomeNotify(String nomeNotify) {
		this.nomeNotify = nomeNotify;
	}

	@Override
	public String toString() {
		return nomeNotify;
	}

}
