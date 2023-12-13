import java.util.Scanner;

public class TwoDimensional {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputFirst, inputSecond;
        System.out.println("Numbers of Row and Column: ");
        inputFirst = scanner.nextInt();
        inputSecond = scanner.nextInt();

        int[][] twoDim = new int[inputFirst][inputSecond];
        int lengthRow = twoDim.length; // always row
        int lengthColm = twoDim[0].length;
        System.out.println("length row: " + lengthRow + " length column: " +lengthColm);

        int one = 10;
        for (int i = 0; i < lengthRow; i++){
            System.out.println();
            for (int j = 0 ; j < lengthColm; j++){
                twoDim[i][j] = one;
                one++;
                System.out.print(twoDim[i][j] + "     ");
            }
        }
    }
}