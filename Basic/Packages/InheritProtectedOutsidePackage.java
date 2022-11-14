package example;
import modifiers.AccessModifier;

public class InheritProtectedOutsidePackage extends AccessModifier{
    public static void main(String []args){
        InheritProtectedOutsidePackage a = new InheritProtectedOutsidePackage();
        a.salary = 90000;
        a.setAge(26);
        System.out.println("Name Nikhil and salary "+a.salary+" and age is "+a.getAge());
        // We have to make object of subclass in order to use protected members of super class 
        // If you make object of super class and try to access protected members from another package then it is not possible it is an error;
    }
}