package service;

import java.util.List;

import beans.VehiculoDTO;
import interfaces.VehiculoDAO;
import utils.Constantes;
import dao.DAOFactory;

public class ManteVehiculoService {

	DAOFactory fabrica = DAOFactory.getDAOFactory(Constantes.ORIGEN_DATOS);
	VehiculoDAO objVehiculo = fabrica.getVehiculoDAO();
	
	public int registraVehiculo(VehiculoDTO t){
		return objVehiculo.registrarVehiculo(t);
	}
	public List<VehiculoDTO> listaVehiculos(){
		return objVehiculo.listarVehiculos();
	}
	public VehiculoDTO buscaVehiculo(int idVehiculo){
		return objVehiculo.buscarVehiculo(idVehiculo);
	}
	public int modificaVehiculo(VehiculoDTO t){
		return objVehiculo.modificarVehiculo(t);
	}
	public int eliminaVehiculo(int idVehiculo){
		return objVehiculo.eliminarVehiculo(idVehiculo);
	}
}
