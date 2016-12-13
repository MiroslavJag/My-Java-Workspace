import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite vase ime: ");
		String ime = input.nextLine();
		
		System.out.println("Unesite vase prezime: ");
		String prezime = input.nextLine();
		
		System.out.println("Unesite vasu godinu rodjenja: ");
		String god= input.nextLine();
		
		System.out.println("Vase ime je: " +ime+ "\n" + "Vase prezime je: " +prezime + "\n" + "Rodjeni ste: " +god + ".god");
			

	}

}
