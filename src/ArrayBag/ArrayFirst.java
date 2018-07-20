package ArrayBag;

import java.util.Scanner;

public class ArrayFirst {
	
	/*énoncé : Si l'utilisateur rentre une lettre et que c'est 'a' ou 'n', affichez qu'il a gagné; s' il rentre autre chose : affichez qu'il a perdu
	*/
	
	
	
	public static void main(String args[]) {
		
		
		char tab[] = {'a', 'v', 'i', 'o', 'n'};
		
		
		char letter;
		
		do { 
			
		System.out.println("Veuillez taper une lettre!");
		
		Scanner sc = new Scanner(System.in);
		
		String essai = sc.nextLine();
				
		 letter = essai.charAt(0);
		
				
		
		
		if (letter == tab[0] || letter == tab[4] ) {
			
			System.out.println("YOU WIN");
			
			break;
			
		} else {
			
			System.out.println("LOOSER !");
			
		}
		 
				
		} while (letter != tab[0] || letter != tab[4]);
		
	}

}
