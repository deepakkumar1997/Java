public class Patterns {
    public static void main(String[] args) {
       int n = 6;
       for(int i=0; i<n; ++i){
            for(int j=0; j<=i; ++j){
                System.out.print(j+1+" ");
            }
            System.out.println();
       }
        System.out.println();
       // Char Pattern
        char target = 'E';
        for(char i='A'; i<=target; ++i){
            for(char j='A'; j<=i; ++j){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        // Box pattern
        System.out.println();
        int tar = 4;
        for(int i=0; i<tar; ++i){
            for(int j=0; j<tar; ++j){
                if(i==0 || i==tar-1)
                    System.out.print("* ");
                else if(j==0 || j==tar-1)
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

}