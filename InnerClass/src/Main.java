class Outer{
    // Data members
    int data;
    // Member methods
    public void Method(){

    }
    // Member class
    class Inner{
        // Data members
        int innerData;
        // Member method
        void innerMethod(){
            System.out.println("This is method of Inner class.");
        }
    }
}

public class Main {
    public static void main(String[] args){
        // Simple class object creation
        Outer o1 = new Outer();
        // Inner class object creation
        Outer.Inner i1 = o1.new Inner();
        i1.innerMethod();
    }
}
