class A{
    public void show(){
        System.out.println("This is A");
    }
}
class B extends A{
    @Override
    public void show(){
        System.out.println("This is B");
    }

    public void display(){
        System.out.println("Display in B");
    }
}

public class Main {
    // Compile time polymorphism
    public static void main(String[] args) {
        // Runtime polymorphism
        A b = new B();
        b.show();// Dynamic method dispatch
        // b.display();
    }
}