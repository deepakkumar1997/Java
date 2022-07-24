class Parent{
    Parent(){
        System.out.println("Its parent");
    }
    Parent(int num){
        System.out.println("Parents "+num);
    }
}
class Child extends Parent{
    Child(){
        super();
        System.out.println("This is child");
    }
    Child(int num){
        super(num);
        System.out.println("Childs "+num);
    }
}

public class Main {
    public static void main(String[] args) {

        //Parent p = new Parent();
        Child c = new Child(6);
    }
}