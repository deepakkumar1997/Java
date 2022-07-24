class VariableLengthArgument{
    public int sum(int ... arr){
        int sum=0;
        for(int e : arr){
            sum+=e;
        }
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        VariableLengthArgument var = new VariableLengthArgument();
        System.out.println("Sum: "+var.sum(1,2,3,4,5,6,7,8,9,10));
    }
}