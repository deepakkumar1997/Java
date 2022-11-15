public class Inheritance{
    public static void main(String []args){
        Student s1 = new Student();
        s1.setName("Deepak Pandey");
        s1.setAge(25);
        s1.setRoll(9);
        System.out.println("Welcome! "+s1.getName()+", Your age is "+s1.getAge()+" and Your Roll No is "+s1.getRoll());
    }
}