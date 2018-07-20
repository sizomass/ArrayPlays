package ArrayBag;

import java.util.Scanner;
/*Reprendre la partie saisie du programme précédent pour écrire un nouveau programme qui re-
cherche et affiche le plus grand élément du tableau. Puis le plus petit*/

public class ArraySecond1_2 {

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


		int smallest = tab2[0];
		for (int i = 0; i < tab2.length; i++) {
			if (tab2[i] < smallest) {
				smallest = tab2[i];
			}

		}
		System.out.println(smallest);

		int biggest = tab2[0];
		for (int i = 0 ; i < tab2.length; i++) {
			if (tab2[i] > biggest) {
				biggest = tab2[i];
			}
		}
		System.out.println(biggest);
	}
}






		
		
		
		
	
