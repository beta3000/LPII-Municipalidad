package service;

import java.util.List;

import beans.ComboDTO;
import interfaces.ComboDAO;
import utils.Constantes;
import dao.DAOFactory;

public class ManteComboService {

	DAOFactory fabrica = DAOFactory.getDAOFactory(Constantes.ORIGEN_DATOS);
	
	ComboDAO obj = fabrica.getComboDAO();
	
	public List<ComboDTO> listarCombo(String sql){
		return obj.listaCombo(sql);
	}
}
