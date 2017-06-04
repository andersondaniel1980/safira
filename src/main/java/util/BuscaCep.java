package util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.lavieri.modelutil.cep.WebServiceCep;
import entity.Endereco;

public class BuscaCep{
	
	private String mbCep = "";

	public void buscarEnderecoNovo() {
		Endereco endereco = new Endereco();
		endereco.setLogradouro(null);
		endereco.setBairro(null);
		endereco.setUf(null);
		endereco.setCep(null);

		FacesContext fc = FacesContext.getCurrentInstance();
		try {
			WebServiceCep ws = WebServiceCep.searchCep(mbCep);
			if (ws.wasSuccessful()) {
				endereco.setLogradouro(ws.getLogradouroFull());
				endereco.setBairro(ws.getBairro());
				endereco.setCidade(ws.getCidade());
				endereco.setUf(ws.getUf());
				endereco.setCep(ws.getCep());
				fc.addMessage("form1", new FacesMessage("Endereco Encontrado"));
			} else {
				endereco = new Endereco();
				fc.addMessage("form1", new FacesMessage("Endereco não Encontrado"));
			}
		} catch (Exception ex) {
			fc.addMessage("form1", new FacesMessage("Erro: " + ex.getMessage()));
		}
	}
	
}
