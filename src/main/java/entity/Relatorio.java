package entity;

import java.io.InputStream;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

public class Relatorio {
	
	public static void gerarRelatorio(String caminho, JRDataSource jrd,
			Map<String, Object> parametros) {

		FacesContext c = FacesContext.getCurrentInstance();
		try {
			InputStream arquivo = c.getExternalContext().getResourceAsStream(
					caminho);
			
			byte[] pdf = JasperRunManager.runReportToPdf(arquivo, parametros, jrd);
			HttpServletResponse response = (HttpServletResponse) c
					.getExternalContext().getResponse();
			ServletOutputStream out = response.getOutputStream();
			out.write(pdf);
			out.flush();
			out.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			c.responseComplete();
		}
	}

}
