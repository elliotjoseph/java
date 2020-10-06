package javaclass;
import java.util.Scanner;
import java.util.*;

public class Max2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in) ;
		int valeur1, valeur2, valeur3 ;
		
		System.out.println("Entrer la 1re valeur: ") ;
		valeur1 = input.nextInt() ;
		
		System.out.println("Entrer la 2e valeur: ") ;		
		valeur2 = input.nextInt() ;
		
		System.out.println("Entrer la 3e valeur: ") ;		
		valeur3 = input.nextInt() ;
		
		if (valeur1 < valeur2 <valeur3) {
			System.out.println(valeur1 + " " + valeur2 + valeur3) ;
			max = valeur3 ;
			System.out.println("Le max est de : " + max)
		}
		else {
			System.out.println(valeur2 + " " valeur1 + valeur 3) ;
			max = valeur2 ;
			
		}
		else {
			System.out.println(valeur3 + " " valeur2 + valeur 1) ;
			max = valeur1 ;
			System.out.println("Le max est de : " + max)
		}
		
	}

}
