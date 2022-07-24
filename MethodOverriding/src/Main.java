class Car{
    public void gear(){
        System.out.println("Car has 4 gear");
    }
}
class SportsCar extends Car{
    // For unintentional mistake in while naming a method while overriding we use
    // @Override convention to avoid logical mistakes
    @Override
    public void gear(){
        super.gear();
        System.out.println("Sports car has 6 gear");
    }
}

public class Main {
    public static void main(String[] args) {
        SportsCar sc = new SportsCar();
        sc.gear();
    }
}