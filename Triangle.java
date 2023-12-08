import java.util.Scanner;

public class Triangle {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the height of triangle? ");
        int userInput;
        userInput = scanner.nextInt();

        // write every column
        for (int i = 0; i < userInput ; i++) {

            // make spaces before star
            for (int j = 1; j <= (userInput - i); j++) {
                System.out.print(" ");
            }

            // make stars
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
