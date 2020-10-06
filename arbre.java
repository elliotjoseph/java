package javaclass;

import java.util.Scanner;

public class arbre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Déclarer la variable
		int annee ;
		boolean bisextile ;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Annee: ") ;
		annee = scan.nextInt();
		
		if (annee%4 == 0)
			
			if (annee%100 == 0)

				if (annee%400 == 0)
					bisextile = true;
				else
					bisextile = false;
			else
				bisextile = true;
		else 
			bisextile = false;
		
		System.out.print(bisextile);
		annee = scan.nextInt();
		
	}

}
