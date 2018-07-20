package ArrayBag;
import java.util.Scanner;
public class ArraySecond1_5 {

	 /*Ecrire un programme qui saisit d’abord un nombre n, puis ensuite saisit n caractères et les place
	dans un tableau.*/
	static Scanner sc = new Scanner(System.in);
	static Scanner sc2 = new Scanner(System.in);
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Saisissez un nombre entier.");
		int n = sc.nextInt();
		
		
		char [] charList = new char [n];
		
		System.out.println("entrez une string plus grande que <n> s'il vous plait");
		
		
		String mot = sc2.nextLine();
		int x = mot.length();
		
		if (n <= x) {
		
		for(int i = 0; i < n; i++) {
			
			 charList[i]= mot.charAt(i);
		}
		}
		
		for (char y : charList) {
			
			System.out.println(y);
		}
	}

}
