class Bank{
    public void person(String accountNo){
        System.out.println("Hello Sir! Your account no "+accountNo);
    }// Here in a bank a person is a  customer;
}
class Home extends Bank{
    public void person(int age, String name){
        System.out.println("Hello "+name+"! Your age is "+age);
    }// Here same person can be someone's son;
    public void person(String name, String daughterName){
        System.out.println("Hi, I'm "+daughterName+"! and He("+name+") is my father!");
    }// Here same persion is someone's father and it is polymorphism and method overloading
}
public class MethodOverloading{
    public static void main(String []args){
        Home h1 = new Home();
        h1.person("1234567890");
        h1.person(25, "Deepak");
        h1.person("Deepak", "Anne");
    }
}