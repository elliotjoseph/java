package javaclass;

import java.util.Scanner;

public class MonPremierProgrammeJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nbEtudiant = 0 ;
		double note = 0 ;
		String nom = null ;
		
		Scanner monCanalEcoute = new Scanner(System.in) ;
	
		//Dire � l'ordinateur d'afficher le contenu de nos variables
		System.out.print ("Veuillez entrer le nom de l'�tudiant");
		System.out.println (nom) ;
		System.out.print ("Veuillez entrer le nombre d'�tudiants");
		System.out.println (nbEtudiant) ;
		System.out.print("Veuillez entrer la moyenne");
		System.out.print (note) ;
		
		// ou
		System.out.print ("Veuillez entrer le nom de l'�tudiant" + nom);
		System.out.print ("Veuillez entrer le nombre d'�tudiants" + nbEtudiant);
		System.out.print("Veuillez entrer la moyenne" + note);
		
		
		nbEtudiant = monCanalEcoute.nextInt() ;
		note = monCanalEcoute.nextDouble() ;
		nom = monCanalEcoute.nextLine () ;
		
		//Dire � l'ordinateur d'afficher le contenu de nos variables
		System.out.print ("nom : ") ;
		System.out.println (nom) ;
		System.out.print ("nbEtudiant : ") ;
		System.out.println (nbEtudiant) ;
		System.out.print ("note : ") ;
		System.out.print (note) ;
		
		
		
		
	
	}

}
