public class InitializationBlock{
    private int age;
    {
        System.out.println("IIB: Age = "+age);
        age = 25;
    }
    public InitializationBlock(){
        System.out.println("Constructor: Age = "+age);
    }
    private static String name;
    static{
        System.out.println("SIB: Name = "+name);
        name = "Deepak Pandey";
    }
    static{
        System.out.println("SIB2 Name = "+name);
    }
    public static void main(String []args){
        InitializationBlock ib = new InitializationBlock();
        InitializationBlock.name = "Deepak Kumar";
        System.out.println("Main: Name = "+InitializationBlock.name);
    }
    /**  Takeaways from this code is that
    > Before anythng(main class as well) a static initialization block runs in order to line numbers if it is
      written before main() then it will run before main() and from those who ever is wriiten first will run 
      first;
    > So, if you want to execute something at start-up and only once then wite it in SIB;
    */
}