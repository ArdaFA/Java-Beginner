import java.util.Random;
import java.util.Scanner;

public class Zahlenraten {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		System.out.println("**********\n"
								+ "Willkommen zum Ratenspiel!\n"
								+ "**********");
		System.out.print("Bitte geben Sie eine Zahl zwischen 1-100: ");
		int annahme = sc.nextInt();
		int zahl = rnd.nextInt(101);
		while (annahme != zahl ) {
			if (annahme < 0 || annahme > 100) {
				System.out.println("Die gegebene Zahl muss zwischen 1-100 sein!\n"
										+ "Bitte geben Sie eine Zahl zwischen 1-100: ");
				annahme = sc.nextInt();
			}
			
			else if ( annahme < zahl ) { 
				System.out.println("Bitte geben Sie noch groesser Zahl: ");
				annahme = sc.nextInt();
			}
			
			else if (annahme > zahl ) {
				System.out.println("Bitte geben Sie noch kleiner Zahl: ");
				annahme = sc.nextInt();
			}
		}

		System.out.println("Glueckwunsch! Sie haben gefunden! ");
	}
}