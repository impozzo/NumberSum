import java.util.Scanner;

public class Sum {

	public Sum() {
	}

	public static void sumNumbers(String numberString) {

		int numSum = 0;
		String numString;

		numString = numberString.trim();
		String[] addNumbers = numString.split(" ");

		for (String a : addNumbers) {
			if (isNumeric(a)) {
				numSum += Integer.parseInt(a);
				if (numSum == Integer.parseInt(a))
					System.out.println(a);
				else
					System.out.println(" + " + a + "=" + numSum);
			}
			else
				System.out.println(a + " is not a number.");
		}
		
		System.out.println("The sum is: " + numSum);

	}

	public static boolean isNumeric(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter a list of numbers with spaces between");

		String numberString = myObj.nextLine(); // Read user input
		myObj.close();
		sumNumbers(numberString);

	}

}
