package ArrayBag;

import java.util.Scanner;


/* Ecrire un programme qui saisit un entier au clavier et qui recherche si cet entier appartient au tableau.
Au cas où la réponse est positive, l’indice de cet entier dans le tableau est affiché. S’il y a plusieurs
occurrences, le premier indice est affiché.
*/

public class ArraySecond2 {
	
	
	static int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int entier;
		
		System.out.println("Tape un chiffre.");
		
		entier = sc.nextInt();
		
			for (int i = 0; i < tab.length; i ++ )	{
				
				int x = tab[i];
				
				if (entier == x) {
					
					System.out.println(i);
					break;
					
				}
				
			}
			

	}

}
