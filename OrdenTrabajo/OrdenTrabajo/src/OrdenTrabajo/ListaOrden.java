package OrdenTrabajo;

import java.util.ArrayList;
import java.util.List;

public class ListaOrden {
	private List<Orden> listaOrdenes;
	
	public ListaOrden() {}
	
	public List<Orden> pendienteEntrega(){
		ArrayList<Orden> pendientes = new ArrayList<Orden>();
		
		for(Orden orden : listaOrdenes) {
			if(orden.getEstado().equals(Estado.T_NO_ENTREGADO) ||
					orden.getEstado().equals(Estado.T_PARCIAL)) {
				pendientes.add(orden);
			}
		}
		return pendientes;
	}
}
