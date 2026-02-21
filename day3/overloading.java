package day3;

public class overloading {
    
    int add(int a,int b){
        System.out.println("add a integer");
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        
        overloading ob=new overloading();
        ob.add(2,3);
        ob.add(2,3,4);
    }
}
