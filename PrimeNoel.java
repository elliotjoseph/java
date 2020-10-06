package javaclass;

import java.util.Scanner;

public class PrimeNoel {
	public static void main(String[] args) {
		
		// Entrées
		double nbHeuresSupp= 0, nbHeuresAbsence = 0 ;
		double prime ;
		double calculIntermediaire ;
		
		// Saisie des valeurs
		// lire les valeurs de nbHeuresSupp, nbHeuresAbsence

		// Ttmt
		calculIntermediaire = nbHeuresSupp= 0 - 2.0/3*nbHeuresAbsence ;
		
		if (calculIntermediaire > 40)
			prime = 500 ;
		else
			if (calculIntermediaire > 30)
				prime = 400 ;
			else
				if (calculIntermediaire > 20)
					prime = 300 ;
				else
					if (calculIntermediaire > 10)
						prime = 200 ;
					else
						prime = 100 ;

		System.out.print("votre prime est de :"+prime);
	}

}
