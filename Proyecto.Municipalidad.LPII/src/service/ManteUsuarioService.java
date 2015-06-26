package service;

import java.util.List;

import beans.UsuarioDTO;
import interfaces.UsuarioDAO;
import utils.Constantes;
import dao.DAOFactory;

public class ManteUsuarioService {

	DAOFactory fabrica = DAOFactory.getDAOFactory(Constantes.ORIGEN_DATOS);
	UsuarioDAO objUsuario = fabrica.getUsuarioDAO();
	
	public List<UsuarioDTO> listaUsuariosAdministradores(){
		return objUsuario.listarUsuariosAdministradores();
	}
	public int registraUsuarioAdministrador(UsuarioDTO u){
		return objUsuario.registrarUsuarioAdministrador(u);
	}
	public UsuarioDTO buscaUsuarioAdministrador(int idUsuario){
		return objUsuario.buscarUsuarioAdministrador(idUsuario);
	}
	public int modificaUsuarioAdministrador(UsuarioDTO u){
		return objUsuario.modificarUsuarioAdministrador(u);
	}
	public int eliminaUsuarioAdministrador(int idUsuario){
		return objUsuario.eliminarUsuarioAdministrador(idUsuario);
	}
	
	/*public EmpleadoDTO iniciaSesion(String login){
		return obj.iniciarSesion(login);
	}*/
	
	public UsuarioDTO iniciaSesion(String login){
		return objUsuario.iniciarSesion(login);
	}
}
