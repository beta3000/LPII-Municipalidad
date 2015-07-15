package service;

import java.util.List;

import beans.MemorandoDTO;
import interfaces.MemorandoDAO;
import utils.Constantes;
import dao.DAOFactory;

public class ManteMemorandoService {

	DAOFactory fabrica = DAOFactory.getDAOFactory(Constantes.ORIGEN_DATOS);
	MemorandoDAO objMemorando = fabrica.getMemorandoDAO();
	
	public List<MemorandoDTO> listaMemorandosRequerimientoVehicular() {
		return objMemorando.listarMemorandosRequerimientoVehicular();
	}
	
	public List<MemorandoDTO> listaMemorandosReparacionVehicular() {
		return objMemorando.listarMemorandosReparacionVehicular();
	}
	
	public int registraMemorando(MemorandoDTO m) {
		return objMemorando.registrarMemorando(m);
	}
	
	public int aprobarMemorando(int idMemorando) {
		return objMemorando.aprobarMemorando(idMemorando);
	}
	public int desaprobarMemorando(int idMemorando) {
		return objMemorando.desaprobarMemorando(idMemorando);
	}
	
	public MemorandoDTO buscaMemorando(int idMemorando){
		return objMemorando.buscarMemorando(idMemorando);
	}
}
