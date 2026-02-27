package day4;
import java.util.Scanner;
class string {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String input=sc.nextLine();
        //length()
        System.out.println("Length" +input.length());
        //2.touppercase
        System.out.println("Uppercase" +input.toLowerCase());
        //3.uppercase
        System.out.println("lowercase" +input.toUpperCase());
        //4.chatAt(index)
        System.out.println(input.charAt(2));
        //5.substring
        System.out.println(input.substring(0,4));
        String str="virat kohli";
        System.out.println("conact" +input.concat(str));
        System.out.println(input+str);
        //equals
        System.out.println(input.equals("Anushka sharma"));
        //equalsIgnoreCase()
        System.out.println(input.equalsIgnoreCase(str));
        //
        sc.close();
            }
    
}
