package javaclass;

import java.util.*;

public class Tricount {
	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		int i, nbSaisie ;
		float []depenses ;  // d�clare une variable de type "tableau"
		float somme ;
		
		System.out.println("Nombre de saisies : ") ;
		nbSaisie = saisie.nextInt() ;

		// cr�ation du tableau
		depenses = new float[nbSaisie] ; 
		
		somme = 0.0f ;
		
		for (i=0 ; i<nbSaisie ; i++) {
			System.out.println("Entrer la d�pense num�ro " + (i+1) + " : ") ;
			depenses[i] = saisie.nextFloat() ;
			somme += depenses[i] ;
		}
		
		// System.out.println(depenses) ;
		for (i=0 ; i<nbSaisie ; i++) // ou i<depenses.length
			System.out.println("D�pense " + (i+1) + " : " + depenses[i]) ;
			
		saisie.close();
	}

}
