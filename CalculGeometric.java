package javaclass;

import java.util.* ;

public class CalculGeometric {


	public static void main(String[] args) {
		int longueur, largeur, hauteur, perimetre, surface, volume ;
		
		// Installation du m�canisme d'�coute
		Scanner saisie = new Scanner(System.in) ;
		
		// introduction des variables 
		System.out.print("Entrer une longueur : ");
		longueur = saisie.nextInt() ;
		System.out.print("Entrer une largeur  : ");	
		largeur = saisie.nextInt() ;
		System.out.print("Entrer une hauteur  : ");	
		hauteur = saisie.nextInt() ;
		
		// calculs
		// perimetre = longueur + longueur + largeur + largeur ;
		// perimetre = (longueur + largeur)* 2 ;
		perimetre = longueur + largeur ;
		perimetre = perimetre*2 ;
		
		surface = longueur*largeur ;
		
		volume = surface*hauteur ;
		
		// affichage des informations � l'�cran
		System.out.println("Le p�rim�tre est de " + perimetre);
		System.out.println("La surface est de " + surface);
		System.out.println("Le volume est de " + volume);
		
		saisie.close();
	}

}
