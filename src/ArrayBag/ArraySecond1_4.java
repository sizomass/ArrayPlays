package ArrayBag;

 import java.util.Scanner;
public class ArraySecond1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] tab = new int[6];
		
		for (int i = 0; i < tab.length ; i ++) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Tape un Nombre");
			int x = sc.nextInt();
			tab[i]= x;
			
		}
		int sum = 0;
		
		for ( int y  :  tab) {
			
			
			sum = sum + y;
			
		}
		
		double 	average = sum / (tab.length - 1);
		
		System.out.println(average);
	}
	

}
