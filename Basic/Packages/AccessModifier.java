package modifiers;

public class AccessModifier{
    private int age;
    protected double salary;
    String phoneNo;

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public static void main(String []args){
        AccessModifier a1 = new AccessModifier();
        //a1.age = 25; Not accessible as age is private in above class
        a1.salary = 62687.5;
        a1.phoneNo = "8925335253";
        a1.setAge(25);
        System.out.println("Age is "+a1.getAge()+" Phone No "+a1.phoneNo+" salary is "+a1.salary);
    }
}