package misServlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.ManteTallerMecanicoService;
import beans.TallerMecanicoDTO;

/**
 * Servlet implementation class MantenimientoTallerMecanico
 */
public class MantenimientoTallerMecanico extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ManteTallerMecanicoService m = new ManteTallerMecanicoService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MantenimientoTallerMecanico() {
        super();
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String tipo = request.getParameter("tipo");
		
		if(tipo.equals("registrar")){
			registrar(request,response);
		}else if(tipo.equals("listar")){
			listar(request,response);
		}else if(tipo.equals("cargarDatos")){
			cargarDatos(request,response);
		}
		else if(tipo.equals("modificar")){
			modificar(request,response);
		}else if(tipo.equals("eliminar")){
			eliminar(request,response);
		}
	}

	private void eliminar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int estado =-1;
		int idTallerMecanico = Integer.parseInt(request.getParameter("idTaller"));
		estado = m.eliminaTallerMecanico(idTallerMecanico);
		if(estado == 1){
			listar(request,response);
		}
		
	}

	private void modificar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int estado =-1;
		int idTallerMecanico = Integer.parseInt(request.getParameter("idTaller"));
		String nombre = request.getParameter("txtNombre");
		String direccion = request.getParameter("txtDireccion");
		String telefono = request.getParameter("txtTelefono");
		int idDistrito = Integer.parseInt(request.getParameter("selectDistrito"));
		TallerMecanicoDTO t = new TallerMecanicoDTO();
		t.setIdTallerMecanico(idTallerMecanico);
		t.setNombreTallerMecanico(nombre);
		t.setDireccionTallerMecanico(direccion);
		t.setTelefonoTallerMecanico(telefono);
		t.setIdDistrito(idDistrito);
		estado = m.modificaTallerMecanico(t);
		if(estado == 1){
			listar(request,response);
		}
		
	}

	private void cargarDatos(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int idTallerMecanico = Integer.parseInt(request.getParameter("idTaller"));
		request.setAttribute("tallerMecanico",m.buscaTallerMecanico(idTallerMecanico));
		request.getRequestDispatcher("a-talleres-modificar.jsp").forward(request, response);
		
	}

	private void registrar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int estado =-1;
		String nombre = request.getParameter("txtNombre");
		String direccion = request.getParameter("txtDireccion");
		String telefono = request.getParameter("txtTelefono");
		int idDistrito = Integer.parseInt(request.getParameter("selectDistrito"));
		TallerMecanicoDTO t = new TallerMecanicoDTO();
		t.setNombreTallerMecanico(nombre);
		t.setDireccionTallerMecanico(direccion);
		t.setTelefonoTallerMecanico(telefono);
		t.setIdDistrito(idDistrito);
		estado = m.registraTallerMecanico(t);
		
		if(estado == 1){
			listar(request,response);
		}
		
	}

	private void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("listaTalleres", m.listaTalleresMecanicos());
		request.getRequestDispatcher("a-talleres-listado.jsp").forward(request, response);
		
	}

}
