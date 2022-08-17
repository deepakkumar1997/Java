// Encapsulation:- Binding data with methods.
class Student{
    private int roll;
    private String name;

    // Getters and setters for binding data a methods
    public int getRoll(){
        System.out.println("User accessed roll number.");// Logs
        return this.roll;
    }
    public void setRoll(int roll){
        System.out.println("User changed roll number.");// Maintaining logs
        this.roll = roll;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setRoll(9);
        s1.setName("Deepak Pandey");
        System.out.println("Roll No: "+s1.getRoll());
        System.out.println("Name: "+s1.getName());
    }
}