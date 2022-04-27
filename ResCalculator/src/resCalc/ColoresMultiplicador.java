package resCalc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ColoresMultiplicador {
	private Map<String, Double> valoresMultiplicador;
	
	public ColoresMultiplicador() {
		this.valoresMultiplicador = getValoresMultiplicador();
	}
	
	public Map<String, Double> getValoresMultiplicador() {
		valoresMultiplicador = new HashMap<String, Double>();
		valoresMultiplicador.put("Negro", 1.0);
		valoresMultiplicador.put("Cafe", 10.0);
		valoresMultiplicador.put("Rojo", 100.0);
		valoresMultiplicador.put("Naranja", 1000.0);
		valoresMultiplicador.put("Amarillo", 10000.0);
		valoresMultiplicador.put("Verde", 100000.0);
		valoresMultiplicador.put("Azul", 1000000.0);
		valoresMultiplicador.put("Violeta", 10000000.0);
		valoresMultiplicador.put("Gris", 100000000.0);
		valoresMultiplicador.put("Blanco", 1000000000.0);
		valoresMultiplicador.put("Dorado", 10000000000.0);
		valoresMultiplicador.put("Plateado", 100000000000.0);
		return valoresMultiplicador;
	}
	
	public List<String> getListaMults(){
		List<String> bandasMult = List.of("", "Negro", "Cafe", "Rojo", "Naranja", "Amarillo", "Verde", 
				"Azul", "Violeta", "Gris", "Blanco", "Dorado", "Plateado");
		return bandasMult;
	}
}
