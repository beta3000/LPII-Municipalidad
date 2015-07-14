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
	public UsuarioDTO iniciaSesion(String login){
		return objUsuario.iniciarSesion(login);
	}
	public List<UsuarioDTO> listaUsuariosEmpleados(){
		return objUsuario.listarUsuariosEmpleados();
	}
	public int registraUsuarioEmpleado(UsuarioDTO u){
		return objUsuario.registrarUsuarioEmpleado(u);
	}
	public UsuarioDTO buscaUsuarioempleado(int idUsuario){
		return objUsuario.buscarUsuarioempleado(idUsuario);
	}
	public int modificaUsuarioEmpleado(UsuarioDTO u){
		return objUsuario.modificarUsuarioEmpleado(u);
	}
	public int eliminaUsuarioEmpleado(int idUsuario){
		return objUsuario.eliminarUsuarioEmpleado(idUsuario);
	}
}
