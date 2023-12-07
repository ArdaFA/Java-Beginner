import java.util.Scanner;

public class Armstrong {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        // get user input
        int userInput;
        System.out.print("Number: ");
        userInput = scanner.nextInt();

        // find number of digits
        int digit = 1;
        int numTemp = userInput;
        while (numTemp >= 10){
            digit++;
            numTemp /= 10;
        }
        // reassign the value to use it again
        System.out.println("Number of digits: "+digit);

        // find last digit
        numTemp = userInput;
        int lastDigit = 0;
        int resPow = 1; // save the power of digit
        int result = 0; // add all

        // reach last digit and divide
        while(numTemp > 0){
            lastDigit = numTemp%10;

            // find the exponent of digit
            for (int i = 1; i <= digit; i++){
                resPow *= lastDigit;
            }
            
            // add exponent to result
            result += resPow;
            resPow = 1;
            numTemp /= 10;
        }

        System.out.println("the result is: " + result);
        // compare result with user input
        if (result == userInput){
            System.out.println("Yes! this is an Armstrong number!");
        } else
            System.out.println("No! this is not an Armstrong number :(");
    }
}