import java.util.Random;
import java.util.Scanner;

public class Mastermind {
	
	private static final int CODE_LENGTH = 4;
	private static final int NUM_COLORS = 8;
	private static final int MAX_TRIES = 10;
	
	public static void main(String[] args) {							// Erstelle einen zufälligen 4-stelligen Code
		Random random = new Random();
		int[] code = new int[CODE_LENGTH];
	
		for (int i = 0; i < CODE_LENGTH; i++) {
		
			int tmp = random.nextInt(NUM_COLORS) + 1;
			boolean tmpbool = true;
		
			while(tmpbool){												//Überprüfung, ob Zahlen doppelt vorkommen
				tmpbool = false;
				for(int s = 0; s < i; s++){
				if(code[s] == tmp){
					tmp = random.nextInt(NUM_COLORS) + 1;
					tmpbool = true;
					}
				}
			}
			
			code[i] = tmp;		
		}
		Scanner input = new Scanner(System.in);
		for (int tries = 1; tries <= MAX_TRIES; tries++) {				// Frage den Benutzer um einen Tipp
			System.out.println("Geben Sie Ihren Tipp ein (4-stellige Zahl von 1 bis 8):");
			String guess = input.next();
			
			if (guess.length() != CODE_LENGTH) {							// Prüfe, ob der Tipp die richtige Länge hat
				System.out.println("Der Tipp muss genau " + CODE_LENGTH + " Ziffern haben.");
				continue;		
			}
	 
			int correctPos = 0;									// Zähle die richtigen Zahlen an der richtigen Stelle und an der falschen Stelle
			int correctNum = 0;
			
			for (int i = 0; i < CODE_LENGTH; i++) {
				int guessNumber = Character.getNumericValue(guess.charAt(i));
				
				if (guessNumber == code[i]) {
				correctPos++;
				}
				
				else if (codeContains(code, guessNumber)) {
				correctNum++;
				}
			}

			// Gib dem Benutzer das Ergebnis seines Tipps
			System.out.println(correctPos + " Zahl(en) an der richtigen Stelle und " + correctNum + " Zahl(en) an der falschen Stelle.");

			// Prüfe, ob der Benutzer den Code erraten hat
			if (correctPos == CODE_LENGTH) {
				System.out.println("Gratuliere, Sie haben den Code erraten!");
				return;
			}
		}
		
		// Wenn der Benutzer den Code nicht innerhalb der maximalen Anzahl an Versuchen erraten hat, hat das Programm gewonnen und gibt den gesuchten Code aus
		String codeOut = "";
		for(int d: code){
			codeOut = codeOut + d;
		}	
		System.out.println("Sie haben leider verloren. Der Code war: " + codeOut);
	}

	// Hilfsfunktion, um zu prüfen, ob ein Array eine bestimmte Zahl enthält
	private static boolean codeContains(int[] code, int num) {
		for (int i : code) {
			if (i == num) {
				return true;
			}
		}
		return false;
	}	
}
