public class Main {
    public static void main(String[] args) {
        int i = 5;// Primitive data-type
        Integer ii = new Integer(50); // Wrapper class and reference type
        Integer i1 = new Integer(i); // Boxing or Wrapping
        int j = ii.intValue(); // Unboxing or Unwrapping
        Integer i2 = i; // Autoboxing
        int k = i2; // Auto unboxing

        // Parsing integer from string
        String num = "124";
        int n = Integer.parseInt(num);
        System.out.println(n);

    }
}