package application;

public class InputValidator {
	private int number1, number2, intents, input;

	public boolean areNumbers(String num1, String num2, String numIntents) {
		try {
			number1 = Integer.valueOf(num1);
			number2 = Integer.valueOf(num2);
			intents = Integer.valueOf(numIntents);
			return true;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean isValidInput(String numInput) {
		try {
			input = Integer.valueOf(numInput);
			return true;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public int getNumber1() {
		return number1;
	}
	
	public int getNumber2() {
		return number2;
	}
	
	public int getIntents() {
		return intents;
	}
	
	public int getInput() {
		return input;
	}
}

	
