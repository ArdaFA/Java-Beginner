import java.util.Scanner;

public class Expo {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        // get user input
        int base;
        System.out.print("Base: ");
        base = scanner.nextInt();

        int exponent;
        System.out.print("Exponent: ");
        exponent = scanner.nextInt();

        int result = 1;

        for (int i = 1; i <= exponent; i++ ){
            result *= base;
        }
        System.out.println(result);
        
    }
}