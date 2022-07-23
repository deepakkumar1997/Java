class ExampleClass{
    // Data Members
    int num1;
    int num2;
    int result;
    // Member functions or methods
    void Sum(){
        result = num1+num2;
    }
    void Sub(){
        result = num1-num2;
    }
}
public class ClassAndObjectExample {
    public static void main(String[] args){
        ExampleClass obj = new ExampleClass();
        obj.num1 = 340;
        obj.num2 = 45;
        obj.Sum();
        System.out.println(obj.result);
        obj.Sub();
        System.out.println(obj.result);
    }
}