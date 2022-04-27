package resCalc;

public class ValidateInputs {
	
	public boolean areInputsValid;

	public void checkEmptyInputs(String band1, String band2, String mult,
			String tolerancia) {
		if(band1.isEmpty() || band2.isEmpty() || mult.isEmpty() || tolerancia.isEmpty()) {
			areInputsValid = false;
		} else {
			areInputsValid = true;
		}
	}

}
