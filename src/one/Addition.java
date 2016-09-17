package one;

public class Addition {
/**
 * Write a program to print the sum of two numbers without
 * using + operator. Other operators have to be used.
 * @param args
 */
	public static void main(String[] args) {
		int first_number = 1;
		int second_number = 10;
		int result = first_number - (second_number * -1);

		System.out.println("Sum of " + first_number + " and " + second_number + " is equal to " + result + ".");
	}

}