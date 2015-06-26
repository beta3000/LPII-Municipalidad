package interfaces;

import java.util.List;

import beans.VehiculoDTO;

public interface VehiculoDAO {

	public List<VehiculoDTO> listarVehiculos();
	public int registrarVehiculo(VehiculoDTO v);
	public VehiculoDTO buscarVehiculo(int idVehiculo);
	public int modificarVehiculo(VehiculoDTO v);
	public int eliminarVehiculo(int idVehiculo);
}
