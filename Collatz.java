public class Collatz{
	static int collatzCounter = 0;
    public static int collatz(int n){
        if(n == 1){
            collatzCounter++;
            return 1;
        } else if (n % 2 == 1) {
            collatzCounter++;
            return collatz(3*n + 1);
        }
        else{
            collatzCounter++;
            return collatz(n/2);
        }
    }
    public static void main(String[] args) {
        System.out.println(collatz(3));
        System.out.println(collatzCounter);
    }
}