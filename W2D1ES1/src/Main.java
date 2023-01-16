import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Main {
	static int[] array = new int[5];
	
	private static int a, i ;

	public static void main(String[] args) {
		
		
		
		
		
		array = creaArray();
		System.out.println(Arrays.toString(array));
		addNumero();

		

	}

	public static int[] creaArray() {
		int[] array = new int[5];
		Random random = new Random();
		
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(11);
		}
		return array;
	}
	
	
	public static void addNumero() {
		

		Scanner in = new Scanner(System.in);
	
		
		
		do {
			
			try {
				System.out.println("Scegli il numero da inserire: ");
				a = Integer.parseInt(in.nextLine());

				System.out.println("Dove vuoi inserire il numero? (0/4)");
				i = Integer.parseInt(in.nextLine());

			}
			catch( NumberFormatException e ){
				System.out.println("Inserire numeri in un formato corretto");
			};

			try {
				array[i] = a;
			} 
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("La posizione indicata non esiste");
				System.out.println("Dove vuoi inserire il numero? (0/4)");
				i = Integer.parseInt(in.nextLine());
				array[i] = a;
			};
			
			System.out.println(Arrays.toString(array));
		
			
				

		} while (a != 0);

	}


}
