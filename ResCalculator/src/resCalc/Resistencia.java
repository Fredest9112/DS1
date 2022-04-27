package resCalc;

public class Resistencia {
	
	private int noDeBandas;
	private double banda1;
	private double banda2;
	private double banda3;
	private double multiplicador;
	private double tolerancia;
	private double ppm;
	private double resistenciaTotal;
	
	public Resistencia(int noDeBandas, double banda1, double banda2,
			double multiplicador, double tolerancia) {
		this.noDeBandas = noDeBandas;
		this.banda1 = banda1;
		this.banda2 = banda2;
		this.banda3 = 0.0;
		this.multiplicador = multiplicador;
		this.tolerancia = tolerancia;
		this.ppm = 0.0;
	}
	
	public Resistencia(int noDeBandas, double banda1, double banda2, double banda3,
			double multiplicador, double tolerancia) {
		this.noDeBandas = noDeBandas;
		this.banda1 = banda1;
		this.banda2 = banda2;
		this.banda3 = banda3;
		this.multiplicador = multiplicador;
		this.tolerancia = tolerancia;
		this.ppm = 0.0;
	}
	
	public Resistencia(int noDeBandas, double banda1, double banda2, double banda3,
			double multiplicador, double tolerancia, double ppm) {
		this.noDeBandas = noDeBandas;
		this.banda1 = banda1;
		this.banda2 = banda2;
		this.banda3 = banda3;
		this.multiplicador = multiplicador;
		this.tolerancia = tolerancia;
		this.ppm = ppm;
	}
	
	public void setResistenciaTotal() {
		if(noDeBandas==NoDeBandas.CUATRO_BANDAS.getNoOfBandas()) {
			resistenciaTotal = ((banda1*10)+banda2)*multiplicador;
		} else if(noDeBandas==NoDeBandas.CINCO_BANDAS.getNoOfBandas()) {
			resistenciaTotal = ((banda1*100)+(banda2*10)+banda3)*multiplicador;
		} else {
			resistenciaTotal = ((banda1*100)+(banda2*10)+banda3)*multiplicador;
		}
	}
	
	public String getValorResistencia() {
		return String.valueOf(resistenciaTotal);
	}
	
	public String getValorTolerancia() {
		return String.valueOf(tolerancia);
	}
	
	public String getValorPPM() {
		return String.valueOf(ppm);
	}
}
