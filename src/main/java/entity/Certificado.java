package entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Certificado implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer id;
	private Boolean aflotoxinNegativeCertificate;
	private Boolean pmaCertificate;
	private Boolean quantityCertificate;
	private Boolean analisysCertificate;
	private Boolean packingDeclarationDertificateCertificate;
	private Boolean quantityQualityCertificate;
	private Boolean containerInspectionChecklistCertificate;
	private Boolean packingListCertificate;
	private Boolean radiometricsAnalysisCertificate;
	private Boolean fumigationCertificate;
	private Boolean packinglistTareCertificate;
	private Boolean surveyCertificate;
	private Boolean gmoCertificate;
	private Boolean phitossanitaryCertificate;
	private Boolean tareCertificate;
	private Boolean healthCertificate;
	private Boolean physicalCertificate;
	private Boolean weightCertificate;
	private Boolean ingredientsCertificate;
	private Boolean wqpmqaCertificate;
	private Boolean weightNoteCertificate;
	private Boolean loadingCertificate;
	private Boolean qqwpmCertificate;
	private Boolean weightnotePackingListCertificate;
	private Boolean ochratoxineCertificate;
	private Boolean qualityCertificate;
	private Boolean weightQualityCertificate;
	private Boolean camaraArabe;
	private Boolean camara;
	private Boolean pesticide;
	private Boolean ico;
	private Boolean bl;

	public Certificado() {
	}

	public Certificado(Integer id, Boolean aflotoxinNegativeCertificate, Boolean pmaCertificate,
			Boolean quantityCertificate, Boolean analisysCertificate, Boolean packingDeclarationDertificateCertificate,
			Boolean quantityQualityCertificate, Boolean containerInspectionChecklistCertificate,
			Boolean packingListCertificate, Boolean radiometricsAnalysisCertificate, Boolean fumigationCertificate,
			Boolean packinglistTareCertificate, Boolean surveyCertificate, Boolean gmoCertificate,
			Boolean phitossanitaryCertificate, Boolean tareCertificate, Boolean healthCertificate,
			Boolean physicalCertificate, Boolean weightCertificate, Boolean ingredientsCertificate,
			Boolean wqpmqaCertificate, Boolean weightNoteCertificate, Boolean loadingCertificate,
			Boolean qqwpmCertificate, Boolean weightnotePackingListCertificate, Boolean ochratoxineCertificate,
			Boolean qualityCertificate, Boolean weightQualityCertificate, Boolean camaraArabe, Boolean camara,
			Boolean pesticide, Boolean ico, Boolean bl) {

		this.id = id;
		this.aflotoxinNegativeCertificate = aflotoxinNegativeCertificate;
		this.pmaCertificate = pmaCertificate;
		this.quantityCertificate = quantityCertificate;
		this.analisysCertificate = analisysCertificate;
		this.packingDeclarationDertificateCertificate = packingDeclarationDertificateCertificate;
		this.quantityQualityCertificate = quantityQualityCertificate;
		this.containerInspectionChecklistCertificate = containerInspectionChecklistCertificate;
		this.packingListCertificate = packingListCertificate;
		this.radiometricsAnalysisCertificate = radiometricsAnalysisCertificate;
		this.fumigationCertificate = fumigationCertificate;
		this.packinglistTareCertificate = packinglistTareCertificate;
		this.surveyCertificate = surveyCertificate;
		this.gmoCertificate = gmoCertificate;
		this.phitossanitaryCertificate = phitossanitaryCertificate;
		this.tareCertificate = tareCertificate;
		this.healthCertificate = healthCertificate;
		this.physicalCertificate = physicalCertificate;
		this.weightCertificate = weightCertificate;
		this.ingredientsCertificate = ingredientsCertificate;
		this.wqpmqaCertificate = wqpmqaCertificate;
		this.weightNoteCertificate = weightNoteCertificate;
		this.loadingCertificate = loadingCertificate;
		this.qqwpmCertificate = qqwpmCertificate;
		this.weightnotePackingListCertificate = weightnotePackingListCertificate;
		this.ochratoxineCertificate = ochratoxineCertificate;
		this.qualityCertificate = qualityCertificate;
		this.weightQualityCertificate = weightQualityCertificate;
		this.camaraArabe = camaraArabe;
		this.camara = camara;
		this.pesticide = pesticide;
		this.ico = ico;
		this.bl = bl;
	}

	@Override
	public String toString() {
		return "Certificado [id=" + id + ", aflotoxinNegativeCertificate="
				+ aflotoxinNegativeCertificate + ", pmaCertificate=" + pmaCertificate + ", quantityCertificate="
				+ quantityCertificate + ", analisysCertificate=" + analisysCertificate
				+ ", packingDeclarationDertificateCertificate=" + packingDeclarationDertificateCertificate
				+ ", quantityQualityCertificate=" + quantityQualityCertificate
				+ ", containerInspectionChecklistCertificate=" + containerInspectionChecklistCertificate
				+ ", packingListCertificate=" + packingListCertificate + ", radiometricsAnalysisCertificate="
				+ radiometricsAnalysisCertificate + ", fumigationCertificate=" + fumigationCertificate
				+ ", packinglistTareCertificate=" + packinglistTareCertificate + ", surveyCertificate="
				+ surveyCertificate + ", gmoCertificate=" + gmoCertificate + ", phitossanitaryCertificate="
				+ phitossanitaryCertificate + ", tareCertificate=" + tareCertificate + ", healthCertificate="
				+ healthCertificate + ", physicalCertificate=" + physicalCertificate + ", weightCertificate="
				+ weightCertificate + ", ingredientsCertificate=" + ingredientsCertificate + ", wqpmqaCertificate="
				+ wqpmqaCertificate + ", weightNoteCertificate=" + weightNoteCertificate + ", loadingCertificate="
				+ loadingCertificate + ", qqwpmCertificate=" + qqwpmCertificate + ", weightnotePackingListCertificate="
				+ weightnotePackingListCertificate + ", ochratoxineCertificate=" + ochratoxineCertificate
				+ ", qualityCertificate=" + qualityCertificate + ", weightQualityCertificate="
				+ weightQualityCertificate + ", camaraArabe=" + camaraArabe + ", camara=" + camara + ", pesticide="
				+ pesticide + ", ico=" + ico + ", bl=" + bl + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getAflotoxinNegativeCertificate() {
		return aflotoxinNegativeCertificate;
	}

	public void setAflotoxinNegativeCertificate(Boolean aflotoxinNegativeCertificate) {
		this.aflotoxinNegativeCertificate = aflotoxinNegativeCertificate;
	}

	public Boolean getPmaCertificate() {
		return pmaCertificate;
	}

	public void setPmaCertificate(Boolean pmaCertificate) {
		this.pmaCertificate = pmaCertificate;
	}

	public Boolean getQuantityCertificate() {
		return quantityCertificate;
	}

	public void setQuantityCertificate(Boolean quantityCertificate) {
		this.quantityCertificate = quantityCertificate;
	}

	public Boolean getAnalisysCertificate() {
		return analisysCertificate;
	}

	public void setAnalisysCertificate(Boolean analisysCertificate) {
		this.analisysCertificate = analisysCertificate;
	}

	public Boolean getPackingDeclarationDertificateCertificate() {
		return packingDeclarationDertificateCertificate;
	}

	public void setPackingDeclarationDertificateCertificate(Boolean packingDeclarationDertificateCertificate) {
		this.packingDeclarationDertificateCertificate = packingDeclarationDertificateCertificate;
	}

	public Boolean getQuantityQualityCertificate() {
		return quantityQualityCertificate;
	}

	public void setQuantityQualityCertificate(Boolean quantityQualityCertificate) {
		this.quantityQualityCertificate = quantityQualityCertificate;
	}

	public Boolean getContainerInspectionChecklistCertificate() {
		return containerInspectionChecklistCertificate;
	}

	public void setContainerInspectionChecklistCertificate(Boolean containerInspectionChecklistCertificate) {
		this.containerInspectionChecklistCertificate = containerInspectionChecklistCertificate;
	}

	public Boolean getPackingListCertificate() {
		return packingListCertificate;
	}

	public void setPackingListCertificate(Boolean packingListCertificate) {
		this.packingListCertificate = packingListCertificate;
	}

	public Boolean getRadiometricsAnalysisCertificate() {
		return radiometricsAnalysisCertificate;
	}

	public void setRadiometricsAnalysisCertificate(Boolean radiometricsAnalysisCertificate) {
		this.radiometricsAnalysisCertificate = radiometricsAnalysisCertificate;
	}

	public Boolean getFumigationCertificate() {
		return fumigationCertificate;
	}

	public void setFumigationCertificate(Boolean fumigationCertificate) {
		this.fumigationCertificate = fumigationCertificate;
	}

	public Boolean getPackinglistTareCertificate() {
		return packinglistTareCertificate;
	}

	public void setPackinglistTareCertificate(Boolean packinglistTareCertificate) {
		this.packinglistTareCertificate = packinglistTareCertificate;
	}

	public Boolean getSurveyCertificate() {
		return surveyCertificate;
	}

	public void setSurveyCertificate(Boolean surveyCertificate) {
		this.surveyCertificate = surveyCertificate;
	}

	public Boolean getGmoCertificate() {
		return gmoCertificate;
	}

	public void setGmoCertificate(Boolean gmoCertificate) {
		this.gmoCertificate = gmoCertificate;
	}

	public Boolean getPhitossanitaryCertificate() {
		return phitossanitaryCertificate;
	}

	public void setPhitossanitaryCertificate(Boolean phitossanitaryCertificate) {
		this.phitossanitaryCertificate = phitossanitaryCertificate;
	}

	public Boolean getTareCertificate() {
		return tareCertificate;
	}

	public void setTareCertificate(Boolean tareCertificate) {
		this.tareCertificate = tareCertificate;
	}

	public Boolean getHealthCertificate() {
		return healthCertificate;
	}

	public void setHealthCertificate(Boolean healthCertificate) {
		this.healthCertificate = healthCertificate;
	}

	public Boolean getPhysicalCertificate() {
		return physicalCertificate;
	}

	public void setPhysicalCertificate(Boolean physicalCertificate) {
		this.physicalCertificate = physicalCertificate;
	}

	public Boolean getWeightCertificate() {
		return weightCertificate;
	}

	public void setWeightCertificate(Boolean weightCertificate) {
		this.weightCertificate = weightCertificate;
	}

	public Boolean getIngredientsCertificate() {
		return ingredientsCertificate;
	}

	public void setIngredientsCertificate(Boolean ingredientsCertificate) {
		this.ingredientsCertificate = ingredientsCertificate;
	}

	public Boolean getWqpmqaCertificate() {
		return wqpmqaCertificate;
	}

	public void setWqpmqaCertificate(Boolean wqpmqaCertificate) {
		this.wqpmqaCertificate = wqpmqaCertificate;
	}

	public Boolean getWeightNoteCertificate() {
		return weightNoteCertificate;
	}

	public void setWeightNoteCertificate(Boolean weightNoteCertificate) {
		this.weightNoteCertificate = weightNoteCertificate;
	}

	public Boolean getLoadingCertificate() {
		return loadingCertificate;
	}

	public void setLoadingCertificate(Boolean loadingCertificate) {
		this.loadingCertificate = loadingCertificate;
	}

	public Boolean getQqwpmCertificate() {
		return qqwpmCertificate;
	}

	public void setQqwpmCertificate(Boolean qqwpmCertificate) {
		this.qqwpmCertificate = qqwpmCertificate;
	}

	public Boolean getWeightnotePackingListCertificate() {
		return weightnotePackingListCertificate;
	}

	public void setWeightnotePackingListCertificate(Boolean weightnotePackingListCertificate) {
		this.weightnotePackingListCertificate = weightnotePackingListCertificate;
	}

	public Boolean getOchratoxineCertificate() {
		return ochratoxineCertificate;
	}

	public void setOchratoxineCertificate(Boolean ochratoxineCertificate) {
		this.ochratoxineCertificate = ochratoxineCertificate;
	}

	public Boolean getQualityCertificate() {
		return qualityCertificate;
	}

	public void setQualityCertificate(Boolean qualityCertificate) {
		this.qualityCertificate = qualityCertificate;
	}

	public Boolean getWeightQualityCertificate() {
		return weightQualityCertificate;
	}

	public void setWeightQualityCertificate(Boolean weightQualityCertificate) {
		this.weightQualityCertificate = weightQualityCertificate;
	}

	public Boolean getCamaraArabe() {
		return camaraArabe;
	}

	public void setCamaraArabe(Boolean camaraArabe) {
		this.camaraArabe = camaraArabe;
	}

	public Boolean getCamara() {
		return camara;
	}

	public void setCamara(Boolean camara) {
		this.camara = camara;
	}

	public Boolean getPesticide() {
		return pesticide;
	}

	public void setPesticide(Boolean pesticide) {
		this.pesticide = pesticide;
	}

	public Boolean getIco() {
		return ico;
	}

	public void setIco(Boolean ico) {
		this.ico = ico;
	}

	public Boolean getBl() {
		return bl;
	}

	public void setBl(Boolean bl) {
		this.bl = bl;
	}

}
