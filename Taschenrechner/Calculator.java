import java.util.Scanner;
public class Calculator {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Willkommen zum Java-Taschenrechner");
		System.out.println("1. Addition (+)");
		System.out.println("2. Substraktion (-)");
		
		System.out.print("Bitte geben Sie die Nummer der Rechneroperationen: ");
		int c;
		c = scanner.nextInt();
		
		System.out.print("Bitte geben Sie die erste Zahl: ");
		double a;
		a = scanner.nextDouble();
		
		System.out.print("Bitte geben Sie die zweite Zahl");
		double b;
		b = scanner.nextDouble();
		
		if ( c == 1 ) {
			System.out.println("Java Calculator " + (a+b));
		}
		
		else if ( c == 2 ) {
			System.out.println("Java Calculator " + (a-b));
		}
		
		else {
			System.out.println("falsche Rechneroperationen oder falsche Zahl");
		}
	}
}
