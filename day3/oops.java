package day3;

class IIB{
    int runs;
    String Name;
    {
        System.out.println("first");
        Name="vk";
        runs=234;
    }
    IIB(){
        runs=264;
        Name="Virat Kohli";
    }
    void display(){
        System.out.println(Name+" "+runs);
    }
   public static void main(String[] args){

    IIB ob=new IIB();
    ob.display();
   } 
}
