import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // all even numbers til input
        Scanner scanner = new Scanner(System.in);
        int userInput;
        System.out.print("number: ");
        userInput = scanner.nextInt();
        int start = 0;
        while(start <= userInput){
            start++;
            if ( start % 2 == 1){
                continue;
            }
            System.out.println(start);
        }
    }
}