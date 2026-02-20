public class Hammingw {
    public static void main(String args[]){
        int c=0;
        int n=19;
        while(n>0){
            if((n&1)==1){
                c++;
            }
            n=n>>1;
        }
    
    System.out.println(+c);
    }
}
