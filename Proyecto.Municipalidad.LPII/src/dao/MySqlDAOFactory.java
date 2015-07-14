package dao;

import interfaces.ComboDAO;
import interfaces.MemorandoDAO;
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
		return new MySqlTallerMecanicoDAO();
	}

	@Override
	public ComboDAO getComboDAO() {
		return new MySqlComboDAO();
	}

	@Override
	public UsuarioDAO getUsuarioDAO() {
		return new MySqlUsuarioDAO();
	}

	@Override
	public MemorandoDAO getMemorandoDAO() {
		return new MySqlMemorandoDAO();
	}

}
