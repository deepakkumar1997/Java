package String;

class User {

    int id;
    String name;

    User(int id, String name){
        this.id = id;
        this.name = name;
    }
}

public class ImmutableStringDemo {

    public static void main(String[] args) {
        User user1 = new User(1, "Deepak");
        System.out.println(user1);

        String str1 = "Deepak";
        System.out.println(str1.hashCode());

        str1 = "Pandey";
        System.out.println(str1.hashCode());

        String str2 = "Deepak";
        System.out.println(str2.hashCode()); // this will print same hascode as str1 = "Deepak"
    }    
}
