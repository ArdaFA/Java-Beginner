import java.util.Scanner;

public class PalindromString { 

	public static boolean isPalindrom(String str) {


		// initialize a new string to save reverse
		String reverse = "";

		// initialize a new boolean to save the answer
		boolean answer = false;

		// define a limit to compare
		int half = str.length() / 2;

		// if the length of string is even 
		if (str.length() % 2 == 0) {
			for (int i = 0; i < half; i++) {
				if (str.charAt(i) == str.charAt(str.length()-1-i)){
					answer = true;
				}
				else {
					return answer;
				}
			}
		}

		// if the length of string is uneven
		if (str.length() % 2 == 1) {
			for (int i = 0; i <= half; i++) {
				if (str.charAt(i) == str.charAt(str.length()-1-i)){
					answer = true;
				}
				else {
					return answer;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		boolean stop = false;
		while(!stop){
			System.out.println("Give a String or q to quit: ");
			String str = scanner.nextLine();
			if (str.equals("q")){
				stop = true;
				break;
			}
			if (isPalindrom(str)) {
				System.out.println("Yes, " + str + " is palindrom!");
			}
			if (!isPalindrom(str)) {
				System.out.println("No, " + str + " is not palindrom!");
			}
		}
		
	}
}
