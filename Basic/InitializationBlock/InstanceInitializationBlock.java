public class InstanceInitializationBlock{
    private int num;
    {
        System.out.println("Instance Initialization Block: Num = "+num);
        num = 10;
    }// This is instance initialization block and it will execute right before constructor when an instance is created;
    public InstanceInitializationBlock(){
        System.out.println("Constructor: Num = "+this.num);
    }
    public static void main(String []args){
        InstanceInitializationBlock i1 = new InstanceInitializationBlock();
        InstanceInitializationBlock i2 = new InstanceInitializationBlock();
    }
}