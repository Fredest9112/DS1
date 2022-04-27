package resCalc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ColoresPPMs {
	private Map<String, Double> valoresDePPM;
	
	public ColoresPPMs() {
		this.valoresDePPM = getValoresDePPM();
	}
	
	public Map<String, Double> getValoresDePPM() {
		valoresDePPM = new HashMap<String, Double>();
		valoresDePPM.put("Cafe", 100.0);
		valoresDePPM.put("Rojo", 50.0);
		valoresDePPM.put("Naranja", 15.0);
		valoresDePPM.put("Amarillo", 25.0);
		valoresDePPM.put("Azul", 10.0);
		valoresDePPM.put("Violeta", 5.0);
		return valoresDePPM;
	}
	
	public List<String> getListaPPMs(){
		List<String> bandasPPMs = List.of("", "Cafe", "Rojo", "Naranja", "Amarillo", "Azul", "Violeta");
		return bandasPPMs;
	}
}
