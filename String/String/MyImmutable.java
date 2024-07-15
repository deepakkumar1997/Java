package String;

public class MyImmutable {

    int empId;
    String name;

    MyImmutable(int empId, String name){
        this.empId = empId;
        this.name = name;
    }

    public MyImmutable changeValue(int empId, String name) {
        if(this.empId == empId && this.name.equals(name)){
            return this;
        } else {
            return new MyImmutable(empId, name);
        }
    }
    
    public static void main(String[] args) {
        MyImmutable m1 = new MyImmutable(1, "Deepak");
        MyImmutable m2 = m1.changeValue(1, "Deepak");

        System.out.println(m1 == m2); // true as values are same and this object is immutable (explicitly created)
        System.out.println(m1.equals(m2)); // behind the scene equals() method of Object class use ==

        MyImmutable m3 = m1.changeValue(2, "Deepak");
        System.out.println(m3 == m1);
        System.out.println(m3.equals(m1));
    }
}
