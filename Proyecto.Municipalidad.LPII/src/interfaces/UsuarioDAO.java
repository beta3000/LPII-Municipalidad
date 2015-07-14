package interfaces;

import java.util.List;

import beans.UsuarioDTO;

public interface UsuarioDAO {

	public List<UsuarioDTO> listarUsuariosAdministradores();
	public int registrarUsuarioAdministrador(UsuarioDTO u);
	public UsuarioDTO buscarUsuarioAdministrador(int idUsuario);
	public int modificarUsuarioAdministrador(UsuarioDTO u);
	public int eliminarUsuarioAdministrador(int idUsuario);
	public UsuarioDTO iniciarSesion(String login);
	public List<UsuarioDTO> listarUsuariosEmpleados();
	public int registrarUsuarioEmpleado(UsuarioDTO u);
	public UsuarioDTO buscarUsuarioempleado(int idUsuario);
	public int modificarUsuarioEmpleado(UsuarioDTO u);
	public int eliminarUsuarioEmpleado(int idUsuario);
}
