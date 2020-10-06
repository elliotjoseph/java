package javaclass;
import java.util.*;

import java.util.Scanner;


public class nbrCroissant {

	public static void main(String[] args) {
		int x, y, z;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Valeur de x: ");
		x = scan.nextInt();
		
		System.out.print("Valeur de y: ");
		y = scan.nextInt();
		
		System.out.print("Valeur de z: ");
		z = scan.nextInt();
		
		if (x < y)
			if (y < z)
				System.out.print(x + " > " + y + " > " + z);
			
			else
				if (x < z)
					System.out.print(x + " > " + z + " > " + y);
				else
					System.out.print(z + " > " + x + " > " + y);
		else
			if (z < y)
				System.out.print(z + " > " + y + " > " + x);
			
			else
				if (z < x)
					System.out.print(y + " > " + z + " > " + x);
				else
					System.out.print(y + " > " + x + " > " + z);	
		
	}
}


