package ArrayBag;

import java.util.Scanner;


public class ArraySecond1 {
	
	
	/*
	Ecrire un programme qui saisit un entier au clavier et qui recherche si cet entier appartient au tableau
	(réponse de type oui/non).
	Note : il serait possible d’arrêter la recherche dès qu’on a trouvé le nombre avec une instruction
	break pour sortir de la boucle for.
	*/
	
	
	static int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
	
	
	
	public static void main(String[] args) { 
	
		// TODO Auto-generated method stub
				
		Scanner sc = new Scanner(System.in);
		int essai;	
		int x;
		boolean isFound = false;
							
				do {
				
					System.out.println("Tape un nombre, nous allons voir si il est dans tab");
					essai = sc.nextInt();
		
						
					for (int i = 0; i < tab.length; i++) { 
							
						x = tab[i];
			 
						if (essai == x) { 				 
							System.out.println(essai + " est dans tab!");
				 			isFound = true;							
				 
						}	 		 
			 
					}			 
						System.out.println(essai + " n'est pas dans tab...");
									
				} while(isFound == false);
		 
	}
			
}



