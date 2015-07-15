package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import utils.MySqlDBConexion;
import beans.UsuarioDTO;
import interfaces.UsuarioDAO;

public class MySqlUsuarioDAO implements UsuarioDAO {

	@Override
	public List<UsuarioDTO> listarUsuariosAdministradores() {
		List<UsuarioDTO> data = new ArrayList<UsuarioDTO>();
		UsuarioDTO u = null;
		Connection cn = null;
		PreparedStatement pstm = null;
		String sql = "";
		ResultSet rs = null;
		try {
			cn = MySqlDBConexion.getConexion();
			sql = "select u.idUsuario,u.nombresUsuario,u.apellidoPaternoUsuario,u.apellidoMaternoUsuario,"
					+ "u.fechaNacimientoUsuario,u.direccionUsuario,"
					+ "u.correoUsuario, u.telefonoUsuario,u.dniUsuario,u.sexousuario,u.loginUsuario,u.passwordUsuario,"
					+ "u.idTipoUsuario,tu.descripcionTipoUsuario,u.idDistrito,d.nombreDistrito,"
					+ "u.idAreaMunicipal,am.nombreAreaMunicipal,"
					+ "u.idEstadoUsuario,eu.descripcionEstadoUsuario "
					+ "from Usuario as u inner join TipoUsuario as tu "
					+ "on u.idTipoUsuario = tu.idtipoUsuario inner join Distrito as d "
					+ "on u.idDistrito = d.idDistrito inner join AreaMunicipal as am "
					+ "on u.idAreaMunicipal = am.idAreaMunicipal inner join EstadoUsuario as eu "
					+ "on u.idEstadoUsuario = eu.idEstadoUsuario "
					+ "where u.idTipoUsuario = 1";
			pstm = cn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while(rs.next()){
				u = new UsuarioDTO();
				u.setIdUsuario(rs.getInt(1));
				u.setNombresUsuario(rs.getString(2));
				u.setApellidoPaternoUsuario(rs.getString(3));
				u.setApellidoMaternoUsuario(rs.getString(4));
				u.setFechaNacimientoUsuario(rs.getString(5));
				u.setDireccionUsuario(rs.getString(6));
				u.setCorreoUsuario(rs.getString(7));
				u.setTelefonoUsuario(rs.getString(8));
				u.setDniUsuario(rs.getInt(9));
				u.setSexoUsuario(rs.getString(10));
				u.setLoginUsuario(rs.getString(11));
				u.setPasswordUsuario(rs.getString(12));
				u.setIdTipoUsuario(rs.getInt(13));
				u.setDescripcionTipoUsuario(rs.getString(14));
				u.setIdDistrito(rs.getInt(15));
				u.setNombreDistrito(rs.getString(16));
				u.setIdAreaMunicipal(rs.getInt(17));
				u.setNombreAreaMunicipal(rs.getString(18));
				u.setIdEstadoUsuario(rs.getInt(19));
				u.setDescripcionEstadoUsuario(rs.getString(20));
				data.add(u);				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(rs != null){rs.close();}
				if(pstm != null){pstm.close();}
				if(cn != null){cn.close();}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return data;
	}

	@Override
	public int registrarUsuarioAdministrador(UsuarioDTO u) {
		int estado = -1;
		Connection cn = null;
		PreparedStatement pstm = null;
		String sql ="";
		try {
			cn = MySqlDBConexion.getConexion();
			sql = "insert into usuario values(null,?,?,?,?,?,?,?,?,?,?,?,1,?,1,1)";
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, u.getNombresUsuario());
			pstm.setString(2, u.getApellidoPaternoUsuario());
			pstm.setString(3, u.getApellidoMaternoUsuario());
			pstm.setString(4, u.getFechaNacimientoUsuario());
			pstm.setString(5, u.getDireccionUsuario());
			pstm.setString(6, u.getCorreoUsuario());
			pstm.setString(7, u.getTelefonoUsuario());
			pstm.setInt(8, u.getDniUsuario());
			pstm.setString(9, u.getSexoUsuario());
			pstm.setString(10, u.getLoginUsuario());
			pstm.setString(11, u.getPasswordUsuario());
			pstm.setInt(12, u.getIdDistrito());
			estado = pstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(pstm != null){pstm.close();}
				if(cn != null){cn.close();}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}		
		return estado;
	}

	@Override
	public UsuarioDTO buscarUsuarioAdministrador(int idUsuario) {
		UsuarioDTO u = null;
		Connection cn = null;
		PreparedStatement pstm = null;
		String sql = "";
		ResultSet rs = null;
		try {
			cn = MySqlDBConexion.getConexion();
			sql = "select u.idUsuario,u.nombresUsuario,u.apellidoPaternoUsuario,u.apellidoMaternoUsuario,"
					+ "u.fechaNacimientoUsuario,u.direccionUsuario,"
					+ "u.correoUsuario, u.telefonoUsuario,u.dniUsuario,u.sexousuario,u.loginUsuario,u.passwordUsuario,"
					+ "u.idTipoUsuario,tu.descripcionTipoUsuario,u.idDistrito,d.nombreDistrito,"
					+ "u.idAreaMunicipal,am.nombreAreaMunicipal,"
					+ "u.idEstadoUsuario,eu.descripcionEstadoUsuario "
					+ "from Usuario as u inner join TipoUsuario as tu "
					+ "on u.idTipoUsuario = tu.idtipoUsuario inner join Distrito as d "
					+ "on u.idDistrito = d.idDistrito inner join AreaMunicipal as am "
					+ "on u.idAreaMunicipal = am.idAreaMunicipal inner join EstadoUsuario as eu "
					+ "on u.idEstadoUsuario = eu.idEstadoUsuario "
					+ "where u.idUsuario = ?";
			pstm = cn.prepareStatement(sql);
			pstm.setInt(1, idUsuario);
			rs = pstm.executeQuery();
			if(rs.next()){
				u = new UsuarioDTO();
				u.setIdUsuario(rs.getInt(1));
				u.setNombresUsuario(rs.getString(2));
				u.setApellidoPaternoUsuario(rs.getString(3));
				u.setApellidoMaternoUsuario(rs.getString(4));
				u.setFechaNacimientoUsuario(rs.getString(5));
				u.setDireccionUsuario(rs.getString(6));
				u.setCorreoUsuario(rs.getString(7));
				u.setTelefonoUsuario(rs.getString(8));
				u.setDniUsuario(rs.getInt(9));
				u.setSexoUsuario(rs.getString(10));
				u.setLoginUsuario(rs.getString(11));
				u.setPasswordUsuario(rs.getString(12));
				u.setIdTipoUsuario(rs.getInt(13));
				u.setDescripcionTipoUsuario(rs.getString(14));
				u.setIdDistrito(rs.getInt(15));
				u.setNombreDistrito(rs.getString(16));
				u.setIdAreaMunicipal(rs.getInt(17));
				u.setNombreAreaMunicipal(rs.getString(18));
				u.setIdEstadoUsuario(rs.getInt(19));
				u.setDescripcionEstadoUsuario(rs.getString(20));				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(rs != null){rs.close();}
				if(pstm != null){pstm.close();}
				if(cn != null){cn.close();}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return u;
	}

	@Override
	public int modificarUsuarioAdministrador(UsuarioDTO u) {
		int estado = -1;
		Connection cn = null;
		PreparedStatement pstm = null;
		String sql = "";
		
		try {
			cn = MySqlDBConexion.getConexion();
			sql = "update usuario "
					+ "set nombresUsuario = ?, apellidoPaternoUsuario=?, apellidoMaternoUsuario=?, "
					+ "fechaNacimientoUsuario=?,direccionUsuario=?,correoUsuario=?,telefonoUsuario=?, "
					+ "dniUsuario=?,sexoUsuario=?,loginUsuario=?,passwordUsuario=?,idTipoUsuario=1,idDistrito=?, "
					+ "idAreaMunicipal=1,idEstadoUsuario=1 "
					+ "where idUsuario = ?";
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, u.getNombresUsuario());
			pstm.setString(2, u.getApellidoPaternoUsuario());
			pstm.setString(3, u.getApellidoMaternoUsuario());
			pstm.setString(4, u.getFechaNacimientoUsuario());
			pstm.setString(5, u.getDireccionUsuario());
			pstm.setString(6, u.getCorreoUsuario());
			pstm.setString(7, u.getTelefonoUsuario());
			pstm.setInt(8, u.getDniUsuario());
			pstm.setString(9, u.getSexoUsuario());
			pstm.setString(10, u.getLoginUsuario());
			pstm.setString(11, u.getPasswordUsuario());
			pstm.setInt(12, u.getIdDistrito());
			pstm.setInt(13, u.getIdUsuario());
			estado = pstm.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(pstm != null){pstm.close();}
				if(cn != null){cn.close();}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return estado;
	}

	@Override
	public int eliminarUsuarioAdministrador(int idUsuario) {
		int estado = -1;
		Connection cn = null;
		PreparedStatement pstm = null;
		String sql = "";
		
		try {
			cn = MySqlDBConexion.getConexion();
			sql = "delete from usuario "
					+ "where idUsuario = ?";
			pstm = cn.prepareStatement(sql);
			pstm.setInt(1, idUsuario);
			estado = pstm.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(pstm != null){pstm.close();}
				if(cn != null){cn.close();}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return estado;
	}

	@Override
	public UsuarioDTO iniciarSesion(String login) {
		Connection cn=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		UsuarioDTO obj=null;
		try {
			cn=MySqlDBConexion.getConexion();
			String sql="select u.idUsuario,u.nombresUsuario,u.apellidoPaternoUsuario, "
					+ "u.apellidoMaternoUsuario,u.loginUsuario,u.passwordUsuario, "
					+ "u.idTipoUsuario,tu.descripcionTipoUsuario from usuario as u inner join tipousuario as tu "
					+ "on u.idTipoUsuario = tu.idTipoUsuario "
					+ "where loginUsuario = ?";
			pstm=cn.prepareStatement(sql);
			pstm.setString(1, login);
			rs=pstm.executeQuery();
			if(rs.next()){
				obj = new UsuarioDTO();
				obj.setIdUsuario(rs.getInt(1));
				obj.setNombresUsuario(rs.getString(2));
				obj.setApellidoPaternoUsuario(rs.getString(3));
				obj.setApellidoMaternoUsuario(rs.getString(4));
				obj.setLoginUsuario(rs.getString(5));
				obj.setPasswordUsuario(rs.getString(6));
				obj.setIdTipoUsuario(rs.getInt(7));
				obj.setDescripcionTipoUsuario(rs.getString(8));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			try {
				if(rs!=null){rs.close();}
				if(pstm!=null){pstm.close();}
				if(cn!=null){cn.close();}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return obj;

	}

	@Override
	public List<UsuarioDTO> listarUsuariosEmpleados() {
		List<UsuarioDTO> data = new ArrayList<UsuarioDTO>();
		UsuarioDTO u = null;
		Connection cn = null;
		PreparedStatement pstm = null;
		String sql = "";
		ResultSet rs = null;
		try {
			cn = MySqlDBConexion.getConexion();
			sql = "select u.idUsuario,u.nombresUsuario,u.apellidoPaternoUsuario,u.apellidoMaternoUsuario,"
					+ "u.fechaNacimientoUsuario,u.direccionUsuario,"
					+ "u.correoUsuario, u.telefonoUsuario,u.dniUsuario,u.sexousuario,u.loginUsuario,u.passwordUsuario,"
					+ "u.idTipoUsuario,tu.descripcionTipoUsuario,u.idDistrito,d.nombreDistrito,"
					+ "u.idAreaMunicipal,am.nombreAreaMunicipal,"
					+ "u.idEstadoUsuario,eu.descripcionEstadoUsuario "
					+ "from Usuario as u inner join TipoUsuario as tu "
					+ "on u.idTipoUsuario = tu.idtipoUsuario inner join Distrito as d "
					+ "on u.idDistrito = d.idDistrito inner join AreaMunicipal as am "
					+ "on u.idAreaMunicipal = am.idAreaMunicipal inner join EstadoUsuario as eu "
					+ "on u.idEstadoUsuario = eu.idEstadoUsuario "
					+ "where u.idTipoUsuario != 1";
			pstm = cn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while(rs.next()){
				u = new UsuarioDTO();
				u.setIdUsuario(rs.getInt(1));
				u.setNombresUsuario(rs.getString(2));
				u.setApellidoPaternoUsuario(rs.getString(3));
				u.setApellidoMaternoUsuario(rs.getString(4));
				u.setFechaNacimientoUsuario(rs.getString(5));
				u.setDireccionUsuario(rs.getString(6));
				u.setCorreoUsuario(rs.getString(7));
				u.setTelefonoUsuario(rs.getString(8));
				u.setDniUsuario(rs.getInt(9));
				u.setSexoUsuario(rs.getString(10));
				u.setLoginUsuario(rs.getString(11));
				u.setPasswordUsuario(rs.getString(12));
				u.setIdTipoUsuario(rs.getInt(13));
				u.setDescripcionTipoUsuario(rs.getString(14));
				u.setIdDistrito(rs.getInt(15));
				u.setNombreDistrito(rs.getString(16));
				u.setIdAreaMunicipal(rs.getInt(17));
				u.setNombreAreaMunicipal(rs.getString(18));
				u.setIdEstadoUsuario(rs.getInt(19));
				u.setDescripcionEstadoUsuario(rs.getString(20));
				data.add(u);				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(rs != null){rs.close();}
				if(pstm != null){pstm.close();}
				if(cn != null){cn.close();}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return data;
	}

	@Override
	public int registrarUsuarioEmpleado(UsuarioDTO u) {
		int estado = -1;
		Connection cn = null;
		PreparedStatement pstm = null;
		String sql ="";
		try {
			cn = MySqlDBConexion.getConexion();
			sql = "insert into usuario values(null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, u.getNombresUsuario());
			pstm.setString(2, u.getApellidoPaternoUsuario());
			pstm.setString(3, u.getApellidoMaternoUsuario());
			pstm.setString(4, u.getFechaNacimientoUsuario());
			pstm.setString(5, u.getDireccionUsuario());
			pstm.setString(6, u.getCorreoUsuario());
			pstm.setString(7, u.getTelefonoUsuario());
			pstm.setInt(8, u.getDniUsuario());
			pstm.setString(9, u.getSexoUsuario());
			pstm.setString(10, u.getLoginUsuario());
			pstm.setString(11, u.getPasswordUsuario());
			pstm.setInt(12, u.getIdTipoUsuario());
			pstm.setInt(13, u.getIdDistrito());
			pstm.setInt(14, u.getIdAreaMunicipal());
			pstm.setInt(15, u.getIdEstadoUsuario());
			estado = pstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(pstm != null){pstm.close();}
				if(cn != null){cn.close();}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}		
		return estado;
	}

	@Override
	public UsuarioDTO buscarUsuarioempleado(int idUsuario) {
		UsuarioDTO u = null;
		Connection cn = null;
		PreparedStatement pstm = null;
		String sql = "";
		ResultSet rs = null;
		try {
			cn = MySqlDBConexion.getConexion();
			sql = "select u.idUsuario,u.nombresUsuario,u.apellidoPaternoUsuario,u.apellidoMaternoUsuario,"
					+ "u.fechaNacimientoUsuario,u.direccionUsuario,"
					+ "u.correoUsuario, u.telefonoUsuario,u.dniUsuario,u.sexousuario,u.loginUsuario,u.passwordUsuario,"
					+ "u.idTipoUsuario,tu.descripcionTipoUsuario,u.idDistrito,d.nombreDistrito,"
					+ "u.idAreaMunicipal,am.nombreAreaMunicipal,"
					+ "u.idEstadoUsuario,eu.descripcionEstadoUsuario "
					+ "from Usuario as u inner join TipoUsuario as tu "
					+ "on u.idTipoUsuario = tu.idtipoUsuario inner join Distrito as d "
					+ "on u.idDistrito = d.idDistrito inner join AreaMunicipal as am "
					+ "on u.idAreaMunicipal = am.idAreaMunicipal inner join EstadoUsuario as eu "
					+ "on u.idEstadoUsuario = eu.idEstadoUsuario "
					+ "where u.idUsuario = ?";
			pstm = cn.prepareStatement(sql);
			pstm.setInt(1, idUsuario);
			rs = pstm.executeQuery();
			if(rs.next()){
				u = new UsuarioDTO();
				u.setIdUsuario(rs.getInt(1));
				u.setNombresUsuario(rs.getString(2));
				u.setApellidoPaternoUsuario(rs.getString(3));
				u.setApellidoMaternoUsuario(rs.getString(4));
				u.setFechaNacimientoUsuario(rs.getString(5));
				u.setDireccionUsuario(rs.getString(6));
				u.setCorreoUsuario(rs.getString(7));
				u.setTelefonoUsuario(rs.getString(8));
				u.setDniUsuario(rs.getInt(9));
				u.setSexoUsuario(rs.getString(10));
				u.setLoginUsuario(rs.getString(11));
				u.setPasswordUsuario(rs.getString(12));
				u.setIdTipoUsuario(rs.getInt(13));
				u.setDescripcionTipoUsuario(rs.getString(14));
				u.setIdDistrito(rs.getInt(15));
				u.setNombreDistrito(rs.getString(16));
				u.setIdAreaMunicipal(rs.getInt(17));
				u.setNombreAreaMunicipal(rs.getString(18));
				u.setIdEstadoUsuario(rs.getInt(19));
				u.setDescripcionEstadoUsuario(rs.getString(20));				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(rs != null){rs.close();}
				if(pstm != null){pstm.close();}
				if(cn != null){cn.close();}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return u;
	}

	@Override
	public int modificarUsuarioEmpleado(UsuarioDTO u) {
		int estado = -1;
		Connection cn = null;
		PreparedStatement pstm = null;
		String sql = "";
		
		try {
			cn = MySqlDBConexion.getConexion();
			sql = "update usuario "
					+ "set nombresUsuario = ?, apellidoPaternoUsuario=?, apellidoMaternoUsuario=?, "
					+ "fechaNacimientoUsuario=?,direccionUsuario=?,correoUsuario=?,telefonoUsuario=?, "
					+ "dniUsuario=?,sexoUsuario=?,loginUsuario=?,passwordUsuario=?,idTipoUsuario=?,idDistrito=?, "
					+ "idAreaMunicipal=?,idEstadoUsuario=? "
					+ "where idUsuario = ?";
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, u.getNombresUsuario());
			pstm.setString(2, u.getApellidoPaternoUsuario());
			pstm.setString(3, u.getApellidoMaternoUsuario());
			pstm.setString(4, u.getFechaNacimientoUsuario());
			pstm.setString(5, u.getDireccionUsuario());
			pstm.setString(6, u.getCorreoUsuario());
			pstm.setString(7, u.getTelefonoUsuario());
			pstm.setInt(8, u.getDniUsuario());
			pstm.setString(9, u.getSexoUsuario());
			pstm.setString(10, u.getLoginUsuario());
			pstm.setString(11, u.getPasswordUsuario());
			pstm.setInt(12, u.getIdTipoUsuario());
			pstm.setInt(13, u.getIdDistrito());
			pstm.setInt(14, u.getIdAreaMunicipal());
			pstm.setInt(15, u.getIdEstadoUsuario());
			pstm.setInt(16, u.getIdUsuario());
			estado = pstm.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(pstm != null){pstm.close();}
				if(cn != null){cn.close();}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return estado;
	}

	@Override
	public int eliminarUsuarioEmpleado(int idUsuario) {
		int estado = -1;
		Connection cn = null;
		PreparedStatement pstm = null;
		String sql = "";
		
		try {
			cn = MySqlDBConexion.getConexion();
			sql = "delete from usuario "
					+ "where idUsuario = ?";
			pstm = cn.prepareStatement(sql);
			pstm.setInt(1, idUsuario);
			estado = pstm.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(pstm != null){pstm.close();}
				if(cn != null){cn.close();}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return estado;
	}

}
