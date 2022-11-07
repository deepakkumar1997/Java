package Basic;
/** Static Variable:
> Static variables are declared in the class using static keyword;
> Static variables are by default initialized to its default value which is 0;
> Static variables has a single copy for the whole class and does not depend on the
  objects;
*/
/** Static Function:
 * Static functions defined inside the class are qualified with the keyword static;
 * Static function can only access static members of the same class;
 * Static function can be invoked using class name and dot operator;
 */
/** Static Inner Class:
 * We can have a class inside a class which is known as inner class;
 * Inner class can be qualified with the keyword satic;
 */
public class StaticMember{
    int x; // instance member variable
    static int y; // static member variable

    // instance member function or method
    public void fun1(){
        
    }
    // static member function
    public static void fun2(){
        // static int x; // this is wrong we can't have a local static variable 
        // In java we don't have local static variable

        // x=4; it is wrong as a static member function can only access static members 
        // of the class
        // So why static function can't access instance members because a static 
        // member will be called without creating an instance and if static members
        // access instace members then no value will come in those members or 
        // garbage value will work;
        y=4; // it is correct
    }
    // but we can static inner class
    static class Test{
        static String name = "Deepak Pandey";
    }
    public static void main(String[] args){
        StaticMember e1 = new StaticMember(); // this means that a memory is created and for 
        // all instance member variables and address or reference will be assigned
        // to variable e1 that's why it is called reference variable;
        // So in this case memory for variable x is created not for var y as it is a
        // static member variable and reference will be assigned to e1;
        StaticMember e2 = new StaticMember(); // same for this object only one varible will be 
        // there which is x
        // And here StaticMember() is a constructor with no parameters

        // Assigning value to static member
        StaticMember.y = 10; // className.StaticMemberVarName;
        // How to call static member function
        StaticMember.fun2();
        y=20; // we can access this static variable directly as main function is part
        // of same class;
        // We can't have two public class in a java file;

        // Accessing variables of static inner class in java
        System.out.println(StaticMember.Test.name);
        // Here System is class and out is a static variable;
    }
}