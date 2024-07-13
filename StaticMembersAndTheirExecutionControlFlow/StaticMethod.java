package StaticMembersAndTheirExecutionControlFlow;

public class StaticMethod {

    static void method(){
        System.out.println("Inside Static method");
    }
    public static void main(String[] args) {
        System.out.println("Inside main()");
        StaticMethod.method();
    }
    
}
