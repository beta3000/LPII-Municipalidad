package etiquetas;

import java.util.List;
import java.util.ResourceBundle;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import beans.ComboDTO;
import service.ManteComboService;

public class ComboDinamico extends TagSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre,sql;
	private int valor = -1;
	
	@Override
	public int doStartTag() throws JspException {
		ManteComboService m = new ManteComboService();
		ResourceBundle rb = ResourceBundle.getBundle("tags");
		JspWriter out = pageContext.getOut();
		try {
			List<ComboDTO> lista = m.listarCombo(rb.getString(sql));
			for(ComboDTO obj : lista){
				if(valor == obj.getCod_tipo() ){
					out.print("<option value='"+obj.getCod_tipo()+"' selected>");
					out.print(obj.getNom_tipo());
					out.print("</option>");
				}else{
					out.print("<option value='"+obj.getCod_tipo()+"'>");
					out.print(obj.getNom_tipo());
					out.print("</option>");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return super.doStartTag();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
}
