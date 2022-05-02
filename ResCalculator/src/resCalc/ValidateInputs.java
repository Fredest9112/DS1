package resCalc;

public class ValidateInputs {

	public boolean checkEmptyInputs(String band1, String band2, String mult,
			String tolerancia) {
		if(band1.isEmpty() || band2.isEmpty() || mult.isEmpty() || tolerancia.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean checkEmptyInputs(String band1, String band2, String band3, 
			String mult, String tolerancia) {
		if(band1.isEmpty() || band2.isEmpty() || band3.isEmpty()
				|| mult.isEmpty() || tolerancia.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

	public boolean checkEmptyInputs(String band1, String band2, String band3, 
			String mult, String tolerancia, String ppm) {
		if(band1.isEmpty() || band2.isEmpty() || band3.isEmpty()
				|| mult.isEmpty() || tolerancia.isEmpty() || ppm.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}
}
