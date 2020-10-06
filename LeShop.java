package javaclass;
import java.util.Scanner;

public class LeShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double panier;
		double frais;
		double total;
		
		Scanner scan = new Scanner(System.in) ;
		System.out.println ( "Valeur du panier ( >= 99) " ) ;
			panier = scan.nextInt() ;
		if (panier >= 200)
			frais = 7.90 ;
		else
		if (panier >= 160)
			frais = 13.90 ;
		else
			frais = 15.90 ;
			total = panier + frais ;
		System.out.println ("Frais " + frais) ;
		System.out.println ("Total " + total) ;
		
	}

}
