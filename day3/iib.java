package day3;

public class iib {
    int runs;
    String name;
    { //IIB
        runs=400;
        name="Abhishek sharma";
        System.out.println("IIB exectured");
    }
    static {
        System.out.println("static blocked ");
    }
    iib(){ // default constructed  
        System.out.println("inside cosntructor");
    } 
    void display(){
        System.out.println("display");
    }
    public static void main(String[] args) {
        iib ob=new iib();
               ob.display();
    }
    
}
