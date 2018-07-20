package ArrayBag;

import java.util.Scanner;
/*Ecrire un programme qui saisit 6 entiers et les stocke dans un tableau, puis affiche le contenu de ce
tableau une fois qu’il est rempli.*/

public class ArraySecond1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


	Scanner sc = new Scanner(System.in);
	
	int [] tab2 = new int[6];
	
	for (int x = 0 ; x < 6 ; x++) {
		
		System.out.println("tape un nombre");
		 tab2[x] = sc.nextInt();
			
		}
	
	for (int i = 0; i< tab2.length; i++ ) {
		
		System.out.println(tab2[i]); 
	}
	}

}

