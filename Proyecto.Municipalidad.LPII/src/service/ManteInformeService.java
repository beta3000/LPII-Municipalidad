package service;

import java.util.List;

import beans.InformeDTO;
import interfaces.InformeDAO;
import utils.Constantes;
import dao.DAOFactory;

public class ManteInformeService {

	DAOFactory fabrica = DAOFactory.getDAOFactory(Constantes.ORIGEN_DATOS);
	InformeDAO objInforme = fabrica.getInformeDAO();
	
	public List<InformeDTO> listaInformesServicioVehicular(){
		return objInforme.listarInformesServicioVehicular();
	}
	public List<InformeDTO> listaInformesReparacionVehicular(){
		return objInforme.listarInformesReparacionVehicular();
	}
	public int registraInformeServicioVehicular(InformeDTO i){
		return objInforme.registrarInformeServicioVehicular(i);
	}
	public int registraInformeReparacionVehicular(InformeDTO i){
		return objInforme.registrarInformeReparacionVehicular(i);
	}
	public int aprobarInforme(int idInforme){
		return objInforme.aprobarInforme(idInforme);
	}
	public int desaprobarInforme(int idInforme){
		return objInforme.desaprobarInforme(idInforme);
	}
	public InformeDTO buscaInforme(int idInforme){
		return objInforme.buscarInforme(idInforme);
	}
}
