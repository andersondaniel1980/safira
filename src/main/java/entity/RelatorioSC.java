package entity;

import java.util.Iterator;
import java.util.List;


import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

public class RelatorioSC implements JRDataSource {

	private Iterator<Matriz> listagemMatriz;
	private Matriz item;

	public RelatorioSC(List<Matriz> dados) {
		listagemMatriz = dados.iterator();
	}

	@Override
	public Object getFieldValue(JRField campo) throws JRException {
		
		if (campo.getName().equals("contratoVenda")) {
			return item.getContratoVenda();
		}

		if (campo.getName().equals("cliente")) {
			return item.getCliente();
		}
		
		if (campo.getName().equals("embarque")) {
			return item.getEmbarque();
		}

		if (campo.getName().equals("dataEstufe")) {
			return item.getDataEstufe();
		}
	
		if (campo.getName().equals("destino")) {
			return item.getDestino();
		}
		
		if (campo.getName().equals("qtd")) {
			return item.getQtd();
		}
		
		if (campo.getName().equals("marcaOic")) {
			return item.getMarcaOic();
		}
		
		
		return null;
	}

	@Override
	public boolean next() throws JRException {
		if (listagemMatriz.hasNext()) {
			item = listagemMatriz.next();
			return true;
		}
		return false;
	}

}
