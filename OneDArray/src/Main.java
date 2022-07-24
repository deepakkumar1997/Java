import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Creating array of integers in heap memory using new keyword
        int arr[] = new int[5];
        for(int i=0; i<arr.length; ++i)
            arr[i] = i+1;
        for(int i=0; i<arr.length; ++i)
            System.out.print(arr[i]+" ");

        int arr1[] = {1,2,3};

        // Taking length as input and then creating array
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr2 = new int[length];
        for(int i=0; i<length; ++i){
            System.out.print("Enter element "+(i+1)+": ");
            arr2[i] = sc.nextInt();
        }
        // Enhanced for loop or for each loop
        for(int e : arr2)
            System.out.print(e+" ");
    }
}