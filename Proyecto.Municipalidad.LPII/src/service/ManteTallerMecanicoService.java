package service;

import interfaces.TallerMecanicoDAO;

import java.util.List;

import utils.Constantes;
import beans.TallerMecanicoDTO;
import dao.DAOFactory;

public class ManteTallerMecanicoService {

	DAOFactory fabrica = DAOFactory.getDAOFactory(Constantes.ORIGEN_DATOS);
	TallerMecanicoDAO objTallerMecanico = fabrica.getTallerMecanicoDAO();
	
	public int registraTallerMecanico(TallerMecanicoDTO t){
		return objTallerMecanico.registrarTallerMecanico(t);
	}
	public List<TallerMecanicoDTO> listaTalleresMecanicos(){
		return objTallerMecanico.listarTalleresMecanicos();
	}
	public TallerMecanicoDTO buscaTallerMecanico(int idTallerMecanico){
		return objTallerMecanico.buscarTallerMecanico(idTallerMecanico);
	}
	public int modificaTallerMecanico(TallerMecanicoDTO t){
		return objTallerMecanico.modificarTallerMecanico(t);
	}
	public int eliminaTallerMecanico(int idTallerMecanico){
		return objTallerMecanico.eliminarTallerMecanico(idTallerMecanico);
	}
}
