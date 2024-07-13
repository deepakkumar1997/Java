package String;

public class StringsWrapperVsOtherObjects {
    
    int id;
    String name;

    StringsWrapperVsOtherObjects(int id, String name){
        this.id = id;
        this.name = name;
    }
}

class Test {
    public static void main(String[] args) {
        StringsWrapperVsOtherObjects str = new StringsWrapperVsOtherObjects(1, "Course");
        System.out.println(str);

        String str1 = new String("Hello World!");

        Integer intNum = 1000;

        System.out.println(str1+", "+intNum);
    }
}
