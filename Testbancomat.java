package javaclass;
import java.util.Scanner;


public class Testbancomat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int somme;	// declaration des variables
		int reste ;
		int b1000, b200, b100, b50, b20, b10 ;
		
		Scanner scan = new Scanner(System.in) ; //déclaration du scanner
		
		System.out.println("Montant: ");	//affichage 		
		somme = scan.nextInt() ;	//saisie clavier
		System.out.println(somme);	//affichage
				
			
		b1000 = somme / 1000 ;	//algo
		reste = somme % 1000 ;
		
		b200 = reste / 200 ;
		reste = reste % 200 ;
		
		b100 = reste / 100 ;
		reste = reste % 100 ;
		
		b50 = reste / 50 ;
		reste = reste % 50 ;
		
		b20 = reste / 20 ;
		reste = reste % 20 ;
		
		b10 = reste / 10 ;
		reste = reste % 10 ;
		
		System.out.println("Billets de 1000: " + b1000) ;  //affichage
		System.out.println("Billets de 200: " + b200) ;
		System.out.println("Billets de 100: " + b100) ;
		System.out.println("Billets de 50: " + b50) ;
		System.out.println("Billets de 20: " + b20) ;
		System.out.println("Billets de 10: " + b10) ;
		System.out.println("il reste: " + reste) ;	
		
	}
}