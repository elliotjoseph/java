package javaclass;
import java.util.* ;
import java.util.Scanner;

public class Resistance_Widerstand {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		
		double r1, r2, r3, rTotaleParallele, rTotaleSerie ;
		char typeResistance ;
		String message ;
		
		System.out.print("Valeur de R1: ") ;
		r1 = scan.nextDouble() ;
		System.out.print("Valeur de R2: ") ;
		r2 = scan.nextDouble() ;
		System.out.print("Valeur de R3: ") ;
		r3 = scan.nextDouble() ;
		
		rTotaleParallele = r1 + r2 + r3 ;
		rTotaleSerie = 1.0/(1.0/r1 + 1.0/r2 + 1.0/r3) ;
		
		System.out.println("Résistance équivalente en parallèle: " + rTotaleParallele) ;
		System.out.println("Résistance équivalente en série: " + rTotaleSerie) ;
	}

}
