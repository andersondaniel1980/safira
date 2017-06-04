package entity;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
public class Matriz implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String contratoVenda;
	private String dde;
	@Column(name = "datadde")
	@Temporal(TemporalType.DATE)
	private Date datadde;
	private String contratoBuyer;
	private String tipo;
	private String qtd;
	private String qtdContainer;
	private String tipoContainer;
	private String embarque;
	@Column(name = "chegadaCafeData")
	@Temporal(TemporalType.DATE)
	private Date chegadaCafeData;
	@Column(name = "chegadaCafeHora")
	@Temporal(TemporalType.TIME)
	private Date chegadaCafeHora;
	@Column(name = "dataDeCadastro")
	@Temporal(TemporalType.DATE)
	private Date dataDeCadastro;

	private String marcaOic;
	private String destino;
	private String re;
	private String sd;
	private String navio;
	private String viagem;
	private String booking;

	@Column(name = "eta")
	@Temporal(TemporalType.DATE)
	private Date eta;

	@Column(name = "DataDraft")
	@Temporal(TemporalType.DATE)
	private Date DataDraft;

	@Column(name = "horaDraft")
	@Temporal(TemporalType.TIME)
	private Date HoraDraft;

	@Column(name = "dataCarga")
	@Temporal(TemporalType.DATE)
	private Date dataCarga;

	@Column(name = "horaCarga")
	@Temporal(TemporalType.TIME)
	private Date horaCarga;

	private String terminal; // VERIFICAR COMO VAI FICAR O RELACIONAMENTO

	private String armador;
	private String pais;
	private String porto;
	private String importador;

	private String notify1; // VERIFICAR COMO VAI FICAR O RELACIONAMENTO
	private String enderecoNotify1;

	private String notify2; // VERIFICAR COMO VAI FICAR O RELACIONAMENTO
	private String enderecoNotify2;

	private String notify3; // VERIFICAR COMO VAI FICAR O RELACIONAMENTO
	private String enderecoNotify3;

	private String consignee; // VERIFICAR COMO VAI FICAR O RELACIONAMENTO
	private String enderecoConsignee;
	@Lob
	@Basic(fetch = FetchType.LAZY)
	@Column(name = "descriptionOfGoods")
	private String descriptionOfGoods;
	private String billOfLadingDate;
	@Lob
	@Basic(fetch = FetchType.LAZY)
	@Column(name = "packed")
	private String packed;
	private String quality;
	private String placeOfInspection;
	private String dateOfInspection;
	private String timeLog;
	private String tipoDeQuantidadeParaCertificados;
	@Lob
	@Basic(fetch = FetchType.LAZY)
	@Column(name = "additionalInformation")
	private String additionalInformation;
	private String peloLiquidoKGS;
	private String peloBrutoKGS;
	private Double valorFob;
	@Lob
	@Basic(fetch = FetchType.LAZY)
	@Column(name = "marcas")
	private String marcas;
	private String nfExportacao;

	@Column(name = "dataEmissao")
	@Temporal(TemporalType.DATE)
	private Date dataEmissao;
	private String instrucaoEstufe;

	@Column(name = "dataEstufe")
	@Temporal(TemporalType.DATE)
	private Date dataEstufe;

	private String localEstufe; // VERIFICAR O RELACIONAMENTO

	@Column(name = "dataPresencaDeCarga")
	@Temporal(TemporalType.DATE)
	private Date dataPresencaDeCarga;

	private String terminalDescargaEstufe; // VERIFICAR O RELACIONAMENTO

	private String terminalEmissaoNfPortoEmbarque; // VERIFICAR O RELACIONAMENTO
	@Lob
	@Basic(fetch = FetchType.LAZY)
	@Column(name = "obsPedidocafe")
	private String obsPedidoCafe;

	@Column(name = "dataSAdvice")
	@Temporal(TemporalType.DATE)
	private Date dataSAdvice;

	@Column(name = "dataFinalCertificado")
	@Temporal(TemporalType.DATE)
	private Date dataFinalCertificado;
	private String numeroBL;

	@Column(name = "dataBL")
	@Temporal(TemporalType.DATE)
	private Date dataBL;
	@Lob
	@Basic(fetch = FetchType.LAZY)

	@Column(name = "obsFollowUP")
	private String obsFollowUP;
	private String fumigacao;
	private String fito;
	private String ico;
	private String isf;
	private String liberacao;
	private String draftBL;
	private String prontificacao;
	private String documentoOriginal;

	@Column(name = "dataDocumentoOriginal")
	@Temporal(TemporalType.DATE)
	private Date dataDocumentoOriginal;
	@Lob
	@Basic(fetch = FetchType.LAZY)
	@Column(name = "obsPresencaDeCarga")
	private String obsPresencaDeCarga;

	private String portofDischarge;
	private String blType;

	@Lob
	@Basic(fetch = FetchType.LAZY)
	@Column(name = "cargoDescription")
	private String cargoDescription;

	private String oceanFreight;
	private String paisOceanFreight;
	private String pallets;

	private String ncm;
	private String origemDoCafe;
	private String capatazia;
	private String taxaDeLiberacaodeBL;
	private String lacre;
	private String isps;
	private String lateArrivel;
	private String correcaoDeBl;
	private String reemissaoDeBl;
	private String detention;
	private String frete;
	private String taxaDeTransmissao;
	private String taxaDoDolar;

	@Column(name = "dataFumigacao")
	@Temporal(TemporalType.DATE)
	private Date dataFumigacao;

	@Column(name = "dataDraftBL")
	@Temporal(TemporalType.DATE)
	private Date dataDraftBL;

	@Column(name = "dataVGM")
	@Temporal(TemporalType.DATE)
	private Date dataVGM;

	private String ddeLiberada;

	private String previsaoSaidaNavio;

	@Column(name = "dataRequerimentoICO")
	@Temporal(TemporalType.DATE)
	private Date dataRequerimentoICO;

	@Column(name = "dataISF")
	@Temporal(TemporalType.DATE)
	private Date dataISF;

	@Column(name = "dataRequerimentoFITO")
	@Temporal(TemporalType.DATE)
	private Date dataRequerimentoFITO;

	@Column(name = "dataPedidoPagamento")
	@Temporal(TemporalType.DATE)
	private Date dataPedidoPagamento;

	@Column(name = "dataPagamento")
	@Temporal(TemporalType.DATE)
	private Date dataPagamento;

	@Column(name = "dataRetiradaBL")
	@Temporal(TemporalType.DATE)
	private Date dataRetiradaBL;

	@Column(name = "dataCorrecaoBL")
	@Temporal(TemporalType.DATE)
	private Date dataCorrecaoBL;

	@Column(name = "dataICO")
	@Temporal(TemporalType.DATE)
	private Date dataICO;

	@Column(name = "dataFitoSanitario")
	@Temporal(TemporalType.DATE)
	private Date dataFitoSanitario;

	@Column(name = "dataCamaraComercio")
	@Temporal(TemporalType.DATE)
	private Date dataCamaraComercio;

	@Column(name = "dataCertificadoFumigacao")
	@Temporal(TemporalType.DATE)
	private Date dataCertificadoFumigacao;

	@Column(name = "dataEnviadoAprovacao")
	@Temporal(TemporalType.DATE)
	private Date dataEnviadoAprovacao;

	private String situacaoDocumento;

	@Column(name = "dataCamaraArabe")
	@Temporal(TemporalType.DATE)
	private Date dataCamaraArabe;

	@Column(name = "dataPedirBooking")
	@Temporal(TemporalType.DATE)
	private Date dataPedirBooking;

	@Column(name = "dataPedidoContainer")
	@Temporal(TemporalType.DATE)
	private Date dataPedidoContainer;

	@Column(name = "dataPedidoFumigacao")
	@Temporal(TemporalType.DATE)
	private Date dataPedidoFumigacao;

	@Column(name = "dataFazerReceberRE")
	@Temporal(TemporalType.DATE)
	private Date dataFazerReceberRE;

	@Column(name = "dataFazerMemorando")
	@Temporal(TemporalType.DATE)
	private Date dataFazerMemorando;

	@Column(name = "dataDocsAprovacao")
	@Temporal(TemporalType.DATE)
	private Date dataDocsAprovacao;

	private String certificadoLions;

	@Lob
	@Basic(fetch = FetchType.LAZY)
	@Column(name = "observacaoEmbarque")
	private String observacaoEmbarque;

	@Column(name = "dataLiberacao")
	@Temporal(TemporalType.DATE)
	private Date dataLiberacao;

	@Column(name = "dataProntificacao")
	@Temporal(TemporalType.DATE)
	private Date dataProntificacao;

	@Column(name = "dataPedidoCafe")
	@Temporal(TemporalType.DATE)
	private Date dataPedidoCafe;
	@Column
	private Double qtdFinanceiro;
	
