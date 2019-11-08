import javax.swing.JOptionPane;
import edu.wvu.seng560.arithmeticLibrary.ArithmeticFunctions;

public class PerformCalculationAction {

	public static void main(String[] args) {

		//opening message
		JOptionPane.showMessageDialog(null, "Welcome to the Basic Calculation Application!");

		//while true display the main menu
		boolean showMainMenuDialogue = true;

		while (showMainMenuDialogue) {

			// Main Menu
			String mainMenuInput = JOptionPane.showInputDialog("PLEASE SELECT AN OPERATION TO BEGIN " + "\n" + "\n"
					+ "(A) ADD" + "\n(D)	DIVIDE" + "\n(M)	MULTIPLY" + "\n(S)	SUBTRACT" + "\n(Q)	QUIT");

			// if a, perform addition
			if (mainMenuInput.equalsIgnoreCase("a")) {

				optionA();
			}

			// if d, perform division
			else if (mainMenuInput.equalsIgnoreCase("d")) {

				optionD();

			}

			// if m, perform multiplication
			else if (mainMenuInput.equalsIgnoreCase("m")) {

				optionM();

			}

			// if s, perform subtraction
			else if (mainMenuInput.equalsIgnoreCase("s")) {

				optionS();

			}
			// if q, QUIT
			else if (mainMenuInput.equalsIgnoreCase("q")) {

				optionQ();

			} else {
				JOptionPane.showMessageDialog(null, "Not a valid option, please try again!");
			}
		}
	}

	// addition, receives input from the user, performs the calculation, and returns the result
	public static void optionA() {
		ArithmeticFunctions arithmeticFunctionsLibrary = new ArithmeticFunctions();
		String value1 = showInputBoxValue1();
		String value2 = showInputBoxValue2();
		String result = arithmeticFunctionsLibrary.add(value1, value2);
		JOptionPane.showMessageDialog(null, "The Result is " + result);
		convertResult(result);
	}

	// division, receives input from the user, performs the calculation, and returns the result
	public static void optionD() {
		ArithmeticFunctions arithmeticFunctionsLibrary = new ArithmeticFunctions();
		String value1 = showInputBoxValue1();
		String value2 = showInputBoxValue2();
		String result = arithmeticFunctionsLibrary.divide(value1, value2);
		JOptionPane.showMessageDialog(null, "The Result is " + result);
		convertResult(result);
	}

	// multiplication, receives input from the user, performs the calculation, and returns the result
	public static void optionM() {
		ArithmeticFunctions arithmeticFunctionsLibrary = new ArithmeticFunctions();
		String value1 = showInputBoxValue1();
		String value2 = showInputBoxValue2();
		String result = arithmeticFunctionsLibrary.multiply(value1, value2);
		JOptionPane.showMessageDialog(null, "The Result is " + result);
		convertResult(result);
	}

	// subtraction, receives input from the user, performs the calculation, and returns the result
	public static void optionS() {
		ArithmeticFunctions arithmeticFunctionsLibrary = new ArithmeticFunctions();
		String value1 = showInputBoxValue1();
		String value2 = showInputBoxValue2();
		String result = arithmeticFunctionsLibrary.subtract(value1, value2);
		JOptionPane.showMessageDialog(null, "The Result is " + result);
		convertResult(result);
	}

	// quit the program
	public static void optionQ() {
		JOptionPane.showMessageDialog(null, "Thank you for using the Basic Calculation Application!");// closing message
		System.exit(0);
	}

	public static String showInputBoxValue1() {
		String value1 = JOptionPane.showInputDialog("Enter the First Value");
		
		//used to determine if the input contains a character
		boolean inputContainsLetter = false;
		for (char ch : value1.toCharArray()) {
		  if (Character.isLetter(ch)) {
			  inputContainsLetter = true;
		    break;
		  }
		}
		
		//if a character is present or no value is provided, default the value to '0'
		if (inputContainsLetter || value1 == null || value1.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Input is not valid, defaulting to 0");
		    value1 = "0";
		}
		
		return value1;
	}

	public static String showInputBoxValue2() {
		String value2 = JOptionPane.showInputDialog("Enter the Second Value");
		
		//used to determine if the input contains a character
		boolean inputContainsLetter = false;
		for (char ch : value2.toCharArray()) {
		  if (Character.isLetter(ch)) {
			  inputContainsLetter = true;
		    break;
		  }
		}
		
		//if a character is present or no value is provided, default the value to '0'
		if (inputContainsLetter || value2 == null || value2.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Input is not valid, defaulting to 0");
		    value2 = "0";
		}
		
		return value2;
	}

	//provides the ability to convert the result to a different unit
	public static void convertResult(String result) {
		ArithmeticFunctions arithmeticFunctionsLibrary = new ArithmeticFunctions();
		int dialogResult = JOptionPane.showConfirmDialog(null, "Would You Like to Convert the Result?", "Warning",
				JOptionPane.YES_NO_OPTION);
		if (dialogResult == JOptionPane.YES_OPTION) {
			String conversionType = JOptionPane.showInputDialog("PLEASE SELECT A UNIT TO CONVERT THE RESULT:" + "\n"
					+ "(2) BINARY" + "\n(8)	OCTAL" + "\n(16)	HEXADECIMAL");

			//convert the value to int, this is to be able to handle doubles during conversion
			int intResultValue = Double.valueOf(result).intValue();
			
			boolean showConversionDialogue = true;

			while (showConversionDialogue) {
				//convert to binary
				if (conversionType.equals("2")) {
					String convertedResult = arithmeticFunctionsLibrary.intToBin(String.valueOf(intResultValue));
					JOptionPane.showMessageDialog(null, "The Converted Result is " + convertedResult);
					break;
				} 
				//convert to octal
				else if (conversionType.equals("8")) {
					String convertedResult = arithmeticFunctionsLibrary.intToOct(String.valueOf(intResultValue));
					JOptionPane.showMessageDialog(null, "The Converted Result is " + convertedResult);
					break;
				} 
				//convert to hexadecimal
				else if (conversionType.equals("16")) {
					String convertedResult = arithmeticFunctionsLibrary.intToHex(String.valueOf(intResultValue));
					JOptionPane.showMessageDialog(null, "The Converted Result is " + convertedResult);
					break;
				} 
				
				//a valid option was not selected, returns to the main menu
				else {
					JOptionPane.showMessageDialog(null, "Not a valid selection, please begin again!");
					showConversionDialogue = false;
				}
			}
		}
	}
}
	


