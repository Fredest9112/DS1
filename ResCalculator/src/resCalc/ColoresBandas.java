package resCalc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ColoresBandas {
	private Map<String, Double> valoresDeBandas;
	
	public ColoresBandas() {
		this.valoresDeBandas = getValoresDeBandas();
	}
	
	public Map<String, Double> getValoresDeBandas() {
		valoresDeBandas = new HashMap<String, Double>();
		valoresDeBandas.put("Negro", 0.0);
		valoresDeBandas.put("Cafe", 1.0);
		valoresDeBandas.put("Rojo", 2.0);
		valoresDeBandas.put("Naranja", 3.0);
		valoresDeBandas.put("Amarillo", 4.0);
		valoresDeBandas.put("Verde", 5.0);
		valoresDeBandas.put("Azul", 6.0);
		valoresDeBandas.put("Violeta", 7.0);
		valoresDeBandas.put("Gris", 8.0);
		valoresDeBandas.put("Blanco", 9.0);
		return valoresDeBandas;
	}
	
	public List<String> getListaBandas(){
		List<String> bandas = List.of("", "Negro", "Cafe", "Rojo", "Naranja", "Amarillo", "Verde", 
				"Azul", "Violeta", "Gris", "Blanco");
		return bandas;
	}
}
