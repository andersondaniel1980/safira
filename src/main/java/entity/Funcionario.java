package entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Funcionario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(unique = true)
	private String nome;

	@Column // N�o posso colocar unique porque pode ficar nulo no cadastro
	private String cpf;

	@Column(name = "dataNascimento")
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;

	@Column // N�o posso colocar unique porque pode ficar nulo no cadastro
	private String identidade;

	@Column
	private String orgao;

	@Column
	private String carteiraProfissional;

	@Column
	private String serie;

	@Column
	private String habilitacao;

	@Column
	private String pis;

	@Column
	private String registro;

	@Column
	private Double salario;

	@Column
	private String telefoneFixo;

	@Column
	private String telefoneCelular;

	@Column
	private String cargo;

	@Column
	private String foto;

	@Column
	private String nomePai;

	@Column
	private String nomeMae;

	private String departamento;
	
	@JoinColumn(name = "endereco_id", referencedColumnName = "id")
    @OneToOne(optional = false, fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	private Endereco endereco;

	@JoinColumn(name = "dadosBancario_id", referencedColumnName = "id")
    @OneToOne(optional = false, fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	private DadosBancario banco;
	
	public Funcionario() {
	}

	public Funcionario(Integer id, String nome, String cpf, Date dataNascimento, String identidade, String orgao,
			String carteiraProfissional, String serie, String habilitacao, String pis, String registro, Double salario,
			String telefoneFixo, String telefoneCelular, String cargo, String foto, String nomePai, String nomeMae,
			String departamento) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.identidade = identidade;
		this.orgao = orgao;
		this.carteiraProfissional = carteiraProfissional;
		this.serie = serie;
		this.habilitacao = habilitacao;
		this.pis = pis;
		this.registro = registro;
		this.salario = salario;
		this.telefoneFixo = telefoneFixo;
		this.telefoneCelular = telefoneCelular;
		this.cargo = cargo;
		this.foto = foto;
		this.nomePai = nomePai;
		this.nomeMae = nomeMae;
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento
				+ ", identidade=" + identidade + ", orgao=" + orgao + ", carteiraProfissional=" + carteiraProfissional
				+ ", serie=" + serie + ", habilitacao=" + habilitacao + ", pis=" + pis + ", registro=" + registro
				+ ", salario=" + salario + ", telefoneFixo=" + telefoneFixo + ", telefoneCelular=" + telefoneCelular
				+ ", cargo=" + cargo + ", foto=" + foto + ", nomePai=" + nomePai + ", nomeMae=" + nomeMae
				+ ", departamento=" + departamento + ", endereco=" + endereco + ", banco=" + banco + "]";
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getIdentidade() {
		return identidade;
	}

	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}

	public String getOrgao() {
		return orgao;
	}

	public void setOrgao(String orgao) {
		this.orgao = orgao;
	}

	public String getCarteiraProfissional() {
		return carteiraProfissional;
	}

	public void setCarteiraProfissional(String carteiraProfissional) {
		this.carteiraProfissional = carteiraProfissional;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getHabilitacao() {
		return habilitacao;
	}

	public void setHabilitacao(String habilitacao) {
		this.habilitacao = habilitacao;
	}

	public String getPis() {
		return pis;
	}

	public void setPis(String pis) {
		this.pis = pis;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getTelefoneFixo() {
		return telefoneFixo;
	}

	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}

	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public DadosBancario getBanco() {
		return banco;
	}

	public void setBanco(DadosBancario banco) {
		this.banco = banco;
	}
}
