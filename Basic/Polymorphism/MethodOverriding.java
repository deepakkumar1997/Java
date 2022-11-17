class Rectangle{
    private int length;
    private int width;
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    public int area(){
        return length*width;
    }
}
class Square extends Rectangle{
    private int side;
    public Square(int side){
        super(side, side);
        this.side = side;
    }
    // Method overriding with @override annotation which shows error if it is not overriding parents method
    @Override
    public int area(){
        return side*side;
    }   
}
public class MethodOverriding{
    public static void main(String []args){
        Square s1 = new Square(7);
        System.out.println("Area of a square = "+s1.area());
        Rectangle r1 = new Rectangle(8,7);
        System.out.println("Area of a rectangle = "+r1.area());
    }
}