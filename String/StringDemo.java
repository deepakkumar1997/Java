class StringDemo {
    
    public static void main(String[] args) {
        String s1 = "Deepak";

        String s2 = new String("Pandey");

        char c[] = {'a','e','i','o','u'};

        String s3 = new String(c);

        byte b[] = {65,66,67,68};
        
        String s4 = new String(b);

        System.out.println(s1+" "+s2+"\n"+s3+"\n"+s4);
    }
}