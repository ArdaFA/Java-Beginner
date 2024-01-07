import java.util.HashSet;
import java.util.Scanner;

public class HappyNumber {

    public static boolean isHappy(int number) {
        HashSet<Integer> seen = new HashSet<>();

        int counter = 0;
        while (number != 1 && !seen.contains(number)) {

            seen.add(number);
            int sum = 0;

            while (number > 0) {
                counter++;
                int digit = number % 10;
                sum += digit * digit;
                number /= 10;
            }

            number = sum;
        }
        System.out.println("it took " + counter + " loops to indicate");
        return number == 1;
    }

    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        boolean shouldStop = false;
        while (!shouldStop){
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            boolean isHappyNumber = isHappy(number);
            if(number == 0){
                shouldStop = true;
            }
            else{
                if (isHappyNumber) {
                    System.out.println(number + " is a Happy Number.");
                } else {
                    System.out.println(number + " is not a Happy Number.");
                }
            }

        }
    }
}
