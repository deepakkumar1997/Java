import java.util.*;

public class ArrayListExample{
    public static void main(String[] args){

        ArrayList l1 = new ArrayList(5);
        l1.add("Deepak");
        l1.add("Dk");
        l1.add("Pandey");
        l1.add(1,"Kumar");
        Iterator it = l1.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}