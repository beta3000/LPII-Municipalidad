package beans;

public class MemorandoDTO {
	private int idMemorando;
	private String fechaMemorando;
	private String contenidoMemorando;
	private int idAsuntoMemorando;
	private String descripcionAsuntoMemorando;
	private int idEstadoMemorando;
	private String descripcionEstadoMemorando;
	private int idUsuarioRemitente;
	public int getIdMemorando() {
		return idMemorando;
	}
	public void setIdMemorando(int idMemorando) {
		this.idMemorando = idMemorando;
	}
	public String getFechaMemorando() {
		return fechaMemorando;
	}
	public void setFechaMemorando(String fechaMemorando) {
		this.fechaMemorando = fechaMemorando;
	}
	public String getContenidoMemorando() {
		return contenidoMemorando;
	}
	public void setContenidoMemorando(String contenidoMemorando) {
		this.contenidoMemorando = contenidoMemorando;
	}
	public int getIdAsuntoMemorando() {
		return idAsuntoMemorando;
	}
	public void setIdAsuntoMemorando(int idAsuntoMemorando) {
		this.idAsuntoMemorando = idAsuntoMemorando;
	}
	public String getDescripcionAsuntoMemorando() {
		return descripcionAsuntoMemorando;
	}
	public void setDescripcionAsuntoMemorando(String descripcionAsuntoMemorando) {
		this.descripcionAsuntoMemorando = descripcionAsuntoMemorando;
	}
	public int getIdEstadoMemorando() {
		return idEstadoMemorando;
	}
	public void setIdEstadoMemorando(int idEstadoMemorando) {
		this.idEstadoMemorando = idEstadoMemorando;
	}
	public String getDescripcionEstadoMemorando() {
		return descripcionEstadoMemorando;
	}
	public void setDescripcionEstadoMemorando(String descripcionEstadoMemorando) {
		this.descripcionEstadoMemorando = descripcionEstadoMemorando;
	}
	public int getIdUsuarioRemitente() {
		return idUsuarioRemitente;
	}
	public void setIdUsuarioRemitente(int idUsuarioRemitente) {
		this.idUsuarioRemitente = idUsuarioRemitente;
	}
	public MemorandoDTO() {
		super();
	}
	
	
}
