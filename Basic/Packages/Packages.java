// Suppose we have a file called Packages.java, and we want to put this file in a package BasicPrograms;
package BasicPrograms;
import java.util.Scanner;

public class Packages{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Hi, "+name+"! Welcome to the Java Packages!");
    }
}