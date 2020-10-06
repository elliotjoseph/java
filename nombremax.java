package javaclass;

import java.util.Scanner;

public class nombremax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in) ;
		
	int n1, n2, n3 ;
		
		System.out.println("Entrer la 1re valeur: ") ;
		n1 = input.nextInt() ;
		
		System.out.println("Entrer la 2e valeur: ") ;		
		n2 = input.nextInt() ;
		
		System.out.println("Entrer la 3e valeur: ") ;		
		n3 = input.nextInt() ;
		
		int max = 0;
		
	
		if(n1 > n2 && n1 > n3)
			max = n1;
		
		if(n1 > n1 && n2 > n3)
			max = n2;
		
		if(n3 > n1 && n3 > n1)
			max = n3;
		
		System.out.print("Le maximum est " + max);

	}

}
