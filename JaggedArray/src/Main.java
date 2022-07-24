public class Main {
    public static void main(String[] args) {
        // When a multi-dimensional has their inner array length is different then that
        // type of array is called jagged array; like
        int[][] jaggedArr = {
                {1,2,3,4},
                {5,6},
                {7,8,9,10},
                {11},
                {12,13,14}
        };
        // Iterating over jagged array using for each loop
        for(int[] arr1D : jaggedArr){
            for(int element : arr1D){
                System.out.print(element+" ");
            }
            System.out.println();
        }
        // Iterating over jagged array using for loop
        for(int i=0; i<jaggedArr.length; ++i){
            for(int j=0; j<jaggedArr[i].length; ++j){
                System.out.print(jaggedArr[i][j]+" ");
            }
            System.out.println();
        }
    }
}