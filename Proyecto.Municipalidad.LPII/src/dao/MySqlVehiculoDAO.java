package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import utils.MySqlDBConexion;
import beans.VehiculoDTO;
import interfaces.VehiculoDAO;

public class MySqlVehiculoDAO implements VehiculoDAO {

	@Override
	public List<VehiculoDTO> listarVehiculos() {
		List<VehiculoDTO> data = new ArrayList<VehiculoDTO>();
		VehiculoDTO v = null;
		Connection cn = null;
		PreparedStatement pstm = null;
		String sql = "";
		ResultSet rs = null;
		
		try {
			cn = MySqlDBConexion.getConexion();
			sql = "select * from vehiculo";
			pstm = cn.prepareStatement(sql);
			rs = pstm.executeQuery();
			
			while(rs.next()){
				v = new VehiculoDTO();
				v.setIdVehiculo(rs.getInt(1));
				v.setPlacaVehiculo(rs.getString(2));
				v.setMarcaVehiculo(rs.getString(3));
				v.setModeloVehiculo(rs.getString(4));
				v.setAnioFabricacionVehiculo(rs.getInt(5));
				v.setColorVehiculo(rs.getString(6));
				
				data.add(v);
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
	public int registrarVehiculo(VehiculoDTO v) {
		int estado = -1;
		Connection cn = null;
		PreparedStatement pstm = null;
		String sql = "";
		
		try {
			cn = MySqlDBConexion.getConexion();
			sql = "insert into vehiculo values(null,?,?,?,?,?)";
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, v.getPlacaVehiculo());
			pstm.setString(2, v.getMarcaVehiculo());
			pstm.setString(3, v.getModeloVehiculo());
			pstm.setInt(4, v.getAnioFabricacionVehiculo());
			pstm.setString(5, v.getColorVehiculo());
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
	public int modificarVehiculo(VehiculoDTO v) {
		int estado = -1;
		Connection cn = null;
		PreparedStatement pstm = null;
		String sql = "";
		
		try {
			cn = MySqlDBConexion.getConexion();
			sql = "update vehiculo "
					+ "set placaVehiculo = ?, marcaVehiculo=?, modeloVehiculo=?, anioFabricacionVehiculo=?, colorVehiculo=? "
					+ "where idVehiculo = ?";
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, v.getPlacaVehiculo());
			pstm.setString(2, v.getMarcaVehiculo());
			pstm.setString(3, v.getModeloVehiculo());
			pstm.setInt(4, v.getAnioFabricacionVehiculo());
			pstm.setString(5, v.getColorVehiculo());
			pstm.setInt(6, v.getIdVehiculo());
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
	public VehiculoDTO buscarVehiculo(int idVehiculo) {
		VehiculoDTO v = null;
		Connection cn = null;
		PreparedStatement pstm = null;
		String sql = "";
		ResultSet rs = null;
		
		try {
			cn = MySqlDBConexion.getConexion();
			sql = "select * from vehiculo where idVehiculo = ?";
			pstm = cn.prepareStatement(sql);
			pstm.setInt(1, idVehiculo);
			rs = pstm.executeQuery();
			
			if(rs.next()){
				v = new VehiculoDTO();
				v.setIdVehiculo(rs.getInt(1));
				v.setPlacaVehiculo(rs.getString(2));
				v.setMarcaVehiculo(rs.getString(3));
				v.setModeloVehiculo(rs.getString(4));
				v.setAnioFabricacionVehiculo(rs.getInt(5));
				v.setColorVehiculo(rs.getString(6));

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
		return v;
	}

	@Override
	public int eliminarVehiculo(int idVehiculo) {
		int estado = -1;
		Connection cn = null;
		PreparedStatement pstm = null;
		String sql = "";
		
		try {
			cn = MySqlDBConexion.getConexion();
			sql = "delete from vehiculo "
					+ "where idVehiculo = ?";
			pstm = cn.prepareStatement(sql);
			pstm.setInt(1, idVehiculo);
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
