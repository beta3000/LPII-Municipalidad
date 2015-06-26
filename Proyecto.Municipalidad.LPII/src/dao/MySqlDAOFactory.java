package dao;

import interfaces.ComboDAO;
import interfaces.TallerMecanicoDAO;
import interfaces.UsuarioDAO;
import interfaces.VehiculoDAO;

public class MySqlDAOFactory extends DAOFactory {

	@Override
	public VehiculoDAO getVehiculoDAO() {
		return new MySqlVehiculoDAO();
	}

	@Override
	public TallerMecanicoDAO getTallerMecanicoDAO() {
		// TODO Auto-generated method stub
		return new MySqlTallerMecanicoDAO();
	}

	@Override
	public ComboDAO getComboDAO() {
		// TODO Auto-generated method stub
		return new MySqlComboDAO();
	}

	@Override
	public UsuarioDAO getUsuarioDAO() {
		// TODO Auto-generated method stub
		return new MySqlUsuarioDAO();
	}

}
