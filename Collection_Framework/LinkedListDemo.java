package Collection_Framework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        Object objects[] = new Object[1000000];

        for(int i=0; i < objects.length; ++i){
            objects[i] = new Object();
        }

        List<Object> list = new LinkedList<>();
        long startTime = System.currentTimeMillis();
        for(Object object : objects){
            list.add(object);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: "+(endTime-startTime)+" milliseconds");


        List<String> linkedList = new LinkedList<>();

        linkedList.add("Deepak");
        linkedList.add("Ghanshyam");
        linkedList.add("Nikhil");
        linkedList.add("Satyam");
        linkedList.add("Aman");
        linkedList.add("Sachin");
        linkedList.add("Hariom");

        System.out.println(linkedList);
        System.out.println(linkedList.size());
        System.out.println(linkedList.contains("Hariom"));
        System.out.println(linkedList.remove("Hariom"));
        System.out.println(linkedList);
        System.out.println(linkedList.isEmpty());
        System.out.println(linkedList.indexOf("Aman"));
        System.out.println(linkedList.set(4, "Bito"));
        System.out.println(linkedList);
    }    
}