//	@JoinColumn(name = "cliente_id", referencedColumnName = "id")
//    @OneToOne(optional = true, fetch = FetchType.LAZY, cascade=CascadeType.ALL)
	private String cliente; // VERIFICAR COMO IR� FICAR O RELACIONAMENTO DAS TABELAS
	
	@JoinColumn(name = "certificado_id", referencedColumnName = "id")
    @OneToOne(optional = true, fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    private Certificado certificado;
	
	@Transient
	public static String verificaNavio;
	@Transient
	private String verificaCafe;
	@Transient
	private String verificaEstufe;
	@Transient
	private String verificaRE;
	@Transient
	private String verificaDDE;
	@Transient
	private String verificaDataSadvice;

	public String getVerificaNavio() {
		if (eta != null) {
			verificaNavio = "Sim";
		} else {
			verificaNavio = "N�o";
		}
		return verificaNavio;
	}

	public String getVerificaDataSadvice() {
		if (dataSAdvice != null) {
			verificaDataSadvice = "Sim";
		} else {
			verificaDataSadvice = "N�o";
		}
		return verificaDataSadvice;
	}

	public String getVerificaDDE() {
		if (datadde != null) {
			verificaDDE = "Sim";
		} else {
			verificaDDE = "N�o";
		}
		return verificaDDE;
	}

	public String getVerificaCafe() {
		if (chegadaCafeData != null) {
			verificaCafe = "Sim";
		} else {
			verificaCafe = "N�o";
		}
		return verificaCafe;
	}

	public String getVerificaEstufe() {
		if (dataEstufe != null) {
			verificaEstufe = "Sim";
		} else {
			verificaEstufe = "N�o";
		}
		return verificaEstufe;
	}

	public String getVerificaRE() {
		if (re != "") {
			verificaRE = "Sim";
		} else {
			verificaRE = "N�o";
		}
		return verificaRE;
	}

	public String getBillOfLadingDate() {
		return "............-Shipped on board dated .............., 2016";
	}

	


	public void setId(Integer id) {
		this.id = id;
	}

	public String getContratoVenda() {
		return contratoVenda;
	}

	public void setContratoVenda(String contratoVenda) {
		this.contratoVenda = contratoVenda;
	}

	public String getDde() {
		return dde;
	}

	public void setDde(String dde) {
		this.dde = dde;
	}

	public Date getDatadde() {
		return datadde;
	}

	public void setDatadde(Date datadde) {
		this.datadde = datadde;
	}

	public String getContratoBuyer() {
		return contratoBuyer;
	}

	public void setContratoBuyer(String contratoBuyer) {
		this.contratoBuyer = contratoBuyer;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getQtd() {
		return qtd;
	}

	public void setQtd(String qtd) {
		this.qtd = qtd;
	}

	public String getQtdContainer() {
		return qtdContainer;
	}

	public void setQtdContainer(String qtdContainer) {
		this.qtdContainer = qtdContainer;
	}

	public String getTipoContainer() {
		return tipoContainer;
	}

	public void setTipoContainer(String tipoContainer) {
		this.tipoContainer = tipoContainer;
	}

	public String getEmbarque() {
		return embarque;
	}

	public void setEmbarque(String embarque) {
		this.embarque = embarque;
	}

	public Date getChegadaCafeData() {
		return chegadaCafeData;
	}

	public void setChegadaCafeData(Date chegadaCafeData) {
		this.chegadaCafeData = chegadaCafeData;
	}

	public Date getChegadaCafeHora() {
		return chegadaCafeHora;
	}

	public void setChegadaCafeHora(Date chegadaCafeHora) {
		this.chegadaCafeHora = chegadaCafeHora;
	}

	public Date getDataDeCadastro() {
		return dataDeCadastro;
	}

	public void setDataDeCadastro(Date dataDeCadastro) {
		this.dataDeCadastro = dataDeCadastro;
	}

	public String getMarcaOic() {
		return marcaOic;
	}

	public void setMarcaOic(String marcaOic) {
		this.marcaOic = marcaOic;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getRe() {
		return re;
	}

	public void setRe(String re) {
		this.re = re;
	}

	public String getSd() {
		return sd;
	}

	public void setSd(String sd) {
		this.sd = sd;
	}

	public String getNavio() {
		return navio;
	}

	public void setNavio(String navio) {
		this.navio = navio;
	}

	public String getViagem() {
		return viagem;
	}

	public void setViagem(String viagem) {
		this.viagem = viagem;
	}

	public String getBooking() {
		return booking;
	}

	public void setBooking(String booking) {
		this.booking = booking;
	}

	public Date getEta() {
		return eta;
	}

	public void setEta(Date eta) {
		this.eta = eta;
	}

	public Date getDataDraft() {
		return DataDraft;
	}

	public void setDataDraft(Date dataDraft) {
		DataDraft = dataDraft;
	}

	public Date getHoraDraft() {
		return HoraDraft;
	}

	public void setHoraDraft(Date horaDraft) {
		HoraDraft = horaDraft;
	}

	public Date getDataCarga() {
		return dataCarga;
	}

	public void setDataCarga(Date dataCarga) {
		this.dataCarga = dataCarga;
	}

	public Date getHoraCarga() {
		return horaCarga;
	}

	public void setHoraCarga(Date horaCarga) {
		this.horaCarga = horaCarga;
	}

	public String getTerminal() {
		return terminal;
	}

	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}

	public String getArmador() {
		return armador;
	}

	public void setArmador(String armador) {
		this.armador = armador;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getPorto() {
		return porto;
	}

	public void setPorto(String porto) {
		this.porto = porto;
	}

	public String getImportador() {
		return importador;
	}

	public void setImportador(String importador) {
		this.importador = importador;
	}

	public String getNotify1() {
		return notify1;
	}

	public void setNotify1(String notify1) {
		this.notify1 = notify1;
	}

	public String getEnderecoNotify1() {
		return enderecoNotify1;
	}

	public void setEnderecoNotify1(String enderecoNotify1) {
		this.enderecoNotify1 = enderecoNotify1;
	}

	public String getNotify2() {
		return notify2;
	}

	public void setNotify2(String notify2) {
		this.notify2 = notify2;
	}

	public String getEnderecoNotify2() {
		return enderecoNotify2;
	}

	public void setEnderecoNotify2(String enderecoNotify2) {
		this.enderecoNotify2 = enderecoNotify2;
	}

	public String getNotify3() {
		return notify3;
	}

	public void setNotify3(String notify3) {
		this.notify3 = notify3;
	}

	public String getEnderecoNotify3() {
		return enderecoNotify3;
	}

	public void setEnderecoNotify3(String enderecoNotify3) {
		this.enderecoNotify3 = enderecoNotify3;
	}

	public String getConsignee() {
		return consignee;
	}

	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}

	public String getEnderecoConsignee() {
		return enderecoConsignee;
	}

	public void setEnderecoConsignee(String enderecoConsignee) {
		this.enderecoConsignee = enderecoConsignee;
	}

	public String getDescriptionOfGoods() {
		return descriptionOfGoods;
	}

	public void setDescriptionOfGoods(String descriptionOfGoods) {
		this.descriptionOfGoods = descriptionOfGoods;
	}

	public String getPacked() {
		return packed;
	}

	public void setPacked(String packed) {
		this.packed = packed;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public String getPlaceOfInspection() {
		return placeOfInspection;
	}

	public void setPlaceOfInspection(String placeOfInspection) {
		this.placeOfInspection = placeOfInspection;
	}

	public String getDateOfInspection() {
		return dateOfInspection;
	}

	public void setDateOfInspection(String dateOfInspection) {
		this.dateOfInspection = dateOfInspection;
	}

	public String getTimeLog() {
		return timeLog;
	}

	public void setTimeLog(String timeLog) {
		this.timeLog = timeLog;
	}

	public String getTipoDeQuantidadeParaCertificados() {
		return tipoDeQuantidadeParaCertificados;
	}

	public void setTipoDeQuantidadeParaCertificados(String tipoDeQuantidadeParaCertificados) {
		this.tipoDeQuantidadeParaCertificados = tipoDeQuantidadeParaCertificados;
	}

	public String getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(String additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	public String getPeloLiquidoKGS() {
		return peloLiquidoKGS;
	}

	public void setPeloLiquidoKGS(String peloLiquidoKGS) {
		this.peloLiquidoKGS = peloLiquidoKGS;
	}

	public String getPeloBrutoKGS() {
		return peloBrutoKGS;
	}

	public void setPeloBrutoKGS(String peloBrutoKGS) {
		this.peloBrutoKGS = peloBrutoKGS;
	}

	public Double getValorFob() {
		return valorFob;
	}

	public void setValorFob(Double valorFob) {
		this.valorFob = valorFob;
	}

	public String getMarcas() {
		return marcas;
	}

	public void setMarcas(String marcas) {
		this.marcas = marcas;
	}

	public String getNfExportacao() {
		return nfExportacao;
	}

	public void setNfExportacao(String nfExportacao) {
		this.nfExportacao = nfExportacao;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public String getInstrucaoEstufe() {
		return instrucaoEstufe;
	}

	public void setInstrucaoEstufe(String instrucaoEstufe) {
		this.instrucaoEstufe = instrucaoEstufe;
	}

	public Date getDataEstufe() {
		return dataEstufe;
	}

	public void setDataEstufe(Date dataEstufe) {
		this.dataEstufe = dataEstufe;
	}

	public String getLocalEstufe() {
		return localEstufe;
	}

	public void setLocalEstufe(String localEstufe) {
		this.localEstufe = localEstufe;
	}

	public Date getDataPresencaDeCarga() {
		return dataPresencaDeCarga;
	}

	public void setDataPresencaDeCarga(Date dataPresencaDeCarga) {
		this.dataPresencaDeCarga = dataPresencaDeCarga;
	}

	public String getTerminalDescargaEstufe() {
		return terminalDescargaEstufe;
	}

	public void setTerminalDescargaEstufe(String terminalDescargaEstufe) {
		this.terminalDescargaEstufe = terminalDescargaEstufe;
	}

	public String getTerminalEmissaoNfPortoEmbarque() {
		return terminalEmissaoNfPortoEmbarque;
	}

	public void setTerminalEmissaoNfPortoEmbarque(String terminalEmissaoNfPortoEmbarque) {
		this.terminalEmissaoNfPortoEmbarque = terminalEmissaoNfPortoEmbarque;
	}

	public String getObsPedidoCafe() {
		return obsPedidoCafe;
	}

	public void setObsPedidoCafe(String obsPedidoCafe) {
		this.obsPedidoCafe = obsPedidoCafe;
	}

	public Date getDataSAdvice() {
		return dataSAdvice;
	}

	public void setDataSAdvice(Date dataSAdvice) {
		this.dataSAdvice = dataSAdvice;
	}

	public Date getDataFinalCertificado() {
		return dataFinalCertificado;
	}

	public void setDataFinalCertificado(Date dataFinalCertificado) {
		this.dataFinalCertificado = dataFinalCertificado;
	}

	public String getNumeroBL() {
		return numeroBL;
	}

	public void setNumeroBL(String numeroBL) {
		this.numeroBL = numeroBL;
	}

	public Date getDataBL() {
		return dataBL;
	}

	public void setDataBL(Date dataBL) {
		this.dataBL = dataBL;
	}

	public String getObsFollowUP() {
		return obsFollowUP;
	}

	public void setObsFollowUP(String obsFollowUP) {
		this.obsFollowUP = obsFollowUP;
	}

	public String getFumigacao() {
		return fumigacao;
	}

	public void setFumigacao(String fumigacao) {
		this.fumigacao = fumigacao;
	}

	public String getFito() {
		return fito;
	}

	public void setFito(String fito) {
		this.fito = fito;
	}

	public String getIco() {
		return ico;
	}

	public void setIco(String ico) {
		this.ico = ico;
	}

	public String getIsf() {
		return isf;
	}

	public void setIsf(String isf) {
		this.isf = isf;
	}

	public String getLiberacao() {
		return liberacao;
	}

	public void setLiberacao(String liberacao) {
		this.liberacao = liberacao;
	}

	public String getDraftBL() {
		return draftBL;
	}

	public void setDraftBL(String draftBL) {
		this.draftBL = draftBL;
	}

	public String getProntificacao() {
		return prontificacao;
	}

	public void setProntificacao(String prontificacao) {
		this.prontificacao = prontificacao;
	}

	public String getDocumentoOriginal() {
		return documentoOriginal;
	}

	public void setDocumentoOriginal(String documentoOriginal) {
		this.documentoOriginal = documentoOriginal;
	}

	public Date getDataDocumentoOriginal() {
		return dataDocumentoOriginal;
	}

	public void setDataDocumentoOriginal(Date dataDocumentoOriginal) {
		this.dataDocumentoOriginal = dataDocumentoOriginal;
	}

	public String getObsPresencaDeCarga() {
		return obsPresencaDeCarga;
	}

	public void setObsPresencaDeCarga(String obsPresencaDeCarga) {
		this.obsPresencaDeCarga = obsPresencaDeCarga;
	}

	public String getPortofDischarge() {
		return portofDischarge;
	}

	public void setPortofDischarge(String portofDischarge) {
		this.portofDischarge = portofDischarge;
	}

	public String getBlType() {
		return blType;
	}

	public void setBlType(String blType) {
		this.blType = blType;
	}

	public String getCargoDescription() {
		return cargoDescription;
	}

	public void setCargoDescription(String cargoDescription) {
		this.cargoDescription = cargoDescription;
	}

	public String getOceanFreight() {
		return oceanFreight;
	}

	public void setOceanFreight(String oceanFreight) {
		this.oceanFreight = oceanFreight;
	}

	public String getPaisOceanFreight() {
		return paisOceanFreight;
	}

	public void setPaisOceanFreight(String paisOceanFreight) {
		this.paisOceanFreight = paisOceanFreight;
	}

	public String getPallets() {
		return pallets;
	}

	public void setPallets(String pallets) {
		this.pallets = pallets;
	}

	public String getNcm() {
		return ncm;
	}

	public void setNcm(String ncm) {
		this.ncm = ncm;
	}

	public String getOrigemDoCafe() {
		return origemDoCafe;
	}

	public void setOrigemDoCafe(String origemDoCafe) {
		this.origemDoCafe = origemDoCafe;
	}

	public String getCapatazia() {
		return capatazia;
	}

	public void setCapatazia(String capatazia) {
		this.capatazia = capatazia;
	}

	public String getTaxaDeLiberacaodeBL() {
		return taxaDeLiberacaodeBL;
	}

	public void setTaxaDeLiberacaodeBL(String taxaDeLiberacaodeBL) {
		this.taxaDeLiberacaodeBL = taxaDeLiberacaodeBL;
	}

	public String getLacre() {
		return lacre;
	}

	public void setLacre(String lacre) {
		this.lacre = lacre;
	}

	public String getIsps() {
		return isps;
	}

	public void setIsps(String isps) {
		this.isps = isps;
	}

	public String getLateArrivel() {
		return lateArrivel;
	}

	public void setLateArrivel(String lateArrivel) {
		this.lateArrivel = lateArrivel;
	}

	public String getCorrecaoDeBl() {
		return correcaoDeBl;
	}

	public void setCorrecaoDeBl(String correcaoDeBl) {
		this.correcaoDeBl = correcaoDeBl;
	}

	public String getReemissaoDeBl() {
		return reemissaoDeBl;
	}

	public void setReemissaoDeBl(String reemissaoDeBl) {
		this.reemissaoDeBl = reemissaoDeBl;
	}

	public String getDetention() {
		return detention;
	}

	public void setDetention(String detention) {
		this.detention = detention;
	}

	public String getFrete() {
		return frete;
	}

	public void setFrete(String frete) {
		this.frete = frete;
	}

	public String getTaxaDeTransmissao() {
		return taxaDeTransmissao;
	}

	public void setTaxaDeTransmissao(String taxaDeTransmissao) {
		this.taxaDeTransmissao = taxaDeTransmissao;
	}

	public String getTaxaDoDolar() {
		return taxaDoDolar;
	}

	public void setTaxaDoDolar(String taxaDoDolar) {
		this.taxaDoDolar = taxaDoDolar;
	}

	public Date getDataFumigacao() {
		return dataFumigacao;
	}

	public void setDataFumigacao(Date dataFumigacao) {
		this.dataFumigacao = dataFumigacao;
	}

	public Date getDataDraftBL() {
		return dataDraftBL;
	}

	public void setDataDraftBL(Date dataDraftBL) {
		this.dataDraftBL = dataDraftBL;
	}

	public Date getDataVGM() {
		return dataVGM;
	}

	public void setDataVGM(Date dataVGM) {
		this.dataVGM = dataVGM;
	}

	public String getDdeLiberada() {
		return ddeLiberada;
	}

	public void setDdeLiberada(String ddeLiberada) {
		this.ddeLiberada = ddeLiberada;
	}

	public String getPrevisaoSaidaNavio() {
		return previsaoSaidaNavio;
	}

	public void setPrevisaoSaidaNavio(String previsaoSaidaNavio) {
		this.previsaoSaidaNavio = previsaoSaidaNavio;
	}

	public Date getDataRequerimentoICO() {
		return dataRequerimentoICO;
	}

	public void setDataRequerimentoICO(Date dataRequerimentoICO) {
		this.dataRequerimentoICO = dataRequerimentoICO;
	}

	public Date getDataISF() {
		return dataISF;
	}

	public void setDataISF(Date dataISF) {
		this.dataISF = dataISF;
	}

	public Date getDataRequerimentoFITO() {
		return dataRequerimentoFITO;
	}

	public void setDataRequerimentoFITO(Date dataRequerimentoFITO) {
		this.dataRequerimentoFITO = dataRequerimentoFITO;
	}

	public Date getDataPedidoPagamento() {
		return dataPedidoPagamento;
	}

	public void setDataPedidoPagamento(Date dataPedidoPagamento) {
		this.dataPedidoPagamento = dataPedidoPagamento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public Date getDataRetiradaBL() {
		return dataRetiradaBL;
	}

	public void setDataRetiradaBL(Date dataRetiradaBL) {
		this.dataRetiradaBL = dataRetiradaBL;
	}

	public Date getDataCorrecaoBL() {
		return dataCorrecaoBL;
	}

	public void setDataCorrecaoBL(Date dataCorrecaoBL) {
		this.dataCorrecaoBL = dataCorrecaoBL;
	}

	public Date getDataICO() {
		return dataICO;
	}

	public void setDataICO(Date dataICO) {
		this.dataICO = dataICO;
	}

	public Date getDataFitoSanitario() {
		return dataFitoSanitario;
	}

	public void setDataFitoSanitario(Date dataFitoSanitario) {
		this.dataFitoSanitario = dataFitoSanitario;
	}

	public Date getDataCamaraComercio() {
		return dataCamaraComercio;
	}

	public void setDataCamaraComercio(Date dataCamaraComercio) {
		this.dataCamaraComercio = dataCamaraComercio;
	}

	public Date getDataCertificadoFumigacao() {
		return dataCertificadoFumigacao;
	}

	public void setDataCertificadoFumigacao(Date dataCertificadoFumigacao) {
		this.dataCertificadoFumigacao = dataCertificadoFumigacao;
	}

	public Date getDataEnviadoAprovacao() {
		return dataEnviadoAprovacao;
	}

	public void setDataEnviadoAprovacao(Date dataEnviadoAprovacao) {
		this.dataEnviadoAprovacao = dataEnviadoAprovacao;
	}

	public String getSituacaoDocumento() {
		return situacaoDocumento;
	}

	public void setSituacaoDocumento(String situacaoDocumento) {
		this.situacaoDocumento = situacaoDocumento;
	}

	public Date getDataCamaraArabe() {
		return dataCamaraArabe;
	}

	public void setDataCamaraArabe(Date dataCamaraArabe) {
		this.dataCamaraArabe = dataCamaraArabe;
	}

	public Date getDataPedirBooking() {
		return dataPedirBooking;
	}

	public void setDataPedirBooking(Date dataPedirBooking) {
		this.dataPedirBooking = dataPedirBooking;
	}

	public Date getDataPedidoContainer() {
		return dataPedidoContainer;
	}

	public void setDataPedidoContainer(Date dataPedidoContainer) {
		this.dataPedidoContainer = dataPedidoContainer;
	}

	public Date getDataPedidoFumigacao() {
		return dataPedidoFumigacao;
	}

	public void setDataPedidoFumigacao(Date dataPedidoFumigacao) {
		this.dataPedidoFumigacao = dataPedidoFumigacao;
	}

	public Date getDataFazerReceberRE() {
		return dataFazerReceberRE;
	}

	public void setDataFazerReceberRE(Date dataFazerReceberRE) {
		this.dataFazerReceberRE = dataFazerReceberRE;
	}

	public Date getDataFazerMemorando() {
		return dataFazerMemorando;
	}

	public void setDataFazerMemorando(Date dataFazerMemorando) {
		this.dataFazerMemorando = dataFazerMemorando;
	}

	public Date getDataDocsAprovacao() {
		return dataDocsAprovacao;
	}

	public void setDataDocsAprovacao(Date dataDocsAprovacao) {
		this.dataDocsAprovacao = dataDocsAprovacao;
	}

	public String getCertificadoLions() {
		return certificadoLions;
	}

	public void setCertificadoLions(String certificadoLions) {
		this.certificadoLions = certificadoLions;
	}

	public String getObservacaoEmbarque() {
		return observacaoEmbarque;
	}

	public void setObservacaoEmbarque(String observacaoEmbarque) {
		this.observacaoEmbarque = observacaoEmbarque;
	}

	public Date getDataLiberacao() {
		return dataLiberacao;
	}

	public void setDataLiberacao(Date dataLiberacao) {
		this.dataLiberacao = dataLiberacao;
	}

	public Date getDataProntificacao() {
		return dataProntificacao;
	}

	public void setDataProntificacao(Date dataProntificacao) {
		this.dataProntificacao = dataProntificacao;
	}

	public Date getDataPedidoCafe() {
		return dataPedidoCafe;
	}

	public void setDataPedidoCafe(Date dataPedidoCafe) {
		this.dataPedidoCafe = dataPedidoCafe;
	}

	public Double getQtdFinanceiro() {
		return qtdFinanceiro;
	}

	public void setQtdFinanceiro(Double qtdFinanceiro) {
		this.qtdFinanceiro = qtdFinanceiro;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Certificado getCertificado() {
		return certificado;
	}

	public void setCertificado(Certificado certificado) {
		this.certificado = certificado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setBillOfLadingDate(String billOfLadingDate) {
		this.billOfLadingDate = billOfLadingDate;
	}

	public static void setVerificaNavio(String verificaNavio) {
		Matriz.verificaNavio = verificaNavio;
	}

	public void setVerificaCafe(String verificaCafe) {
		this.verificaCafe = verificaCafe;
	}

	public void setVerificaEstufe(String verificaEstufe) {
		this.verificaEstufe = verificaEstufe;
	}

	public void setVerificaRE(String verificaRE) {
		this.verificaRE = verificaRE;
	}

	public void setVerificaDDE(String verificaDDE) {
		this.verificaDDE = verificaDDE;
	}

	public void setVerificaDataSadvice(String verificaDataSadvice) {
		this.verificaDataSadvice = verificaDataSadvice;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DataDraft == null) ? 0 : DataDraft.hashCode());
		result = prime * result + ((HoraDraft == null) ? 0 : HoraDraft.hashCode());
		result = prime * result + ((additionalInformation == null) ? 0 : additionalInformation.hashCode());
		result = prime * result + ((armador == null) ? 0 : armador.hashCode());
		result = prime * result + ((billOfLadingDate == null) ? 0 : billOfLadingDate.hashCode());
		result = prime * result + ((blType == null) ? 0 : blType.hashCode());
		result = prime * result + ((booking == null) ? 0 : booking.hashCode());
		result = prime * result + ((capatazia == null) ? 0 : capatazia.hashCode());
		result = prime * result + ((cargoDescription == null) ? 0 : cargoDescription.hashCode());
		result = prime * result + ((certificado == null) ? 0 : certificado.hashCode());
		result = prime * result + ((certificadoLions == null) ? 0 : certificadoLions.hashCode());
		result = prime * result + ((chegadaCafeData == null) ? 0 : chegadaCafeData.hashCode());
		result = prime * result + ((chegadaCafeHora == null) ? 0 : chegadaCafeHora.hashCode());
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + ((consignee == null) ? 0 : consignee.hashCode());
		result = prime * result + ((contratoBuyer == null) ? 0 : contratoBuyer.hashCode());
		result = prime * result + ((contratoVenda == null) ? 0 : contratoVenda.hashCode());
		result = prime * result + ((correcaoDeBl == null) ? 0 : correcaoDeBl.hashCode());
		result = prime * result + ((dataBL == null) ? 0 : dataBL.hashCode());
		result = prime * result + ((dataCamaraArabe == null) ? 0 : dataCamaraArabe.hashCode());
		result = prime * result + ((dataCamaraComercio == null) ? 0 : dataCamaraComercio.hashCode());
		result = prime * result + ((dataCarga == null) ? 0 : dataCarga.hashCode());
		result = prime * result + ((dataCertificadoFumigacao == null) ? 0 : dataCertificadoFumigacao.hashCode());
		result = prime * result + ((dataCorrecaoBL == null) ? 0 : dataCorrecaoBL.hashCode());
		result = prime * result + ((dataDeCadastro == null) ? 0 : dataDeCadastro.hashCode());
		result = prime * result + ((dataDocsAprovacao == null) ? 0 : dataDocsAprovacao.hashCode());
		result = prime * result + ((dataDocumentoOriginal == null) ? 0 : dataDocumentoOriginal.hashCode());
		result = prime * result + ((dataDraftBL == null) ? 0 : dataDraftBL.hashCode());
		result = prime * result + ((dataEmissao == null) ? 0 : dataEmissao.hashCode());
		result = prime * result + ((dataEnviadoAprovacao == null) ? 0 : dataEnviadoAprovacao.hashCode());
		result = prime * result + ((dataEstufe == null) ? 0 : dataEstufe.hashCode());
		result = prime * result + ((dataFazerMemorando == null) ? 0 : dataFazerMemorando.hashCode());
		result = prime * result + ((dataFazerReceberRE == null) ? 0 : dataFazerReceberRE.hashCode());
		result = prime * result + ((dataFinalCertificado == null) ? 0 : dataFinalCertificado.hashCode());
		result = prime * result + ((dataFitoSanitario == null) ? 0 : dataFitoSanitario.hashCode());
		result = prime * result + ((dataFumigacao == null) ? 0 : dataFumigacao.hashCode());
		result = prime * result + ((dataICO == null) ? 0 : dataICO.hashCode());
		result = prime * result + ((dataISF == null) ? 0 : dataISF.hashCode());
		result = prime * result + ((dataLiberacao == null) ? 0 : dataLiberacao.hashCode());
		result = prime * result + ((dataPagamento == null) ? 0 : dataPagamento.hashCode());
		result = prime * result + ((dataPedidoCafe == null) ? 0 : dataPedidoCafe.hashCode());
		result = prime * result + ((dataPedidoContainer == null) ? 0 : dataPedidoContainer.hashCode());
		result = prime * result + ((dataPedidoFumigacao == null) ? 0 : dataPedidoFumigacao.hashCode());
		result = prime * result + ((dataPedidoPagamento == null) ? 0 : dataPedidoPagamento.hashCode());
		result = prime * result + ((dataPedirBooking == null) ? 0 : dataPedirBooking.hashCode());
		result = prime * result + ((dataPresencaDeCarga == null) ? 0 : dataPresencaDeCarga.hashCode());
		result = prime * result + ((dataProntificacao == null) ? 0 : dataProntificacao.hashCode());
		result = prime * result + ((dataRequerimentoFITO == null) ? 0 : dataRequerimentoFITO.hashCode());
		result = prime * result + ((dataRequerimentoICO == null) ? 0 : dataRequerimentoICO.hashCode());
		result = prime * result + ((dataRetiradaBL == null) ? 0 : dataRetiradaBL.hashCode());
		result = prime * result + ((dataSAdvice == null) ? 0 : dataSAdvice.hashCode());
		result = prime * result + ((dataVGM == null) ? 0 : dataVGM.hashCode());
		result = prime * result + ((datadde == null) ? 0 : datadde.hashCode());
		result = prime * result + ((dateOfInspection == null) ? 0 : dateOfInspection.hashCode());
		result = prime * result + ((dde == null) ? 0 : dde.hashCode());
		result = prime * result + ((ddeLiberada == null) ? 0 : ddeLiberada.hashCode());
		result = prime * result + ((descriptionOfGoods == null) ? 0 : descriptionOfGoods.hashCode());
		result = prime * result + ((destino == null) ? 0 : destino.hashCode());
		result = prime * result + ((detention == null) ? 0 : detention.hashCode());
		result = prime * result + ((documentoOriginal == null) ? 0 : documentoOriginal.hashCode());
		result = prime * result + ((draftBL == null) ? 0 : draftBL.hashCode());
		result = prime * result + ((embarque == null) ? 0 : embarque.hashCode());
		result = prime * result + ((enderecoConsignee == null) ? 0 : enderecoConsignee.hashCode());
		result = prime * result + ((enderecoNotify1 == null) ? 0 : enderecoNotify1.hashCode());
		result = prime * result + ((enderecoNotify2 == null) ? 0 : enderecoNotify2.hashCode());
		result = prime * result + ((enderecoNotify3 == null) ? 0 : enderecoNotify3.hashCode());
		result = prime * result + ((eta == null) ? 0 : eta.hashCode());
		result = prime * result + ((fito == null) ? 0 : fito.hashCode());
		result = prime * result + ((frete == null) ? 0 : frete.hashCode());
		result = prime * result + ((fumigacao == null) ? 0 : fumigacao.hashCode());
		result = prime * result + ((horaCarga == null) ? 0 : horaCarga.hashCode());
		result = prime * result + ((ico == null) ? 0 : ico.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((importador == null) ? 0 : importador.hashCode());
		result = prime * result + ((instrucaoEstufe == null) ? 0 : instrucaoEstufe.hashCode());
		result = prime * result + ((isf == null) ? 0 : isf.hashCode());
		result = prime * result + ((isps == null) ? 0 : isps.hashCode());
		result = prime * result + ((lacre == null) ? 0 : lacre.hashCode());
		result = prime * result + ((lateArrivel == null) ? 0 : lateArrivel.hashCode());
		result = prime * result + ((liberacao == null) ? 0 : liberacao.hashCode());
		result = prime * result + ((localEstufe == null) ? 0 : localEstufe.hashCode());
		result = prime * result + ((marcaOic == null) ? 0 : marcaOic.hashCode());
		result = prime * result + ((marcas == null) ? 0 : marcas.hashCode());
		result = prime * result + ((navio == null) ? 0 : navio.hashCode());
		result = prime * result + ((ncm == null) ? 0 : ncm.hashCode());
		result = prime * result + ((nfExportacao == null) ? 0 : nfExportacao.hashCode());
		result = prime * result + ((notify1 == null) ? 0 : notify1.hashCode());
		result = prime * result + ((notify2 == null) ? 0 : notify2.hashCode());
		result = prime * result + ((notify3 == null) ? 0 : notify3.hashCode());
		result = prime * result + ((numeroBL == null) ? 0 : numeroBL.hashCode());
		result = prime * result + ((obsFollowUP == null) ? 0 : obsFollowUP.hashCode());
		result = prime * result + ((obsPedidoCafe == null) ? 0 : obsPedidoCafe.hashCode());
		result = prime * result + ((obsPresencaDeCarga == null) ? 0 : obsPresencaDeCarga.hashCode());
		result = prime * result + ((observacaoEmbarque == null) ? 0 : observacaoEmbarque.hashCode());
		result = prime * result + ((oceanFreight == null) ? 0 : oceanFreight.hashCode());
		result = prime * result + ((origemDoCafe == null) ? 0 : origemDoCafe.hashCode());
		result = prime * result + ((packed == null) ? 0 : packed.hashCode());
		result = prime * result + ((pais == null) ? 0 : pais.hashCode());
		result = prime * result + ((paisOceanFreight == null) ? 0 : paisOceanFreight.hashCode());
		result = prime * result + ((pallets == null) ? 0 : pallets.hashCode());
		result = prime * result + ((peloBrutoKGS == null) ? 0 : peloBrutoKGS.hashCode());
		result = prime * result + ((peloLiquidoKGS == null) ? 0 : peloLiquidoKGS.hashCode());
		result = prime * result + ((placeOfInspection == null) ? 0 : placeOfInspection.hashCode());
		result = prime * result + ((porto == null) ? 0 : porto.hashCode());
		result = prime * result + ((portofDischarge == null) ? 0 : portofDischarge.hashCode());
		result = prime * result + ((previsaoSaidaNavio == null) ? 0 : previsaoSaidaNavio.hashCode());
		result = prime * result + ((prontificacao == null) ? 0 : prontificacao.hashCode());
		result = prime * result + ((qtd == null) ? 0 : qtd.hashCode());
		result = prime * result + ((qtdContainer == null) ? 0 : qtdContainer.hashCode());
		result = prime * result + ((qtdFinanceiro == null) ? 0 : qtdFinanceiro.hashCode());
		result = prime * result + ((quality == null) ? 0 : quality.hashCode());
		result = prime * result + ((re == null) ? 0 : re.hashCode());
		result = prime * result + ((reemissaoDeBl == null) ? 0 : reemissaoDeBl.hashCode());
		result = prime * result + ((sd == null) ? 0 : sd.hashCode());
		result = prime * result + ((situacaoDocumento == null) ? 0 : situacaoDocumento.hashCode());
		result = prime * result + ((taxaDeLiberacaodeBL == null) ? 0 : taxaDeLiberacaodeBL.hashCode());
		result = prime * result + ((taxaDeTransmissao == null) ? 0 : taxaDeTransmissao.hashCode());
		result = prime * result + ((taxaDoDolar == null) ? 0 : taxaDoDolar.hashCode());
		result = prime * result + ((terminal == null) ? 0 : terminal.hashCode());
		result = prime * result + ((terminalDescargaEstufe == null) ? 0 : terminalDescargaEstufe.hashCode());
		result = prime * result
				+ ((terminalEmissaoNfPortoEmbarque == null) ? 0 : terminalEmissaoNfPortoEmbarque.hashCode());
		result = prime * result + ((timeLog == null) ? 0 : timeLog.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		result = prime * result + ((tipoContainer == null) ? 0 : tipoContainer.hashCode());
		result = prime * result
				+ ((tipoDeQuantidadeParaCertificados == null) ? 0 : tipoDeQuantidadeParaCertificados.hashCode());
		result = prime * result + ((valorFob == null) ? 0 : valorFob.hashCode());
		result = prime * result + ((verificaCafe == null) ? 0 : verificaCafe.hashCode());
		result = prime * result + ((verificaDDE == null) ? 0 : verificaDDE.hashCode());
		result = prime * result + ((verificaDataSadvice == null) ? 0 : verificaDataSadvice.hashCode());
		result = prime * result + ((verificaEstufe == null) ? 0 : verificaEstufe.hashCode());
		result = prime * result + ((verificaRE == null) ? 0 : verificaRE.hashCode());
		result = prime * result + ((viagem == null) ? 0 : viagem.hashCode());
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
		Matriz other = (Matriz) obj;
		if (DataDraft == null) {
			if (other.DataDraft != null)
				return false;
		} else if (!DataDraft.equals(other.DataDraft))
			return false;
		if (HoraDraft == null) {
			if (other.HoraDraft != null)
				return false;
		} else if (!HoraDraft.equals(other.HoraDraft))
			return false;
		if (additionalInformation == null) {
			if (other.additionalInformation != null)
				return false;
		} else if (!additionalInformation.equals(other.additionalInformation))
			return false;
		if (armador == null) {
			if (other.armador != null)
				return false;
		} else if (!armador.equals(other.armador))
			return false;
		if (billOfLadingDate == null) {
			if (other.billOfLadingDate != null)
				return false;
		} else if (!billOfLadingDate.equals(other.billOfLadingDate))
			return false;
		if (blType == null) {
			if (other.blType != null)
				return false;
		} else if (!blType.equals(other.blType))
			return false;
		if (booking == null) {
			if (other.booking != null)
				return false;
		} else if (!booking.equals(other.booking))
			return false;
		if (capatazia == null) {
			if (other.capatazia != null)
				return false;
		} else if (!capatazia.equals(other.capatazia))
			return false;
		if (cargoDescription == null) {
			if (other.cargoDescription != null)
				return false;
		} else if (!cargoDescription.equals(other.cargoDescription))
			return false;
		if (certificado == null) {
			if (other.certificado != null)
				return false;
		} else if (!certificado.equals(other.certificado))
			return false;
		if (certificadoLions == null) {
			if (other.certificadoLions != null)
				return false;
		} else if (!certificadoLions.equals(other.certificadoLions))
			return false;
		if (chegadaCafeData == null) {
			if (other.chegadaCafeData != null)
				return false;
		} else if (!chegadaCafeData.equals(other.chegadaCafeData))
			return false;
		if (chegadaCafeHora == null) {
			if (other.chegadaCafeHora != null)
				return false;
		} else if (!chegadaCafeHora.equals(other.chegadaCafeHora))
			return false;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (consignee == null) {
			if (other.consignee != null)
				return false;
		} else if (!consignee.equals(other.consignee))
			return false;
		if (contratoBuyer == null) {
			if (other.contratoBuyer != null)
				return false;
		} else if (!contratoBuyer.equals(other.contratoBuyer))
			return false;
		if (contratoVenda == null) {
			if (other.contratoVenda != null)
				return false;
		} else if (!contratoVenda.equals(other.contratoVenda))
			return false;
		if (correcaoDeBl == null) {
			if (other.correcaoDeBl != null)
				return false;
		} else if (!correcaoDeBl.equals(other.correcaoDeBl))
			return false;
		if (dataBL == null) {
			if (other.dataBL != null)
				return false;
		} else if (!dataBL.equals(other.dataBL))
			return false;
		if (dataCamaraArabe == null) {
			if (other.dataCamaraArabe != null)
				return false;
		} else if (!dataCamaraArabe.equals(other.dataCamaraArabe))
			return false;
		if (dataCamaraComercio == null) {
			if (other.dataCamaraComercio != null)
				return false;
		} else if (!dataCamaraComercio.equals(other.dataCamaraComercio))
			return false;
		if (dataCarga == null) {
			if (other.dataCarga != null)
				return false;
		} else if (!dataCarga.equals(other.dataCarga))
			return false;
		if (dataCertificadoFumigacao == null) {
			if (other.dataCertificadoFumigacao != null)
				return false;
		} else if (!dataCertificadoFumigacao.equals(other.dataCertificadoFumigacao))
			return false;
		if (dataCorrecaoBL == null) {
			if (other.dataCorrecaoBL != null)
				return false;
		} else if (!dataCorrecaoBL.equals(other.dataCorrecaoBL))
			return false;
		if (dataDeCadastro == null) {
			if (other.dataDeCadastro != null)
				return false;
		} else if (!dataDeCadastro.equals(other.dataDeCadastro))
			return false;
		if (dataDocsAprovacao == null) {
			if (other.dataDocsAprovacao != null)
				return false;
		} else if (!dataDocsAprovacao.equals(other.dataDocsAprovacao))
			return false;
		if (dataDocumentoOriginal == null) {
			if (other.dataDocumentoOriginal != null)
				return false;
		} else if (!dataDocumentoOriginal.equals(other.dataDocumentoOriginal))
			return false;
		if (dataDraftBL == null) {
			if (other.dataDraftBL != null)
				return false;
		} else if (!dataDraftBL.equals(other.dataDraftBL))
			return false;
		if (dataEmissao == null) {
			if (other.dataEmissao != null)
				return false;
		} else if (!dataEmissao.equals(other.dataEmissao))
			return false;
		if (dataEnviadoAprovacao == null) {
			if (other.dataEnviadoAprovacao != null)
				return false;
		} else if (!dataEnviadoAprovacao.equals(other.dataEnviadoAprovacao))
			return false;
		if (dataEstufe == null) {
			if (other.dataEstufe != null)
				return false;
		} else if (!dataEstufe.equals(other.dataEstufe))
			return false;
		if (dataFazerMemorando == null) {
			if (other.dataFazerMemorando != null)
				return false;
		} else if (!dataFazerMemorando.equals(other.dataFazerMemorando))
			return false;
		if (dataFazerReceberRE == null) {
			if (other.dataFazerReceberRE != null)
				return false;
		} else if (!dataFazerReceberRE.equals(other.dataFazerReceberRE))
			return false;
		if (dataFinalCertificado == null) {
			if (other.dataFinalCertificado != null)
				return false;
		} else if (!dataFinalCertificado.equals(other.dataFinalCertificado))
			return false;
		if (dataFitoSanitario == null) {
			if (other.dataFitoSanitario != null)
				return false;
		} else if (!dataFitoSanitario.equals(other.dataFitoSanitario))
			return false;
		if (dataFumigacao == null) {
			if (other.dataFumigacao != null)
				return false;
		} else if (!dataFumigacao.equals(other.dataFumigacao))
			return false;
		if (dataICO == null) {
			if (other.dataICO != null)
				return false;
		} else if (!dataICO.equals(other.dataICO))
			return false;
		if (dataISF == null) {
			if (other.dataISF != null)
				return false;
		} else if (!dataISF.equals(other.dataISF))
			return false;
		if (dataLiberacao == null) {
			if (other.dataLiberacao != null)
				return false;
		} else if (!dataLiberacao.equals(other.dataLiberacao))
			return false;
		if (dataPagamento == null) {
			if (other.dataPagamento != null)
				return false;
		} else if (!dataPagamento.equals(other.dataPagamento))
			return false;
		if (dataPedidoCafe == null) {
			if (other.dataPedidoCafe != null)
				return false;
		} else if (!dataPedidoCafe.equals(other.dataPedidoCafe))
			return false;
		if (dataPedidoContainer == null) {
			if (other.dataPedidoContainer != null)
				return false;
		} else if (!dataPedidoContainer.equals(other.dataPedidoContainer))
			return false;
		if (dataPedidoFumigacao == null) {
			if (other.dataPedidoFumigacao != null)
				return false;
		} else if (!dataPedidoFumigacao.equals(other.dataPedidoFumigacao))
			return false;
		if (dataPedidoPagamento == null) {
			if (other.dataPedidoPagamento != null)
				return false;
		} else if (!dataPedidoPagamento.equals(other.dataPedidoPagamento))
			return false;
		if (dataPedirBooking == null) {
			if (other.dataPedirBooking != null)
				return false;
		} else if (!dataPedirBooking.equals(other.dataPedirBooking))
			return false;
		if (dataPresencaDeCarga == null) {
			if (other.dataPresencaDeCarga != null)
				return false;
		} else if (!dataPresencaDeCarga.equals(other.dataPresencaDeCarga))
			return false;
		if (dataProntificacao == null) {
			if (other.dataProntificacao != null)
				return false;
		} else if (!dataProntificacao.equals(other.dataProntificacao))
			return false;
		if (dataRequerimentoFITO == null) {
			if (other.dataRequerimentoFITO != null)
				return false;
		} else if (!dataRequerimentoFITO.equals(other.dataRequerimentoFITO))
			return false;
		if (dataRequerimentoICO == null) {
			if (other.dataRequerimentoICO != null)
				return false;
		} else if (!dataRequerimentoICO.equals(other.dataRequerimentoICO))
			return false;
		if (dataRetiradaBL == null) {
			if (other.dataRetiradaBL != null)
				return false;
		} else if (!dataRetiradaBL.equals(other.dataRetiradaBL))
			return false;
		if (dataSAdvice == null) {
			if (other.dataSAdvice != null)
				return false;
		} else if (!dataSAdvice.equals(other.dataSAdvice))
			return false;
		if (dataVGM == null) {
			if (other.dataVGM != null)
				return false;
		} else if (!dataVGM.equals(other.dataVGM))
			return false;
		if (datadde == null) {
			if (other.datadde != null)
				return false;
		} else if (!datadde.equals(other.datadde))
			return false;
		if (dateOfInspection == null) {
			if (other.dateOfInspection != null)
				return false;
		} else if (!dateOfInspection.equals(other.dateOfInspection))
			return false;
		if (dde == null) {
			if (other.dde != null)
				return false;
		} else if (!dde.equals(other.dde))
			return false;
		if (ddeLiberada == null) {
			if (other.ddeLiberada != null)
				return false;
		} else if (!ddeLiberada.equals(other.ddeLiberada))
			return false;
		if (descriptionOfGoods == null) {
			if (other.descriptionOfGoods != null)
				return false;
		} else if (!descriptionOfGoods.equals(other.descriptionOfGoods))
			return false;
		if (destino == null) {
			if (other.destino != null)
				return false;
		} else if (!destino.equals(other.destino))
			return false;
		if (detention == null) {
			if (other.detention != null)
				return false;
		} else if (!detention.equals(other.detention))
			return false;
		if (documentoOriginal == null) {
			if (other.documentoOriginal != null)
				return false;
		} else if (!documentoOriginal.equals(other.documentoOriginal))
			return false;
		if (draftBL == null) {
			if (other.draftBL != null)
				return false;
		} else if (!draftBL.equals(other.draftBL))
			return false;
		if (embarque == null) {
			if (other.embarque != null)
				return false;
		} else if (!embarque.equals(other.embarque))
			return false;
		if (enderecoConsignee == null) {
			if (other.enderecoConsignee != null)
				return false;
		} else if (!enderecoConsignee.equals(other.enderecoConsignee))
			return false;
		if (enderecoNotify1 == null) {
			if (other.enderecoNotify1 != null)
				return false;
		} else if (!enderecoNotify1.equals(other.enderecoNotify1))
			return false;
		if (enderecoNotify2 == null) {
			if (other.enderecoNotify2 != null)
				return false;
		} else if (!enderecoNotify2.equals(other.enderecoNotify2))
			return false;
		if (enderecoNotify3 == null) {
			if (other.enderecoNotify3 != null)
				return false;
		} else if (!enderecoNotify3.equals(other.enderecoNotify3))
			return false;
		if (eta == null) {
			if (other.eta != null)
				return false;
		} else if (!eta.equals(other.eta))
			return false;
		if (fito == null) {
			if (other.fito != null)
				return false;
		} else if (!fito.equals(other.fito))
			return false;
		if (frete == null) {
			if (other.frete != null)
				return false;
		} else if (!frete.equals(other.frete))
			return false;
		if (fumigacao == null) {
			if (other.fumigacao != null)
				return false;
		} else if (!fumigacao.equals(other.fumigacao))
			return false;
		if (horaCarga == null) {
			if (other.horaCarga != null)
				return false;
		} else if (!horaCarga.equals(other.horaCarga))
			return false;
		if (ico == null) {
			if (other.ico != null)
				return false;
		} else if (!ico.equals(other.ico))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (importador == null) {
			if (other.importador != null)
				return false;
		} else if (!importador.equals(other.importador))
			return false;
		if (instrucaoEstufe == null) {
			if (other.instrucaoEstufe != null)
				return false;
		} else if (!instrucaoEstufe.equals(other.instrucaoEstufe))
			return false;
		if (isf == null) {
			if (other.isf != null)
				return false;
		} else if (!isf.equals(other.isf))
			return false;
		if (isps == null) {
			if (other.isps != null)
				return false;
		} else if (!isps.equals(other.isps))
			return false;
		if (lacre == null) {
			if (other.lacre != null)
				return false;
		} else if (!lacre.equals(other.lacre))
			return false;
		if (lateArrivel == null) {
			if (other.lateArrivel != null)
				return false;
		} else if (!lateArrivel.equals(other.lateArrivel))
			return false;
		if (liberacao == null) {
			if (other.liberacao != null)
				return false;
		} else if (!liberacao.equals(other.liberacao))
			return false;
		if (localEstufe == null) {
			if (other.localEstufe != null)
				return false;
		} else if (!localEstufe.equals(other.localEstufe))
			return false;
		if (marcaOic == null) {
			if (other.marcaOic != null)
				return false;
		} else if (!marcaOic.equals(other.marcaOic))
			return false;
		if (marcas == null) {
			if (other.marcas != null)
				return false;
		} else if (!marcas.equals(other.marcas))
			return false;
		if (navio == null) {
			if (other.navio != null)
				return false;
		} else if (!navio.equals(other.navio))
			return false;
		if (ncm == null) {
			if (other.ncm != null)
				return false;
		} else if (!ncm.equals(other.ncm))
			return false;
		if (nfExportacao == null) {
			if (other.nfExportacao != null)
				return false;
		} else if (!nfExportacao.equals(other.nfExportacao))
			return false;
		if (notify1 == null) {
			if (other.notify1 != null)
				return false;
		} else if (!notify1.equals(other.notify1))
			return false;
		if (notify2 == null) {
			if (other.notify2 != null)
				return false;
		} else if (!notify2.equals(other.notify2))
			return false;
		if (notify3 == null) {
			if (other.notify3 != null)
				return false;
		} else if (!notify3.equals(other.notify3))
			return false;
		if (numeroBL == null) {
			if (other.numeroBL != null)
				return false;
		} else if (!numeroBL.equals(other.numeroBL))
			return false;
		if (obsFollowUP == null) {
			if (other.obsFollowUP != null)
				return false;
		} else if (!obsFollowUP.equals(other.obsFollowUP))
			return false;
		if (obsPedidoCafe == null) {
			if (other.obsPedidoCafe != null)
				return false;
		} else if (!obsPedidoCafe.equals(other.obsPedidoCafe))
			return false;
		if (obsPresencaDeCarga == null) {
			if (other.obsPresencaDeCarga != null)
				return false;
		} else if (!obsPresencaDeCarga.equals(other.obsPresencaDeCarga))
			return false;
		if (observacaoEmbarque == null) {
			if (other.observacaoEmbarque != null)
				return false;
		} else if (!observacaoEmbarque.equals(other.observacaoEmbarque))
			return false;
		if (oceanFreight == null) {
			if (other.oceanFreight != null)
				return false;
		} else if (!oceanFreight.equals(other.oceanFreight))
			return false;
		if (origemDoCafe == null) {
			if (other.origemDoCafe != null)
				return false;
		} else if (!origemDoCafe.equals(other.origemDoCafe))
			return false;
		if (packed == null) {
			if (other.packed != null)
				return false;
		} else if (!packed.equals(other.packed))
			return false;
		if (pais == null) {
			if (other.pais != null)
				return false;
		} else if (!pais.equals(other.pais))
			return false;
		if (paisOceanFreight == null) {
			if (other.paisOceanFreight != null)
				return false;
		} else if (!paisOceanFreight.equals(other.paisOceanFreight))
			return false;
		if (pallets == null) {
			if (other.pallets != null)
				return false;
		} else if (!pallets.equals(other.pallets))
			return false;
		if (peloBrutoKGS == null) {
			if (other.peloBrutoKGS != null)
				return false;
		} else if (!peloBrutoKGS.equals(other.peloBrutoKGS))
			return false;
		if (peloLiquidoKGS == null) {
			if (other.peloLiquidoKGS != null)
				return false;
		} else if (!peloLiquidoKGS.equals(other.peloLiquidoKGS))
			return false;
		if (placeOfInspection == null) {
			if (other.placeOfInspection != null)
				return false;
		} else if (!placeOfInspection.equals(other.placeOfInspection))
			return false;
		if (porto == null) {
			if (other.porto != null)
				return false;
		} else if (!porto.equals(other.porto))
			return false;
		if (portofDischarge == null) {
			if (other.portofDischarge != null)
				return false;
		} else if (!portofDischarge.equals(other.portofDischarge))
			return false;
		if (previsaoSaidaNavio == null) {
			if (other.previsaoSaidaNavio != null)
				return false;
		} else if (!previsaoSaidaNavio.equals(other.previsaoSaidaNavio))
			return false;
		if (prontificacao == null) {
			if (other.prontificacao != null)
				return false;
		} else if (!prontificacao.equals(other.prontificacao))
			return false;
		if (qtd == null) {
			if (other.qtd != null)
				return false;
		} else if (!qtd.equals(other.qtd))
			return false;
		if (qtdContainer == null) {
			if (other.qtdContainer != null)
				return false;
		} else if (!qtdContainer.equals(other.qtdContainer))
			return false;
		if (qtdFinanceiro == null) {
			if (other.qtdFinanceiro != null)
				return false;
		} else if (!qtdFinanceiro.equals(other.qtdFinanceiro))
			return false;
		if (quality == null) {
			if (other.quality != null)
				return false;
		} else if (!quality.equals(other.quality))
			return false;
		if (re == null) {
			if (other.re != null)
				return false;
		} else if (!re.equals(other.re))
			return false;
		if (reemissaoDeBl == null) {
			if (other.reemissaoDeBl != null)
				return false;
		} else if (!reemissaoDeBl.equals(other.reemissaoDeBl))
			return false;
		if (sd == null) {
			if (other.sd != null)
				return false;
		} else if (!sd.equals(other.sd))
			return false;
		if (situacaoDocumento == null) {
			if (other.situacaoDocumento != null)
				return false;
		} else if (!situacaoDocumento.equals(other.situacaoDocumento))
			return false;
		if (taxaDeLiberacaodeBL == null) {
			if (other.taxaDeLiberacaodeBL != null)
				return false;
		} else if (!taxaDeLiberacaodeBL.equals(other.taxaDeLiberacaodeBL))
			return false;
		if (taxaDeTransmissao == null) {
			if (other.taxaDeTransmissao != null)
				return false;
		} else if (!taxaDeTransmissao.equals(other.taxaDeTransmissao))
			return false;
		if (taxaDoDolar == null) {
			if (other.taxaDoDolar != null)
				return false;
		} else if (!taxaDoDolar.equals(other.taxaDoDolar))
			return false;
		if (terminal == null) {
			if (other.terminal != null)
				return false;
		} else if (!terminal.equals(other.terminal))
			return false;
		if (terminalDescargaEstufe == null) {
			if (other.terminalDescargaEstufe != null)
				return false;
		} else if (!terminalDescargaEstufe.equals(other.terminalDescargaEstufe))
			return false;
		if (terminalEmissaoNfPortoEmbarque == null) {
			if (other.terminalEmissaoNfPortoEmbarque != null)
				return false;
		} else if (!terminalEmissaoNfPortoEmbarque.equals(other.terminalEmissaoNfPortoEmbarque))
			return false;
		if (timeLog == null) {
			if (other.timeLog != null)
				return false;
		} else if (!timeLog.equals(other.timeLog))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		if (tipoContainer == null) {
			if (other.tipoContainer != null)
				return false;
		} else if (!tipoContainer.equals(other.tipoContainer))
			return false;
		if (tipoDeQuantidadeParaCertificados == null) {
			if (other.tipoDeQuantidadeParaCertificados != null)
				return false;
		} else if (!tipoDeQuantidadeParaCertificados.equals(other.tipoDeQuantidadeParaCertificados))
			return false;
		if (valorFob == null) {
			if (other.valorFob != null)
				return false;
		} else if (!valorFob.equals(other.valorFob))
			return false;
		if (verificaCafe == null) {
			if (other.verificaCafe != null)
				return false;
		} else if (!verificaCafe.equals(other.verificaCafe))
			return false;
		if (verificaDDE == null) {
			if (other.verificaDDE != null)
				return false;
		} else if (!verificaDDE.equals(other.verificaDDE))
			return false;
		if (verificaDataSadvice == null) {
			if (other.verificaDataSadvice != null)
				return false;
		} else if (!verificaDataSadvice.equals(other.verificaDataSadvice))
			return false;
		if (verificaEstufe == null) {
			if (other.verificaEstufe != null)
				return false;
		} else if (!verificaEstufe.equals(other.verificaEstufe))
			return false;
		if (verificaRE == null) {
			if (other.verificaRE != null)
				return false;
		} else if (!verificaRE.equals(other.verificaRE))
			return false;
		if (viagem == null) {
			if (other.viagem != null)
				return false;
		} else if (!viagem.equals(other.viagem))
			return false;
		return true;
	}
	
	public Matriz() {
	}

	public Matriz(Integer id, String contratoVenda, String dde, Date datadde, String contratoBuyer, String tipo,
			String qtd, String qtdContainer, String tipoContainer, String embarque, Date chegadaCafeData,
			Date chegadaCafeHora, Date dataDeCadastro, String marcaOic, String destino, String re, String sd,
			String navio, String viagem, String booking, Date eta, Date dataDraft, Date horaDraft, Date dataCarga,
			Date horaCarga, String terminal, String armador, String pais, String porto, String importador,
			String notify1, String enderecoNotify1, String notify2, String enderecoNotify2, String notify3,
			String enderecoNotify3, String consignee, String enderecoConsignee, String descriptionOfGoods,
			String billOfLadingDate, String packed, String quality, String placeOfInspection, String dateOfInspection,
			String timeLog, String tipoDeQuantidadeParaCertificados, String additionalInformation,
			String peloLiquidoKGS, String peloBrutoKGS, Double valorFob, String marcas, String nfExportacao,
			Date dataEmissao, String instrucaoEstufe, Date dataEstufe, String localEstufe, Date dataPresencaDeCarga,
			String terminalDescargaEstufe, String terminalEmissaoNfPortoEmbarque, String obsPedidoCafe,
			Date dataSAdvice, Date dataFinalCertificado, String numeroBL, Date dataBL, String obsFollowUP,
			String fumigacao, String fito, String ico, String isf, String liberacao, String draftBL,
			String prontificacao, String documentoOriginal, Date dataDocumentoOriginal, String obsPresencaDeCarga,
			String portofDischarge, String blType, String cargoDescription, String oceanFreight,
			String paisOceanFreight, String pallets, String ncm, String origemDoCafe, String capatazia,
			String taxaDeLiberacaodeBL, String lacre, String isps, String lateArrivel, String correcaoDeBl,
			String reemissaoDeBl, String detention, String frete, String taxaDeTransmissao, String taxaDoDolar,
			Date dataFumigacao, Date dataDraftBL, Date dataVGM, String ddeLiberada, String previsaoSaidaNavio,
			Date dataRequerimentoICO, Date dataISF, Date dataRequerimentoFITO, Date dataPedidoPagamento,
			Date dataPagamento, Date dataRetiradaBL, Date dataCorrecaoBL, Date dataICO, Date dataFitoSanitario,
			Date dataCamaraComercio, Date dataCertificadoFumigacao, Date dataEnviadoAprovacao, String situacaoDocumento,
			Date dataCamaraArabe, Date dataPedirBooking, Date dataPedidoContainer, Date dataPedidoFumigacao,
			Date dataFazerReceberRE, Date dataFazerMemorando, Date dataDocsAprovacao, String certificadoLions,
			String observacaoEmbarque, Date dataLiberacao, Date dataProntificacao, Date dataPedidoCafe,
			Double qtdFinanceiro, String cliente, Certificado certificado, String verificaCafe, String verificaEstufe,
			String verificaRE, String verificaDDE, String verificaDataSadvice) {
		super();
		this.id = id;
		this.contratoVenda = contratoVenda;
		this.dde = dde;
		this.datadde = datadde;
		this.contratoBuyer = contratoBuyer;
		this.tipo = tipo;
		this.qtd = qtd;
		this.qtdContainer = qtdContainer;
		this.tipoContainer = tipoContainer;
		this.embarque = embarque;
		this.chegadaCafeData = chegadaCafeData;
		this.chegadaCafeHora = chegadaCafeHora;
		this.dataDeCadastro = dataDeCadastro;
		this.marcaOic = marcaOic;
		this.destino = destino;
		this.re = re;
		this.sd = sd;
		this.navio = navio;
		this.viagem = viagem;
		this.booking = booking;
		this.eta = eta;
		DataDraft = dataDraft;
		HoraDraft = horaDraft;
		this.dataCarga = dataCarga;
		this.horaCarga = horaCarga;
		this.terminal = terminal;
		this.armador = armador;
		this.pais = pais;
		this.porto = porto;
		this.importador = importador;
		this.notify1 = notify1;
		this.enderecoNotify1 = enderecoNotify1;
		this.notify2 = notify2;
		this.enderecoNotify2 = enderecoNotify2;
		this.notify3 = notify3;
		this.enderecoNotify3 = enderecoNotify3;
		this.consignee = consignee;
		this.enderecoConsignee = enderecoConsignee;
		this.descriptionOfGoods = descriptionOfGoods;
		this.billOfLadingDate = billOfLadingDate;
		this.packed = packed;
		this.quality = quality;
		this.placeOfInspection = placeOfInspection;
		this.dateOfInspection = dateOfInspection;
		this.timeLog = timeLog;
		this.tipoDeQuantidadeParaCertificados = tipoDeQuantidadeParaCertificados;
		this.additionalInformation = additionalInformation;
		this.peloLiquidoKGS = peloLiquidoKGS;
		this.peloBrutoKGS = peloBrutoKGS;
		this.valorFob = valorFob;
		this.marcas = marcas;
		this.nfExportacao = nfExportacao;
		this.dataEmissao = dataEmissao;
		this.instrucaoEstufe = instrucaoEstufe;
		this.dataEstufe = dataEstufe;
		this.localEstufe = localEstufe;
		this.dataPresencaDeCarga = dataPresencaDeCarga;
		this.terminalDescargaEstufe = terminalDescargaEstufe;
		this.terminalEmissaoNfPortoEmbarque = terminalEmissaoNfPortoEmbarque;
		this.obsPedidoCafe = obsPedidoCafe;
		this.dataSAdvice = dataSAdvice;
		this.dataFinalCertificado = dataFinalCertificado;
		this.numeroBL = numeroBL;
		this.dataBL = dataBL;
		this.obsFollowUP = obsFollowUP;
		this.fumigacao = fumigacao;
		this.fito = fito;
		this.ico = ico;
		this.isf = isf;
		this.liberacao = liberacao;
		this.draftBL = draftBL;
		this.prontificacao = prontificacao;
		this.documentoOriginal = documentoOriginal;
		this.dataDocumentoOriginal = dataDocumentoOriginal;
		this.obsPresencaDeCarga = obsPresencaDeCarga;
		this.portofDischarge = portofDischarge;
		this.blType = blType;
		this.cargoDescription = cargoDescription;
		this.oceanFreight = oceanFreight;
		this.paisOceanFreight = paisOceanFreight;
		this.pallets = pallets;
		this.ncm = ncm;
		this.origemDoCafe = origemDoCafe;
		this.capatazia = capatazia;
		this.taxaDeLiberacaodeBL = taxaDeLiberacaodeBL;
		this.lacre = lacre;
		this.isps = isps;
		this.lateArrivel = lateArrivel;
		this.correcaoDeBl = correcaoDeBl;
		this.reemissaoDeBl = reemissaoDeBl;
		this.detention = detention;
		this.frete = frete;
		this.taxaDeTransmissao = taxaDeTransmissao;
		this.taxaDoDolar = taxaDoDolar;
		this.dataFumigacao = dataFumigacao;
		this.dataDraftBL = dataDraftBL;
		this.dataVGM = dataVGM;
		this.ddeLiberada = ddeLiberada;
		this.previsaoSaidaNavio = previsaoSaidaNavio;
		this.dataRequerimentoICO = dataRequerimentoICO;
		this.dataISF = dataISF;
		this.dataRequerimentoFITO = dataRequerimentoFITO;
		this.dataPedidoPagamento = dataPedidoPagamento;
		this.dataPagamento = dataPagamento;
		this.dataRetiradaBL = dataRetiradaBL;
		this.dataCorrecaoBL = dataCorrecaoBL;
		this.dataICO = dataICO;
		this.dataFitoSanitario = dataFitoSanitario;
		this.dataCamaraComercio = dataCamaraComercio;
		this.dataCertificadoFumigacao = dataCertificadoFumigacao;
		this.dataEnviadoAprovacao = dataEnviadoAprovacao;
		this.situacaoDocumento = situacaoDocumento;
		this.dataCamaraArabe = dataCamaraArabe;
		this.dataPedirBooking = dataPedirBooking;
		this.dataPedidoContainer = dataPedidoContainer;
		this.dataPedidoFumigacao = dataPedidoFumigacao;
		this.dataFazerReceberRE = dataFazerReceberRE;
		this.dataFazerMemorando = dataFazerMemorando;
		this.dataDocsAprovacao = dataDocsAprovacao;
		this.certificadoLions = certificadoLions;
		this.observacaoEmbarque = observacaoEmbarque;
		this.dataLiberacao = dataLiberacao;
		this.dataProntificacao = dataProntificacao;
		this.dataPedidoCafe = dataPedidoCafe;
		this.qtdFinanceiro = qtdFinanceiro;
		this.cliente = cliente;
		this.certificado = certificado;
		this.verificaCafe = verificaCafe;
		this.verificaEstufe = verificaEstufe;
		this.verificaRE = verificaRE;
		this.verificaDDE = verificaDDE;
		this.verificaDataSadvice = verificaDataSadvice;
	}

	public Integer getId() {
		return id;
	}
	
	
}