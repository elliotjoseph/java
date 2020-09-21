package javaclass;
import java.util.* ;

public class Echange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nombre1, nombre2, temp ;
		Scanner alloJEcoute = new Scanner(System.in) ;
	
		// saisie des infos
		System.out.println("Entre un premier nombre : ") ;
		nombre1 = alloJEcoute.nextInt() ;
		System.out.println("Entre un deuxième nombre : ") ;
		nombre2 = alloJEcoute.nextInt() ;
		
		// traitement
		temp = nombre1 ;
		nombre1 = nombre2 ;
		nombre2 = temp ;
		
		
		// affichage
		System.out.println("La 1re variable contient : " + nombre1) ;
		System.out.println("La 2e variable contient : " + nombre2) ;
		

	}

}
