// Taking input from user and then add them and print the sum;
import java.util.Scanner;

public class ArrayUserInput{
    public static void main(String[] args){
        System.out.print("Enter size of array: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; ++i){
            System.out.print("Enter value of element "+(i+1)+" : ");
            arr[i] = scan.nextInt();
        }

        System.out.print("\nArray elements are : ");
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}