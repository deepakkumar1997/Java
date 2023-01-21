class MyData1<T>{
    
    T t;

    public void setData(T t){
        this.t = t;
    }

    public T getData(){
        return t;
    }
}
public class MyData{
    public static void main(String[] args){
        
        MyData1<Integer> num = new MyData1<Integer>();
        num.setData(1997);
        System.out.println("Your DOB is "+num.getData());

        MyData1<String> name = new MyData1<String>();
        name.setData("Deepak Pandey");
        System.out.println("Your name is "+name.getData());
    }
}