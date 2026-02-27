package day5;
import java.util.Scanner;
class stringb {
    public static void  main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        StringBuilder b=new StringBuilder(input);

        //append()
        b.append("alien");
        System.out.println(b);
        b.insert(3,"XLRB");
        System.out.println(b);

        //delete
        b.delete(0,5);
        System.out.println(b);
        //replace()
        b.replace(3, 5,"NANI");
        System.out.println(b);
        //reverse
        b.reverse();
        System.out.println(b);
        sc.close();
    } 
    
}
