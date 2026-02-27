package day5;

class stringpool {
    public static void main(String args[]){
    //stores somewhere in string pool it stores
    String s1="ben10";
    String s2="ben10";
    String s3=new String("ben10");
    String s4=new String("ben10");
    System.out.println("s1==s2" +(s1==s2));
    System.out.println(s3==s4);
    System.out.println(s3.equals(s4));
    System.out.println(s1==s3);
    System.out.println(s1.equals(s3)); 
    //intern() method
    String s5=s3.intern();
    System.out.println(s1==s5);
    System.out.println(s1.equals(s5));
}  
}
