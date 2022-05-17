package OrdenTrabajo;

public class Orden {
	private int id;
	private Estado estado;
	
	public Orden(Estado estado) {
		this.estado = estado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Estado getEstado() {
		return estado;
	}
	
	
}
