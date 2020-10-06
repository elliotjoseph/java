package javaclass;

import java.util.Scanner; 

import java.util.* ;

	public class carre {
		public static void main( String [] argument) {
			Scanner scan = new Scanner(System.in) ;
			int a, b;
			char operator;
			double calculation = 0;
			boolean OK = true;
			
			System.out.print("Enter the first value : ");
			a = scan.nextInt() ;
			
			System.out.print("Enter the second value : ");
			b = scan.nextInt() ;
			
			System.out.print("Type of operation : (+, -, *, /) : ");
			operateur = scan.nextInt() ;
			
			switch (operator) {
				case '+' : 
										calculation = a + b;
										break;
				case '-' : 
										calculation = a - b;
										break;
				case '/' : 
										if ( b != 0) 
											calculation = a / b;
										else 
											OK = false;
										break;
				case '*' : 
										calculation = a * b ;
										break;
				default : 
										OK = false ;
			}
			
			if (OK) {
				System.out.print("The result is : ");
				System.out.println(a + " " + operator + " "+ b + " = " + calculation);
			}
			else
				System.out.println("Illegal operation !");
		}
	}


	/*
	b. Running the program with the set of values 2, 0 and /
	   Enter the first value: 2
	   Enter the second value: 0
	   Type of transaction: (+, -, *, /): /
	 
	 java.lang.ArithmeticException: / by zero
	 at Calculator.main (Calculator_14.java: 22)
	 The interpreter detects an exception of type arithmetic. This is the division by zero.

	c. The error comes from the division. Just check the value of b is not zer, at the case '/' 
	of the switch structure. Consider the correction:

	public class Calculator_14 {
		public static void main( String [] argument) {
			Scanner scan = new Scanner(System.in) ;
			int a, b;
			char operator;
			double calculation = 0;
			boolean OK = true;
			
			System.out.print("Enter the first value : ");
			a = scan.nextInt() ;
			
			System.out.print("Enter the second value : ");
			b = scan.nextInt() ;
			
			System.out.print("Type of operation : (+, -, *, /) : ");
			operateur = scan.nextInt() ;
			
			switch (operator) {
				case '+' : 
										calculation = a + b;
										break;
				case '-' : 
										calculation = a - b;
										break;
				case '/' : 
										if ( b != 0) 
											calculation = a / b;
										else 
											OK = false;
										break;
				case '*' : 
										calculation = a * b ;
										break;
				default : 
										OK = false ;
			}
			
			if (OK) {
				System.out.print("The result is : ");
				System.out.println(a + " " + operator + " "+ b + " = " + calculation);
			}
			else
				System.out.println("Illegal operation !");
		}
	}
	 
	 At the case '/', the program checks whether b is not zero. If this happens, it runs normally
	 conducting the investigation division. Conversely, if b is zero, the division is not performed but the
	 false is assigned to the variable OK of type Boolean (default initialized to true on the
	 variable declaration).
	 
	 In this way, to show the calculation result, the program checks the value of the variable OK.
	 If it is true, this means that the operation was performed without particularly difficulties.
	 If it means that no operation could be performed, the program reports
	 then a message that the operation is illegal.
	 
	 Note that false is also assigned to the variable OK for the default case.
	 So, if the user enters a character other than +, -, / or *, the program performs no calculations
	 and indicates a message that the operation is illegal.
	 
	 In computer jargon, we say that the variable OK is a flag. Indeed, it
	 changes state (value) according to the instructions executed. The image of the flag comes from
	 American mailboxes with the flag changes position when the postman leaves a letter
	 in the box. This change of position (status) reports then the recipient that a new
	 mail has arrived.
	 
	 */

