package misServlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.InformeDTO;
import service.ManteInformeService;

/**
 * Servlet implementation class MantenimientoInforme
 */
public class MantenimientoInforme extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ManteInformeService m = new ManteInformeService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MantenimientoInforme() {
        super();
        
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tipo = request.getParameter("tipo");
		
		if(tipo.equals("listarInformeServicioVehicularChofer")){
			listarInformeServicioVehicularChofer(request,response);
		}else if(tipo.equals("registrarInformeServicioVehicular")){
			registrarInformeServicioVehicular(request,response);
		}else if(tipo.equals("listarInformeServicioVehicularJASG")){
			listarInformeServicioVehicularJASG(request,response);
		}else if(tipo.equals("cargarDatosInformeJASG")){
			cargarDatosInformeJASG(request,response);
		}else if(tipo.equals("aprobarInformeJASG")){
			aprobarInformeJASG(request,response);
		}else if(tipo.equals("desaprobarInformeJASG")){
			desaprobarInformeJASG(request,response);
		}else if(tipo.equals("listarInformeServicioVehicularAdmin")){
			listarInformeServicioVehicularAdmin(request,response);
		}
	}

	private void listarInformeServicioVehicularAdmin(
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("listaInformeServicioVehicularAdmin", m.listaInformesServicioVehicular());
		request.getRequestDispatcher("a-informes-1-listado.jsp").forward(request, response);
	}

	private void desaprobarInformeJASG(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int idInforme = Integer.parseInt(request.getParameter("idInforme"));
		if(m.desaprobarInforme(idInforme) == 1){
			listarInformeServicioVehicularJASG(request,response);
		}
		
	}

	private void aprobarInformeJASG(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int idInforme = Integer.parseInt(request.getParameter("idInforme"));
		if(m.aprobarInforme(idInforme) == 1){
			listarInformeServicioVehicularJASG(request,response);
		}
		
	}

	private void cargarDatosInformeJASG(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int idInforme = Integer.parseInt(request.getParameter("idInforme"));
		request.setAttribute("informe", m.buscaInforme(idInforme));
		request.getRequestDispatcher("jasg-informes-1-revisar.jsp").forward(request, response);
		
	}

	private void listarInformeServicioVehicularJASG(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("listaInformeServicioVehicularJASG", m.listaInformesServicioVehicular());
		request.getRequestDispatcher("jasg-informes-1-listado.jsp").forward(request, response);
	}

	private void registrarInformeServicioVehicular(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String fechainforme = request.getParameter("txtFecha");
		String fechaEntregaInforme = request.getParameter("txtFechaEntrega");
		String contenidoInforme = request.getParameter("txtContenido");
		int idUsuarioRemitente = Integer.parseInt(request.getParameter("idusuario"));
		int idAsuntoInforme = Integer.parseInt(request.getParameter("idAsunto"));
		int idEstadoInforme = Integer.parseInt(request.getParameter("idEstado"));
		int idVehiculo = Integer.parseInt(request.getParameter("selectVehiculo"));
		
		InformeDTO i = new InformeDTO();
		i.setFechaInforme(fechainforme);
		i.setFechaEntregaInforme(fechaEntregaInforme);
		i.setContenidoInforme(contenidoInforme);
		i.setIdUsuarioRemitente(idUsuarioRemitente);
		i.setIdAsuntoInforme(idAsuntoInforme);
		i.setIdEstadoInforme(idEstadoInforme);
		i.setIdVehiculo(idVehiculo);
		
		if(m.registraInformeServicioVehicular(i) == 1){
			listarInformeServicioVehicularChofer(request,response);
		}
			
	}

	private void listarInformeServicioVehicularChofer(
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("listaInformeServicioVehicularChofer", m.listaInformesServicioVehicular());
		request.getRequestDispatcher("chofer-informes-1-listado.jsp").forward(request, response);
	}

}
