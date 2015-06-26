package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import utils.MySqlDBConexion;
import beans.TallerMecanicoDTO;
import interfaces.TallerMecanicoDAO;

public class MySqlTallerMecanicoDAO implements TallerMecanicoDAO {

	@Override
	public List<TallerMecanicoDTO> listarTalleresMecanicos() {
		List<TallerMecanicoDTO> data = new ArrayList<TallerMecanicoDTO>();
		TallerMecanicoDTO t = null;
		Connection cn = null;
		PreparedStatement pstm = null;
		String sql = "";
		ResultSet rs = null;
		
		try {
			cn = MySqlDBConexion.getConexion();
			sql = "select t.idTallerMecanico, t.nombreTallerMecanico, t.direccionTallerMecanico,t.telefonoTallerMecanico,t.idDistrito, d.nombreDistrito "
					+ "from tallermecanico as t inner join distrito as d "
					+ "on t.idDistrito = d.idDistrito";
			pstm = cn.prepareStatement(sql);
			rs = pstm.executeQuery();
			
			while(rs.next()){
				t = new TallerMecanicoDTO();
				t.setIdTallerMecanico(rs.getInt(1));
				t.setNombreTallerMecanico(rs.getString(2));
				t.setDireccionTallerMecanico(rs.getString(3));
				t.setTelefonoTallerMecanico(rs.getString(4));
				t.setIdDistrito(rs.getInt(5));
				t.setNombreDistrito(rs.getString(6));
				data.add(t);
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
	public int registrarTallerMecanico(TallerMecanicoDTO t) {
		int estado = -1;
		Connection cn = null;
		PreparedStatement pstm = null;
		String sql = "";
		
		try {
			cn = MySqlDBConexion.getConexion();
			sql = "insert into tallermecanico values(null,?,?,?,?)";
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, t.getNombreTallerMecanico());
			pstm.setString(2, t.getDireccionTallerMecanico());
			pstm.setString(3, t.getTelefonoTallerMecanico());
			pstm.setInt(4, t.getIdDistrito());
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
	public TallerMecanicoDTO buscarTallerMecanico(int idTallerMecanico) {
		TallerMecanicoDTO t = null;
		Connection cn = null;
		PreparedStatement pstm = null;
		String sql = "";
		ResultSet rs = null;
		
		try {
			cn = MySqlDBConexion.getConexion();
			sql = "select t.idTallerMecanico, t.nombreTallerMecanico, t.direccionTallerMecanico,t.telefonoTallerMecanico,t.idDistrito, d.nombreDistrito "
					+ "from tallermecanico as t inner join distrito as d "
					+ "on t.idDistrito = d.idDistrito "
					+ "where t.idTallerMecanico = ?";
			pstm = cn.prepareStatement(sql);
			pstm.setInt(1, idTallerMecanico);
			rs = pstm.executeQuery();
			
			if(rs.next()){
				t = new TallerMecanicoDTO();
				t.setIdTallerMecanico(rs.getInt(1));
				t.setNombreTallerMecanico(rs.getString(2));
				t.setDireccionTallerMecanico(rs.getString(3));
				t.setTelefonoTallerMecanico(rs.getString(4));
				t.setIdDistrito(rs.getInt(5));
				t.setNombreDistrito(rs.getString(6));

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
		return t;
	}

	@Override
	public int modificarTallerMecanico(TallerMecanicoDTO t) {
		int estado = -1;
		Connection cn = null;
		PreparedStatement pstm = null;
		String sql = "";
		
		try {
			cn = MySqlDBConexion.getConexion();
			sql = "update tallermecanico "
					+ "set nombreTallerMecanico = ?, direccionTallerMecanico=?, telefonoTallerMecanico=?, idDistrito=? "
					+ "where idTallerMecanico = ?";
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, t.getNombreTallerMecanico());
			pstm.setString(2, t.getDireccionTallerMecanico());
			pstm.setString(3, t.getTelefonoTallerMecanico());
			pstm.setInt(4, t.getIdDistrito());
			pstm.setInt(5, t.getIdTallerMecanico());
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
	public int eliminarTallerMecanico(int idTallerMecanico) {
		int estado = -1;
		Connection cn = null;
		PreparedStatement pstm = null;
		String sql = "";
		
		try {
			cn = MySqlDBConexion.getConexion();
			sql = "delete from tallermecanico "
					+ "where idTallerMecanico = ?";
			pstm = cn.prepareStatement(sql);
			pstm.setInt(1, idTallerMecanico);
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
