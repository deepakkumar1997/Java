package Collection_Framework;

import java.util.Random;

public class RandomNumGenerator {

    public static void main(String[] args) {
        Random random = new Random();

        int x = random.nextInt();
        System.out.println("\n"+x);

        int y = random.nextInt(200);
        System.out.println(y);

        boolean areYouGay = random.nextBoolean();
        System.out.println("Is Rishav Gay: "+areYouGay);
    }
    
}
