package English;

import java.util.Arrays;
import java.util.Scanner;

public class Exercice1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// I created an array which I am going to use to store numbers that user give me
		int numbers[] = new int[10];

		String answer = "";
		boolean error = false;
		int number;
		int position;

		// I ask to the user to store numbers on a list
		System.out.println("I'll store numbers on a list, you must choose where and which");

		do {
			do {
				try {
					System.out.println("A) Show numbers");
					System.out.println("B) Add an number");
					System.out.println("C) Exit");
					answer = sc.next();
					assert answer.equalsIgnoreCase("a") || answer.equalsIgnoreCase("b") || answer.equalsIgnoreCase("c")
							: "You must introduce A, B or C";
				} catch (AssertionError e) {
					System.err.println(e.getMessage());
					error = true;
				}
			} while (error == true);
			
			switch(answer.toUpperCase()) {
			
			case "A"->{
				System.out.println(Arrays.toString(numbers));
			}
			case "B"->{
				
				System.out.println("Write your number");
				number=sc.nextInt();
				
				System.out.println("Write the position");
				position=sc.nextInt();
				
				
				
			}
			case "C"->{
				System.out.println("Leaving program");
			}
			}
		} while (!answer.equalsIgnoreCase("c"));

	}

}
