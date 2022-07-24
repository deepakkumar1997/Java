// Inheritance
class Calculator{// Super, Parent, Base
    int add(int num1, int num2){
        return num1+num2;
    }
}
class CalcAdv extends Calculator{ // Sub, Child, Derived
    int sub(int num1, int num2){
        return num1-num2;
    }
}// Single level inheritance
class CalcVeryAdv extends CalcAdv{
    int mult(int num1, int num2){
        return num1*num2;
    }
}// Multi level inheritance
public class Main {
    public static void main(String[] args) {
         CalcVeryAdv c = new CalcVeryAdv();
         System.out.println(c.add(2,3));
         System.out.println(c.sub(34,23));
         System.out.println(c.mult(5,23));
    }
}