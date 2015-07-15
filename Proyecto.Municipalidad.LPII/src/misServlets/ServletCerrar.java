package misServlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletCerrar
 */
public class ServletCerrar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCerrar() {
        super();
        
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Recuperar Sesion
		HttpSession laSesion = request.getSession();
		//Eliminar Sesion
		laSesion.invalidate();
		//enviar a la página index
		request.setAttribute("msj", "Sebe iniciar Sesión");
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

}
