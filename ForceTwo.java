import java.util.Scanner;

public class ForceTwo {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        // get user input
        int userInput;
        userInput = scanner.nextInt();

        for(int i = 1; i < userInput; i *= 2){
            System.out.println(i);
        }
    }
}