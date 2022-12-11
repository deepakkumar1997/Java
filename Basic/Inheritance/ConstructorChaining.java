class A{
    public A(){
        System.out.println("A");
    }
}
class B extends A{
    public B(){
        this("Deepak");
        System.out.println("Class B: Default Constructor");
    }
    public B(String name){
        // By default super() method will be called here which will call parents default constructor;
        System.out.println("Class B: Parametrized constructor: "+name);
    }
}
class ConstructorChaining{
    public static void main(String []args){
        B obj = new B();
    }
}