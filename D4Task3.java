package Tasks;

public class D4Task3 {
	public static void main(String[] args) {
		try {
			int numerator = 10;
			int denominator = 0;
			int result = numerator / denominator;
			System.out.println("Result of division: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Error: Cannot divide by zero!");
		}
	}
}
