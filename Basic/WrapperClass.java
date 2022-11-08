package Basic;

public class WrapperClass {
    public static void main(String[] args){
        Integer num = 10;
        Integer num11 = Integer.valueOf("122");
        System.out.println("Sum is "+(num+num11));
        // parseType()
        double pi = Double.parseDouble("3.141");
        System.out.println("PI = "+pi);
        //TypeValue()
        Integer num1 = Integer.valueOf("10111",2);
        int num2 = num1.intValue();
        System.out.println("Number = "+num2+" Reference Var = "+num1);
    }
}
