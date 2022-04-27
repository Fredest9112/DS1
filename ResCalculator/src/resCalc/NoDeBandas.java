package resCalc;

public enum NoDeBandas {
	CUATRO_BANDAS (4),
	CINCO_BANDAS (5),
	SEIS_BANDAS (6);
	private int noDeBandas;
	private NoDeBandas(int noDeBandas) {
		this.noDeBandas = noDeBandas;
	}
	public int getNoOfBandas() {
		return this.noDeBandas;
	}
}
