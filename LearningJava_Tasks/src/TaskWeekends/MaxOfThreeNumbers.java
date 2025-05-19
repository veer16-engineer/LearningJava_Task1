package TaskWeekends;

import java.util.Scanner;

public class MaxOfThreeNumbers {

	public static void main(String[] args) {
		
		
  Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter N1: ");
        int n1 = scanner.nextInt();
        
        System.out.print("Enter N2: ");
        int n2 = scanner.nextInt();
        
        System.out.print("Enter N3: ");
        int n3 = scanner.nextInt();
        
        // Nested ternary operator to find the maximum
        int max = (n1 > n2) ? ((n1 > n3) ? n1 : n3) : ((n2 > n3) ? n2 : n3);
        
        System.out.println("Maximum number is: " + max);
        
        scanner.close();
    }

	}


