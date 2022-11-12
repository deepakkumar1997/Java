public class CommandLineArguments {
    public static void main(String []args){
        // Print all command line arguments
        for(String string : args)
            System.out.println(string);
        // Sum of array elements
        int numbers[] = {10,20,30,40,50};
        int sum=0;
        for(int i=0; i<numbers.length; ++i){
            sum = sum + numbers[i];
        }
        System.out.println("Sum of array elements are "+sum);
    }
}
