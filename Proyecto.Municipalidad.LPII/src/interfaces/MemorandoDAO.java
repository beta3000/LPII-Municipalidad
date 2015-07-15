package interfaces;

import java.util.List;

import beans.MemorandoDTO;

public interface MemorandoDAO {

	public List<MemorandoDTO> listarMemorandosRequerimientoVehicular();
	public List<MemorandoDTO> listarMemorandosReparacionVehicular();
	public int registrarMemorando(MemorandoDTO m);
	public int aprobarMemorando(int idMemorando);
	public int desaprobarMemorando(int idMemorando);
	public MemorandoDTO buscarMemorando(int idMemorando);
}
