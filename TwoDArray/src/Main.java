import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        // Declaration and initialization of 1D array
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {4,3,2,1};
        int[] arr3 = {5,6,7,8};
        // Declaration and initialization of 2D array
        int[][] arr2D = {
                {1,2,3,4},
                {4,3,2,1},
                {5,6,7,8}
        };
        // We can also do like this
        int[][] arr2D1 = {arr1, arr2, arr3}; // This and above arr2D are same

        // Printing elements of array by for each loop
        for(int arr1D[] : arr2D){
            for(int element : arr1D){
                System.out.print(element+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int arr1D[] : arr2D1){
            for(int element : arr1D){
                System.out.print(element+" ");
            }
            System.out.println();
        }

        // Array declaration
        int row, col;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of row: ");
        row = sc.nextInt();
        System.out.print("Enter number of column: ");
        col = sc.nextInt();
        // Dynamic array2D declaration
        int[][] arr2D2 = new int[row][col];
        for(int i=0; i<row; ++i){
            for(int j=0; j<col; ++j)
                arr2D2[i][j] = i+j;
        }
        // Accessing array elements
        for(int[] arr1D : arr2D2){
            for(int element : arr1D){
                System.out.print(element+"  ");
            }
            System.out.println();
        }
    }
}