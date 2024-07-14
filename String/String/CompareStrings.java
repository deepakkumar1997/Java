package String;

public class CompareStrings {

    public static void main(String[] args) {
        String str1 = "Deepak";
        String str2 = "Deepak";
        String str3 = "Pandey";
        String str4 = new String("Deepak");

        System.out.println(str1 == str2); // will compare the reference of strings thus true
        System.out.println(str1.equals(str2)); // will compare the value of srings thus true bcz values are same
        System.out.println(str1 == str3); // will compare the reference of strings thus false bcz refernces are different
        System.out.println(str1.equals(str3)); // will compare the value of strings thus false bcz values are not same

        System.out.println(str4 == str1); // will compare the reference of strings thus false bcz 'new' creates a new memory location(str4)
        System.out.println(str1.equals(str4)); // will compare the values thus true as values are same

        User user1 = new User(1, "Deepak");
        User user2 = new User(1, "Deepak");

        System.out.println(user1 == user2); // false bcz reference is differrent as new keyword is used
        System.out.println(user1.equals(user2));
        // it will return false as here equals method is inherited from Object class and that equals() method do the same
        // comparison as '==' but in case of String equals() method is overridden in String class and made to compare the
        // value so if we want to compare values of an object then we have to create a custom method to do that.
    }
    
}