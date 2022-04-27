package resCalc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ColoresTolerancia {
	private Map<String, Double> valoresDeTolerancias;
	
	public ColoresTolerancia() {
		this.valoresDeTolerancias = getValoresDeTolerancias();
	}
	
	public Map<String, Double> getValoresDeTolerancias() {
		valoresDeTolerancias = new HashMap<String, Double>();
		valoresDeTolerancias.put("Cafe", 1.0);
		valoresDeTolerancias.put("Rojo", 2.0);
		valoresDeTolerancias.put("Verde", 0.5);
		valoresDeTolerancias.put("Azul", 0.25);
		valoresDeTolerancias.put("Violeta", 0.1);
		valoresDeTolerancias.put("Gris", 0.05);
		valoresDeTolerancias.put("Dorado", 5.0);
		valoresDeTolerancias.put("Plateado", 10.0);
		return valoresDeTolerancias;
	}
	
	public List<String> getListaTolerancias(){
		List<String> bandasTolerancias = List.of("","Cafe", "Rojo","Verde", "Azul", 
				"Violeta", "Gris", "Dorado", "Plateado");
		return bandasTolerancias;
	}
}
