package entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Container implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
 	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String numeroContainer;
	private String tare;
	private String seals;
	private String seals2;
	private String oicMarks;
	private String contrato;
	
	
	public Container() {
	}


	public Container(Integer id, String numeroContainer, String tare, String seals, String seals2, String oicMarks,
			String contrato) {
		super();
		this.id = id;
		this.numeroContainer = numeroContainer;
		this.tare = tare;
		this.seals = seals;
		this.seals2 = seals2;
		this.oicMarks = oicMarks;
		this.contrato = contrato;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNumeroContainer() {
		return numeroContainer;
	}


	public void setNumeroContainer(String numeroContainer) {
		this.numeroContainer = numeroContainer;
	}


	public String getTare() {
		return tare;
	}


	public void setTare(String tare) {
		this.tare = tare;
	}


	public String getSeals() {
		return seals;
	}


	public void setSeals(String seals) {
		this.seals = seals;
	}


	public String getSeals2() {
		return seals2;
	}


	public void setSeals2(String seals2) {
		this.seals2 = seals2;
	}


	public String getOicMarks() {
		return oicMarks;
	}


	public void setOicMarks(String oicMarks) {
		this.oicMarks = oicMarks;
	}


	public String getContrato() {
		return contrato;
	}


	public void setContrato(String contrato) {
		this.contrato = contrato;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Container [id=" + id + ", numeroContainer=" + numeroContainer + ", tare=" + tare + ", seals=" + seals
				+ ", seals2=" + seals2 + ", oicMarks=" + oicMarks + ", contrato=" + contrato + "]";
	}





}
