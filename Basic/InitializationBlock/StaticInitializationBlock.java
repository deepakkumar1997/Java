public class StaticInitializationBlock{
    private static double PI;
    static{
        System.out.println("Static Initialization Block: PI = "+PI);
        PI = (double)22/7;
    }
    static{
        System.out.println("Pi = "+PI);
    }
    public static void main(String []args){
        // new StaticInitializationBlock();
        StaticInitializationBlock.PI = 3.141;// It will take no effect on value of static var PI which is above;
        // First run and then comment above line then run and see the difference;
        System.out.println("PI = "+StaticInitializationBlock.PI);
    }
    /* So one takeaway from this code is that static initialization blocks execute without creating any object
       and without calling a static member using class name;
       So, a static initialization block runs when program executes or runs;
    */
}