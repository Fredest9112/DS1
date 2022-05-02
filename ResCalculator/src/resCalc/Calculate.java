package resCalc;

public class Calculate {

	public Resistencia calculateFourBandsResistor(String band1, String band2, 
			String mult, String tolerance) {
		int noDeBandas = NoDeBandas.CUATRO_BANDAS.getNoOfBandas();
		Bandas bandas = new Bandas();
		double banda1 = bandas.getValoresDeBandas().get(band1);
		double banda2 = bandas.getValoresDeBandas().get(band2);
		double multValue = bandas.getValoresMultiplicador().get(mult);
		double toleranciaValue = bandas.getValoresDeTolerancias().get(tolerance);
		Resistencia resistencia = new Resistencia(noDeBandas,banda1, banda2, multValue, toleranciaValue);
		resistencia.setResistenciaTotal();
		return resistencia;
	}
	
	public Resistencia calculateFiveBandsResistor(String band1, String band2, 
			String band3, String mult, String tolerance) {
		int noDeBandas = NoDeBandas.CINCO_BANDAS.getNoOfBandas();
		Bandas bandas = new Bandas();
		double banda1 = bandas.getValoresDeBandas().get(band1);
		double banda2 = bandas.getValoresDeBandas().get(band2);
		double banda3 = bandas.getValoresDeBandas().get(band3);
		double multValue = bandas.getValoresMultiplicador().get(mult);
		double toleranciaValue = bandas.getValoresDeTolerancias().get(tolerance);
		Resistencia resistencia = new Resistencia(noDeBandas, banda1, banda2, 
				banda3, multValue, toleranciaValue);
		resistencia.setResistenciaTotal();
		return resistencia;
	}
	
	public Resistencia calculateSixBandsResistor(String band1, String band2, 
			String band3, String mult, String tolerance, String ppm) {
		int noDeBandas = NoDeBandas.SEIS_BANDAS.getNoOfBandas();
		Bandas bandas = new Bandas();
		double banda1 = bandas.getValoresDeBandas().get(band1);
		double banda2 = bandas.getValoresDeBandas().get(band2);
		double banda3 = bandas.getValoresDeBandas().get(band3);
		double multValue = bandas.getValoresMultiplicador().get(mult);
		double toleranciaValue = bandas.getValoresDeTolerancias().get(tolerance);
		double ppmValue = bandas.getValoresDePPM().get(ppm);
		Resistencia resistencia = new Resistencia(noDeBandas, banda1, banda2, 
				banda3, multValue, toleranciaValue, ppmValue);
		resistencia.setResistenciaTotal();
		return resistencia;
	}
}
