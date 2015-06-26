package misServlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.VehiculoDTO;
import service.ManteVehiculoService;

/**
 * Servlet implementation class MantenimientoVehiculo
 */
public class MantenimientoVehiculo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ManteVehiculoService m = new ManteVehiculoService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MantenimientoVehiculo() {
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
		int idVehiculo = Integer.parseInt(request.getParameter("idVehiculo"));
		estado = m.eliminaVehiculo(idVehiculo);
		if(estado == 1){
			listar(request,response);
		}
		
	}

	private void cargarDatos(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int idVehiculo = Integer.parseInt(request.getParameter("idVehiculo"));
		request.setAttribute("vehiculo",m.buscaVehiculo(idVehiculo));
		request.getRequestDispatcher("a-vehiculos-modificar.jsp").forward(request, response);
		
	}

	private void modificar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int estado =-1;
		int idVehiculo = Integer.parseInt(request.getParameter("idVehiculo"));
		String placa = request.getParameter("txtPlaca");
		String marca = request.getParameter("txtMarca");
		String modelo = request.getParameter("txtModelo");
		int anio = Integer.parseInt(request.getParameter("txtAnio"));
		String color = request.getParameter("txtColor");
		VehiculoDTO v = new VehiculoDTO();
		v.setIdVehiculo(idVehiculo);
		v.setPlacaVehiculo(placa);
		v.setMarcaVehiculo(marca);
		v.setModeloVehiculo(modelo);
		v.setAnioFabricacionVehiculo(anio);
		v.setColorVehiculo(color);
		estado = m.modificaVehiculo(v);
		if(estado == 1){
			listar(request,response);
		}
	}

	private void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("listaVehiculos", m.listaVehiculos());
		request.getRequestDispatcher("a-vehiculos-listado.jsp").forward(request, response);
	}

	private void registrar(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		int estado =-1;
		String placa = request.getParameter("txtPlaca");
		String marca = request.getParameter("txtMarca");
		String modelo = request.getParameter("txtModelo");
		int anio = Integer.parseInt(request.getParameter("txtAnio"));
		String color = request.getParameter("txtColor");
		VehiculoDTO v = new VehiculoDTO();
		v.setPlacaVehiculo(placa);
		v.setMarcaVehiculo(marca);
		v.setModeloVehiculo(modelo);
		v.setAnioFabricacionVehiculo(anio);
		v.setColorVehiculo(color);
		estado = m.registraVehiculo(v);
		
		if(estado == 1){
			listar(request,response);
		}
	}

}
