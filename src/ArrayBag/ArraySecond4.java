package ArrayBag;

public class ArraySecond4 {
	
	/*Ecrire un programme qui saisit deux indices et échange les valeurs contenues dans le tableau à ces deux
	indices. Le programme affichera le contenu du tableau avant et après cette transformation.*/
	
	 static int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
		
	 public static void swap(int x, int y) {
		int z = 0;
		
		System.out.println("La valeur de x est : " + tab[x] + ".  La valeur de y est : " + tab[y] );
		
		  z    = tab[x]; 
		tab[x] = tab[y]; 
		tab[y] = z; 
		
		System.out.println("La nouvelle valeur de x est : " + tab[x] + ".  La nouvelle valeur de y est : " + tab[y]);		
	 }
	
	
	public static void main(String args[]) {
		
		
		 
		swap(3, 5);
		
	}

}
