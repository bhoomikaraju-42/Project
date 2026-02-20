package day2;

public class zzreverse {
    public static void main(String[] args) {
         int n=19;
        for( int i=19;i>0;i--){
        
            for( int j=1;j<=n;j++){
                if((i==1 &&j%4==3)||(i==2 && j%2==0)||(i==3 && j%4==1))
                {
                    System.out.print("* ");
            }else{
                 System.out.print( " ");
            }
            }
             System.out.println();
        }
       
    }
}

    

