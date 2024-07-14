package String;

public class StringPooling {

    public static void main(String[] args) {
        User user1 = new User(1, "Deepak");
        User user2 = new User(1, "Deepak");

        System.out.println(user1);
        System.out.println(user2);

        String i1 = "13";
        String i2 = "334";
        String i3 = "13";
        
        System.out.println(i1.hashCode());
        System.out.println(i3.hashCode());
        System.out.println(i2.hashCode());
    }
}
