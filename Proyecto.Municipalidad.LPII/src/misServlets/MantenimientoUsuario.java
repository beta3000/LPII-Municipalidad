package misServlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.UsuarioDTO;
import service.ManteUsuarioService;

/**
 * Servlet implementation class MantenimientoUsuario
 */
public class MantenimientoUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ManteUsuarioService m = new ManteUsuarioService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MantenimientoUsuario() {
        super();
        
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tipo = request.getParameter("tipo");
		
		if(tipo.equals("registrarAdministrador")){
			registrarAdministrador(request,response);
		}else if(tipo.equals("listarAdministrador")){
			listarAdministrador(request,response);
		}else if(tipo.equals("cargarDatosAdministrador")){
			cargarDatosAdministrador(request,response);
		}
		else if(tipo.equals("modificarAdministrador")){
			modificarAdministrador(request,response);
		}else if(tipo.equals("eliminarAdministrador")){
			eliminarAdministrador(request,response);
		}else if(tipo.equals("sesion")){
			sesion(request,response);
		}
	}

	private void sesion(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login,clave;
		login = request.getParameter("txtLogin");
		clave = request.getParameter("txtPassword");
		
		UsuarioDTO u = m.iniciaSesion(login);
		if(u == null){//no existe el usuario
			request.setAttribute("msj", "No existe el usuario...");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else{//verificar si la clave coincide con el usuario
			if(u.getPasswordUsuario().equals(clave)){//si coincide la clave
				//crear sesion
				HttpSession laSesion = request.getSession();
				laSesion.setAttribute("USUARIO", u);
				request.getRequestDispatcher("a-escritorio.jsp").forward(request, response);
			}else{//no coincide la clave
				request.setAttribute("msj", "Clave no coincide con el usuario...");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}

		}
	}

	private void eliminarAdministrador(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int estado =-1;
		int idUsuarioAdministrador = Integer.parseInt(request.getParameter("idUsuarioAdministrador"));
		estado = m.eliminaUsuarioAdministrador(idUsuarioAdministrador);
		if(estado == 1){
			listarAdministrador(request,response);
		}
		
	}

	private void modificarAdministrador(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int estado =-1;
		int idUsuarioAdministrador = Integer.parseInt(request.getParameter("idUsuarioAdministrador"));
		String nombres = request.getParameter("txtNombres");
		String apPaterno = request.getParameter("txtApellidoPaterno");
		String apMaterno = request.getParameter("txtApellidoMaterno");
		String fecNac = request.getParameter("txtFecha");
		String direccion = request.getParameter("txtDireccion");
		String correo = request.getParameter("txtCorreo");
		String telefono = request.getParameter("txtTelefono");
		int dni = Integer.parseInt(request.getParameter("txtDNI"));
		String login = request.getParameter("txtLogin");
		String password = request.getParameter("txtPassword");
		int idDistrito = Integer.parseInt(request.getParameter("selectDistrito"));
		int idSexo = Integer.parseInt(request.getParameter("selectSexo"));
		UsuarioDTO u = new UsuarioDTO();
		u.setIdUsuario(idUsuarioAdministrador);
		u.setNombresUsuario(nombres);
		u.setApellidoPaternoUsuario(apPaterno);
		u.setApellidoMaternoUsuario(apMaterno);
		u.setFechaNacimientoUsuario(fecNac);
		u.setDireccionUsuario(direccion);
		u.setCorreoUsuario(correo);
		u.setTelefonoUsuario(telefono);
		u.setDniUsuario(dni);
		u.setLoginUsuario(login);
		u.setPasswordUsuario(password);
		u.setIdDistrito(idDistrito);
		u.setIdSexo(idSexo);
		estado = m.modificaUsuarioAdministrador(u);
		
		if(estado == 1){
			listarAdministrador(request,response);
		}
		
	}

	private void cargarDatosAdministrador(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int idUsuarioAdministrador = Integer.parseInt(request.getParameter("idUsuarioAdministrador"));
		request.setAttribute("usuarioAdministrador",m.buscaUsuarioAdministrador(idUsuarioAdministrador));
		request.getRequestDispatcher("a-administradores-modificar.jsp").forward(request, response);
		
	}

	private void listarAdministrador(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("listaAdministradores", m.listaUsuariosAdministradores());
		request.getRequestDispatcher("a-administradores-listado.jsp").forward(request, response);
		
	}

	private void registrarAdministrador(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int estado =-1;
		String nombres = request.getParameter("txtNombres");
		String apPaterno = request.getParameter("txtApellidoPaterno");
		String apMaterno = request.getParameter("txtApellidoMaterno");
		String fecNac = request.getParameter("txtFecha");
		String direccion = request.getParameter("txtDireccion");
		String correo = request.getParameter("txtCorreo");
		String telefono = request.getParameter("txtTelefono");
		int dni = Integer.parseInt(request.getParameter("txtDNI"));
		String login = request.getParameter("txtLogin");
		String password = request.getParameter("txtPassword");
		int idDistrito = Integer.parseInt(request.getParameter("selectDistrito"));
		int idSexo = Integer.parseInt(request.getParameter("selectSexo"));
		UsuarioDTO u = new UsuarioDTO();
		u.setNombresUsuario(nombres);
		u.setApellidoPaternoUsuario(apPaterno);
		u.setApellidoMaternoUsuario(apMaterno);
		u.setFechaNacimientoUsuario(fecNac);
		u.setDireccionUsuario(direccion);
		u.setCorreoUsuario(correo);
		u.setTelefonoUsuario(telefono);
		u.setDniUsuario(dni);
		u.setLoginUsuario(login);
		u.setPasswordUsuario(password);
		u.setIdDistrito(idDistrito);
		u.setIdSexo(idSexo);
		estado = m.registraUsuarioAdministrador(u);
		
		if(estado == 1){
			listarAdministrador(request,response);
		}
	}


}
