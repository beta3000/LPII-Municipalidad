package interfaces;

import java.util.List;

import beans.TallerMecanicoDTO;

public interface TallerMecanicoDAO {

	public List<TallerMecanicoDTO> listarTalleresMecanicos();
	public int registrarTallerMecanico(TallerMecanicoDTO t);
	public TallerMecanicoDTO buscarTallerMecanico(int idTallerMecanico);
	public int modificarTallerMecanico(TallerMecanicoDTO t);
	public int eliminarTallerMecanico(int idTallerMecanico);
}
