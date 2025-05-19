package TaskWeekends;

import java.util.Scanner;

public class EvenOddChecker {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        // Input a number
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        // Use ternary operator to check even or odd
	        String result = (number % 2 == 0) ? "Even" : "Odd";

	        System.out.println("The number is " + result);
	        
	        scanner.close();
	    }

	}


