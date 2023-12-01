package algorithmen;

// java.util.concurrent.TimeUnit;

public class Algorithmen{  
    /* 
     * Überprüft, ob ein Array aufsteigend sortiert ist.
     */
    public static boolean isSorted(int[] arr){
        boolean result = false;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] < arr[i+1]){
                continue;
            }
            else {
                return result;
            }
        }
        return true;
    }
    
    
    // bubble sort
    public static void sort(int[] arr){
        int len = arr.length;
        for(int i = 0; i < len-1; i++) {
            
            for( int j = 0; j < len-1-i; j++) {
                
                if(arr[j] > arr[j+1]) { // check which is greater
                    
                    int temp = arr[j]; // create a temp variable
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    
    }
    
    public static boolean binarySearch(int[] arr, int val){
        if (isSorted(arr)){
            int a = 0;
            int len = arr.length-1;
            int counter = 0;
            while (a != len) {
                int mid = ( a + len ) / 2;
                if (val <= arr[mid]) {
                    len = mid;
                }
                else {
                    a = mid + 1;
                }
                counter++;
            }
            if (val == arr[a]){
                System.out.println("Binary Search! ");
                System.out.println(val + " has found in " + counter + " iteration!");
                return true;
            }
            else {
                System.out.println(val + " could not found!");
                return false;
            }

        }
        else {
            System.out.println("Array is not sorted!");
            System.out.println("okay I do it for you...");
            sort(arr);
            binarySearch(arr, val);
            return false;
        }
    }
}