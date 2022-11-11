class FormatSpecifier{
    public static void main(String args[]){
        String name = "Ramesh Yadav";
        int num = 10;
        System.out.printf("%-15s%03d\n",name,num);
        System.out.printf("%-15s%03d\n","Deepak Kumar",num);
        System.out.printf("%-15s%03d\n","Pandey",1);
        System.out.printf("%-15s%03d\n","Jai Bholenath",999);
        // %d, %s these are called format specifiers and spacing between them is 
        // known as POSIX;
    }
}