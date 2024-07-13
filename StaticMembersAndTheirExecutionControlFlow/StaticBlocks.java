public class StaticBlocks {

    public static void main(String[] args) {
        System.out.println("Inside main method");
    }
    // Static blocks execute just before the main method
    static {
        System.out.println("Inside static block->One");
    }
    // Static blocks execute in the order
    static {
        System.out.println("Inside static block->Two");
    }
    
}
