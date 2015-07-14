package misServlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MantenimientoMemorando
 */
public class MantenimientoMemorando extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
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
		}else if(tipo.equals("")){
			
		}
	}

	private void registrarMemorando(HttpServletRequest request,
			HttpServletResponse response) {
		
		
	}

	private void listarMemorandoReparacionVehicular(HttpServletRequest request,
			HttpServletResponse response) {
		
		
	}

	private void listarMemorandoRequerimientoVehicular(
			HttpServletRequest request, HttpServletResponse response) {
		
		
	}

}
