// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class fibo {
    public static void main(String[] args) {
        int  a=0;
        int b=1;
        for( int i=1;i<=10;i++){
            
            System.out.println(a+ " ");
            int  c=a+b;
            a=b;
            b=c;
        }
       
    }
}

