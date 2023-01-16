import java.util.Scanner;

public class Main {

	int km, lt;
	int consumi;

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Inserire n. di km");
		int km = Integer.parseInt(in.nextLine());

		System.out.println("Inserire n. di lt consumati");
		int lt = Integer.parseInt(in.nextLine());

		try {
			calcolaConsumi(km, lt);
		} catch (ArithmeticException e) {
			System.out.println("Errore, non si puo dividere per 0");
		}
		;

	}

	public static int calcolaConsumi(int km, int lt) {
		
		int consumo = 0;

		consumo = km / lt;
		return consumo;

	}

}
