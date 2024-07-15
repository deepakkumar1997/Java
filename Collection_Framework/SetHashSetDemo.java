package Collection_Framework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class SetHashSetDemo {

    public static void main(String[] args) {
        Random random = new Random();

        List<Integer> numList = new ArrayList<>();

        for(int i = 0; i < 10; ++i){
            int num = random.nextInt(5);
            numList.add(num);
        }
        System.out.println();
        System.out.println(numList);

        Set<Integer> set = new HashSet<>(numList); // It will remove duplicate numbers from the list and now it's set
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.contains(0));
        System.out.println(set.isEmpty());
        System.out.println(set.add(6));
        System.out.println(set);
        System.out.println(set.remove(random.nextInt(6)));
        System.out.println(set);
        System.out.println(set.remove(random.nextInt(3)));
        System.out.println(set);
    }
}