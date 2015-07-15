package misServlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.MemorandoDTO;
import service.ManteMemorandoService;

/**
 * Servlet implementation class MantenimientoMemorando
 */
public class MantenimientoMemorando extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ManteMemorandoService m = new ManteMemorandoService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MantenimientoMemorando() {
        super();
       
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tipo = request.getParameter("tipo");
		
		if(tipo.equals("listarMemorandoRequerimientoVehicular")){
			listarMemorandoRequerimientoVehicular(request,response);
		}else if(tipo.equals("listarMemorandoReparacionVehicular")){
			listarMemorandoReparacionVehicular(request,response);
		}else if(tipo.equals("registrarMemorando")){
			registrarMemorando(request,response);
		}else if(tipo.equals("cargarDatosMemorandoSecretaria")){
			cargarDatosMemorandoSecretaria(request,response);
		}else if(tipo.equals("aprobarMemorandoSecretaria")){
			aprobarMemorandoSecretaria(request,response);
		}else if(tipo.equals("desaprobarMemorandoSecretaria")){
			desaprobarMemorandoSecretaria(request,response);
		}else if(tipo.equals("listarMemorandoRequerimientoVehicularSecretaria")){
			listarMemorandoRequerimientoVehicularSecretaria(request,response);
		}else if(tipo.equals("listarMemorandoReparacionVehicularJSGL")){
			listarMemorandoReparacionVehicularJSGL(request,response);
		}else if(tipo.equals("cargarDatosMemorandoJSGL")){
			cargarDatosMemorandoJSGL(request,response);
		}else if(tipo.equals("aprobarMemorandoJSGL")){
			aprobarMemorandoJSGL(request,response);
		}else if(tipo.equals("desaprobarMemorandoJSGL")){
			desaprobarMemorandoJSGL(request,response);
		}else if(tipo.equals("listarMemorandoRequerimientoVehicularAdmin")){
			listarMemorandoRequerimientoVehicularAdmin(request,response);
		}else if(tipo.equals("listarMemorandoReparacionVehicularAdmin")){
			listarMemorandoReparacionVehicularAdmin(request,response);
		}
	}

	private void listarMemorandoReparacionVehicularAdmin(
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("listaMemorandoReparacionVehicularAdmin", m.listaMemorandosReparacionVehicular());
		request.getRequestDispatcher("a-memorandos-2-listado.jsp").forward(request, response);
		
	}

	private void listarMemorandoRequerimientoVehicularAdmin(
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("listaMemorandoRequerimientoVehicularAdmin", m.listaMemorandosRequerimientoVehicular());
		request.getRequestDispatcher("a-memorandos-1-listado.jsp").forward(request, response);
		
	}

	private void desaprobarMemorandoJSGL(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		int idMemorando = Integer.parseInt(request.getParameter("idMemorando"));
		if(m.desaprobarMemorando(idMemorando) == 1){
			response.sendRedirect("jsgl-escritorio.jsp");
		}
		
	}

	private void aprobarMemorandoJSGL(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		int idMemorando = Integer.parseInt(request.getParameter("idMemorando"));
		if(m.aprobarMemorando(idMemorando) == 1){
			response.sendRedirect("jsgl-escritorio.jsp");
		}
		
	}

	private void cargarDatosMemorandoJSGL(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int idMemorando = Integer.parseInt(request.getParameter("idMemorando"));
		request.setAttribute("memorando", m.buscaMemorando(idMemorando));
		request.getRequestDispatcher("jsgl-memorandos-2-revisar.jsp").forward(request, response);
		
	}

	private void listarMemorandoReparacionVehicularJSGL(
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("listaMemorandoReparacionVehicularJSGL", m.listaMemorandosReparacionVehicular());
		request.getRequestDispatcher("jsgl-memorandos-2-listado.jsp").forward(request, response);
		
	}

	private void desaprobarMemorandoSecretaria(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		int idMemorando = Integer.parseInt(request.getParameter("idMemorando"));
		if(m.desaprobarMemorando(idMemorando) == 1){
			response.sendRedirect("se-escritorio.jsp");
		}
		
	}

	private void listarMemorandoRequerimientoVehicularSecretaria(
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("listaMemorandoRequerimientoVehicularSecretaria", m.listaMemorandosRequerimientoVehicular());
		request.getRequestDispatcher("se-memorandos-1-listado.jsp").forward(request, response);
		
	}

	private void aprobarMemorandoSecretaria(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		int idMemorando = Integer.parseInt(request.getParameter("idMemorando"));
		if(m.aprobarMemorando(idMemorando) == 1){
			response.sendRedirect("se-escritorio.jsp");
		}
		
	}

	private void cargarDatosMemorandoSecretaria(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int idMemorando = Integer.parseInt(request.getParameter("idMemorando"));
		request.setAttribute("memorando", m.buscaMemorando(idMemorando));
		request.getRequestDispatcher("se-memorandos-1-revisar.jsp").forward(request, response);
		
	}

	private void registrarMemorando(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		int estado = -1;
		String fechaMemorando = request.getParameter("txtFecha");
		String contenidoMemorando = request.getParameter("txtContenido");
		int idAsuntoMemorando = Integer.parseInt(request.getParameter("idAsunto"));
		int idEstadoMemorando = Integer.parseInt(request.getParameter("idEstado"));
		int idUsuarioRemitente = Integer.parseInt(request.getParameter("idusuario"));
		
		MemorandoDTO me = new MemorandoDTO();
		me.setFechaMemorando(fechaMemorando);
		me.setContenidoMemorando(contenidoMemorando);
		me.setIdAsuntoMemorando(idAsuntoMemorando);
		me.setIdEstadoMemorando(idEstadoMemorando);
		me.setIdUsuarioRemitente(idUsuarioRemitente);
		estado = m.registraMemorando(me);
		if(estado == 1){
			response.sendRedirect("ja-escritorio.jsp");
		}
		
	}

	private void listarMemorandoReparacionVehicular(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("listaMemorandoReparacionVehicular", m.listaMemorandosReparacionVehicular());
		request.getRequestDispatcher("ja-memorandos-2-listado.jsp").forward(request, response);
	}

	private void listarMemorandoRequerimientoVehicular(
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("listaMemorandoRequerimientoVehicular", m.listaMemorandosRequerimientoVehicular());
		request.getRequestDispatcher("ja-memorandos-1-listado.jsp").forward(request, response);
	}

}
