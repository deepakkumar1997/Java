
class A{
    int a;
    public A(String name){
        System.out.println("A "+name);
    }
}
class B extends A{
    int b;
    public B(){
        // We must use super() to call parent constructor as in parent there is no default constructor otherwise it will give error
        super("Deepak");
        System.out.println("B");
    }
}
public class ConsInInherit{
    public static void main(String []args){
        B obj = new B();
    }
}