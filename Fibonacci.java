import java.util.Scanner;

public class Fibonacci {

    static int recFibonacci(int number){
        if(number == 1 || number == 2){
            return 1;
        }
        return recFibonacci(number-1) + recFibonacci(number-2);
    }
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int userInput;
        userInput = scanner.nextInt();
        System.out.println(recFibonacci(userInput));
    }
}

