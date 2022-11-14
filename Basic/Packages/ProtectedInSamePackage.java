package modifiers;
public class ProtectedInSamePackage{
    public static void main(String []args){
        AccessModifier a = new AccessModifier();
        a.salary = 65000;
        a.phoneNo = "9080706050";
        // So when you're in same package then you don't need to import that package
        // in order to use class inside that package
        System.out.println("Salary is "+a.salary+a.phoneNo);
    }
}