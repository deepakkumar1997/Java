import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args){
        HashMap hm = new HashMap();
        hm.put(1,"Deepak");
        hm.put(-12,"Rishav");
        hm.put(-1,"Deepak");
        hm.put(null, null);

        System.out.println(hm);
        System.out.println(hm.get(1));
    }
}