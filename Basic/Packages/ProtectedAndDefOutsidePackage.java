package example;
import modifiers.AccessModifier;
public class ProtectedAndDefOutsidePackage{
    public static void main(String []args){
        AccessModifier a = new AccessModifier();
        a.salary = 90000;
        a.phoneNo = "9876509787";
        System.out.println("Name is Nikhil Nair, salary "+a.salary+" Phone No "+a.phoneNo);
        // It will say that salary is protected and can't be accessed outside the package and same for default members
    }
}