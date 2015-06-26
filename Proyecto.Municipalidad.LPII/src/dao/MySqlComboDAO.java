package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import utils.MySqlDBConexion;
import beans.ComboDTO;
import interfaces.ComboDAO;

public class MySqlComboDAO implements ComboDAO {

	@Override
	public List<ComboDTO> listaCombo(String sql) {
		List<ComboDTO> data = new ArrayList<ComboDTO>();
		Connection cn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		ComboDTO obj = null;
		
		try {
			cn = MySqlDBConexion.getConexion();
			pstm = cn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while(rs.next()){
				obj = new ComboDTO(rs.getInt(1),rs.getString(2));
				data.add(obj);
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

}
