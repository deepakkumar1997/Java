package String;

public class ImmutableDemoThroughConcat {

    public static void main(String[] args) {
        
        String str1 = "Deepak";
        String str2 = "Pandey";
        System.out.println("Before concat():\nString1: "+str1+"\nString2: "+str2);
        
        str1 = str1.concat(str2); // Strings are immutable that's why concat() will not able to modify str1 string 
        // now this str1 will have new reference
        System.out.println("After concat():\nString1: "+str1+"\nString2: "+str2); // This will print same as above
        // because concat() method returns a new string after concating two string reson is string immutability

    }
    
}
