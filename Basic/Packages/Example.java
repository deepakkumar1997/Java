package Example;
import Student.Student;

public class Example{
    public static void main(String []args){
        Student s1 = new Student();
        s1.setRoll(9);
        s1.setName("Deepak Pandey");
        System.out.println("Welcome! "+s1.getName()+", Your roll number is "+s1.getRoll());
    }
}