package util;

import java.util.Map;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import entity.Departamento;

@FacesConverter(forClass = Departamento.class)
public class DepartamentoConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String string) {
		Departamento dep = new Departamento();
		if (string != null) {
			return this.getAttributesFrom(arg1).get(string);
		}
		return dep;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object obj) {
		Departamento dep = new Departamento();
		dep = (Departamento) obj;
		return dep.getNomeDepartamento();
	}

	protected Map<String, Object> getAttributesFrom(UIComponent component) {
		return component.getAttributes();
	}

}
