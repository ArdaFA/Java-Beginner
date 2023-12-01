import algorithmen.Algorithmen;

public class main{
    
    public static void main(String[] args){
        
        // array which is sorted and has the value that we are searching for
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29};
        int value = 3;
        System.out.println("for the first array: ");
        algorithmen.Algorithmen.binarySearch(arr1, value);

        System.out.println(" ");

        // array which is sorted and has not the value that we are searching for
        int[] arr2 = {1,2,4,5,6,7,8,9,10};
        System.out.println("for the second array: ");
        algorithmen.Algorithmen.binarySearch(arr2, value);

        System.out.println(" ");
        
        // unsorted array
        int[] arr3 = {1,4,3,2,6,5,7,10};
        System.out.println("for the third array: ");
        algorithmen.Algorithmen.binarySearch(arr3, value);
    }
}