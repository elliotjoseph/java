package javaclass;
import java.util.Scanner;
public class Entiers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int NombreEntier1, NombreEntier2, somme, produit, moyenne ;
			
			// Installation du mécanisme d'écoute
			Scanner saisie = new Scanner(System.in) ;
			
			// introduction des variables 
			System.out.print("Entrer le 1er nombre entier : ");
			NombreEntier1 = saisie.nextInt() ;
			System.out.print("Entrer le 2e nombre entier  : ");	
			NombreEntier2 = saisie.nextInt() ;
			
			// calculs
			somme = NombreEntier1+NombreEntier2 ;
			produit = NombreEntier1*NombreEntier2 ;
			moyenne = somme:2 ;
			
			//Résultats affichage ecran
			System.out.println("La somme est de " + somme);
			System.out.println("Le produit est de " + produit);
			System.out.println("La moyenne est de " + moyenne);
			
			saisie.close();
	}

}
