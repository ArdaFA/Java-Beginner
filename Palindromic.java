import java.util.Scanner;
public class Palindromic {
    
    static boolean isPalindromic(int number){
        int tempNum = number, reverseNumber = 0, lastDigit = 0;
        while (tempNum != 0){
            lastDigit = tempNum % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            tempNum /= 10;
        }
        if (number == reverseNumber){
            System.out.println("Yes, "+ number+ " is Palindromic");
            return true;
        }
        else {
            System.out.println("No, "+ number+ " is not Palindromic");
            return false;
        }
    }
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int userInput;
        userInput = scanner.nextInt();
        isPalindromic(userInput);

    }
}

