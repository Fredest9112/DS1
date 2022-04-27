package resCalc;

public class Calculate {

	public Resistencia calculate4BandsResistor(String band1, String band2, String mult,
			String tolerance) {
		int noDeBandas = NoDeBandas.CUATRO_BANDAS.getNoOfBandas();
		ColoresBandas banda = new ColoresBandas();
		ColoresMultiplicador multiplicador = new ColoresMultiplicador();
		ColoresTolerancia tolerancia = new ColoresTolerancia();
		double banda1 = banda.getValoresDeBandas().get(band1);
		double banda2 = banda.getValoresDeBandas().get(band2);
		double multValue = multiplicador.getValoresMultiplicador().get(mult);
		double toleranciaValue = tolerancia.getValoresDeTolerancias().get(tolerance);
		Resistencia resistencia = new Resistencia(noDeBandas,banda1, banda2, multValue, toleranciaValue);
		resistencia.setResistenciaTotal();
		return resistencia;
	}
}
