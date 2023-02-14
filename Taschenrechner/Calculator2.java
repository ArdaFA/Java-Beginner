import java.util.Scanner;

public class Calculator2 { 

public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("**********");
	String Operationen = "1. Addition\n"
								+"2. Substraktion\n"
								+"3. Multiplikation\n"
								+"4. Division";
	
	System.out.println(Operationen);
	System.out.println("**********");
	
	System.out.println("Wählen Sie die Nummer der Rechneroperationen: ");
	String Operation = scanner.nextLine();
	double a;
	double b;
	switch(Operation) {
		case "1":
			System.out.print("erste Zahl: ");
			a = scanner.nextDouble();
			System.out.print("zweite Zahl: ");
			b = scanner.nextDouble();
			System.out.print("Java Calculator " +(a+b));
			break;
			
		case "2":
			System.out.print("erste Zahl: ");
			a = scanner.nextDouble();
			System.out.print("zweite Zahl: ");
			b = scanner.nextDouble();
			System.out.print("Java Calculator " +(a-b));
			break;
		
		case "3":
			System.out.print("erste Zahl: ");
			a = scanner.nextDouble();
			System.out.print("zweite Zahl: ");
			b = scanner.nextDouble();
			System.out.print("Java Calculator " +(a*b));
			break;

		case "4":
			System.out.print("erste Zahl: ");
			a = scanner.nextDouble();
			System.out.print("zweite Zahl: ");
			b = scanner.nextDouble();
			System.out.print("Java Calculator " +(a/b));
			break;
		default:
			System.out.println("falsche Rechneroperationen oder falsche Zahl!");
	}
}
}
