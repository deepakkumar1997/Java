public class GenericMethodExample{
    public <D> void printArray(D[] arr){
        
        for(D e : arr){
            System.out.println(e);
        }
    }

    public static void main(String[] args){
        
        GenericMethodExample g = new GenericMethodExample();
        String[] countries = new String[]{"India", "America", "England"};
        Integer numbers[] = {8, 12, 30, 200};
        
        g.printArray(countries);
        g.printArray(numbers);
    }
}