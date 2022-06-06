package resCalc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bandas {
	private Map<String, Double> valoresDeBandas;
	private Map<String, Double> valoresMultiplicador;
	private Map<String, Double> valoresDePPM;
	private Map<String, Double> valoresDeTolerancias;
	private Map<String, String> valoresScreenValue;
	private Map<String, String> valoresMultiplicadorByValue;
	
	public Bandas() {
		this.valoresDeBandas = getValoresDeBandas();
		this.valoresMultiplicador = getValoresMultiplicador();
		this.valoresDePPM = getValoresDePPM();
		this.valoresDeTolerancias = getValoresDeTolerancias();
	}
	
	public Map<String, String> getValoresScreenValue() {
        valoresScreenValue = new HashMap<String, String>();
        valoresScreenValue.put("0", "Negro");
        valoresScreenValue.put("1", "Cafe");
        valoresScreenValue.put("2", "Rojo");
        valoresScreenValue.put("3", "Naranja");
        valoresScreenValue.put("4", "Amarillo");
        valoresScreenValue.put("5", "Verde");
        valoresScreenValue.put("6", "Azul");
        valoresScreenValue.put("7", "Violeta");
        valoresScreenValue.put("8", "Gris");
        valoresScreenValue.put("9", "Blanco");
        return valoresScreenValue;
    }
	
	public Map<String, String> getValoresMultiplicadorByValue() {
        valoresMultiplicadorByValue = new HashMap<String, String>();
        valoresMultiplicadorByValue.put("1", "Negro");
        valoresMultiplicadorByValue.put("2", "Cafe");
        valoresMultiplicadorByValue.put("3", "Rojo");
        valoresMultiplicadorByValue.put("4", "Naranja");
        valoresMultiplicadorByValue.put("5", "Amarillo");
        valoresMultiplicadorByValue.put("6", "Verde");
        valoresMultiplicadorByValue.put("7", "Azul");
        valoresMultiplicadorByValue.put("8", "Violeta");
        valoresMultiplicadorByValue.put("9", "Gris");
        valoresMultiplicadorByValue.put("10", "Blanco");
        valoresMultiplicadorByValue.put("11", "Dorado");
        valoresMultiplicadorByValue.put("12", "Plateado");
        return valoresMultiplicadorByValue;
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
	
	public List<String> getListaBandas(){
		List<String> bandas = List.of("", "Negro", "Cafe", "Rojo", "Naranja", "Amarillo", "Verde", 
				"Azul", "Violeta", "Gris", "Blanco");
		return bandas;
	}
	
	public List<String> getListaMults(){
		List<String> bandasMult = List.of("", "Negro", "Cafe", "Rojo", "Naranja", "Amarillo", "Verde", 
				"Azul", "Violeta", "Gris", "Blanco", "Dorado", "Plateado");
		return bandasMult;
	}
	
	public List<String> getListaPPMs(){
		List<String> bandasPPMs = List.of("", "Cafe", "Rojo", "Naranja", "Amarillo", "Azul", "Violeta");
		return bandasPPMs;
	}
	
	public List<String> getListaTolerancias(){
		List<String> bandasTolerancias = List.of("","Cafe", "Rojo","Verde", "Azul", 
				"Violeta", "Gris", "Dorado", "Plateado");
		return bandasTolerancias;
	}
}
