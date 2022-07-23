class DemoStatic{
    // Data members
    int empId;
    String name;
    static String reportsTo;
    // constructor
    DemoStatic(int empId, String name){// When you create an object constructor will be called
        this.empId = empId;
        this.name = name;
        System.out.println("Inside Constructor");
    }
    // static block
    static {// static block called once when program loads but everytime we create an object a constructor called
        reportsTo = "Dolfred D'souza";
        System.out.println("Inside static block");
    }
    // Member methods
    void showDetails(){
        System.out.println("EmpID: "+empId+", Name: "+name+", Reports to: "+reportsTo);
    }
}

public class StaticDemo {
    public static void main(String[] args){
        DemoStatic dk = new DemoStatic(2117104,"Deepak Pandey");
//        dk.empId = 2117104;
//        dk.name = "Deepak Kumar";
//        DemoStatic.reportsTo = "Ranjan Bhatnagar";

        DemoStatic kani = new DemoStatic(2117107, "Kani Kapoor");
//        kani.empId = 2117107;
//        kani.name = "Kani Kapoor";
//        DemoStatic.reportsTo = "Dolfred D'souza";

        dk.showDetails();
        kani.showDetails();
    }
}
