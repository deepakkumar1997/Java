class Outer{
    // Data members
    static int data;
    // Member methods
    public static void Method(){

    }
    // Member class
    static class Inner{
        // Data members
        static int innerData;
        // Member method
        static void innerMethod(){
            System.out.println("This is method of Inner class.");
        }
    }
}

public class Main {
    public static void main(String[] args){
        // Simple class object creation
        Outer o1 = new Outer();
        // Inner class object creation
        Outer.Inner i1 = new Outer.Inner();
        i1.innerMethod();
        Outer.Inner.innerMethod();
    }
}
