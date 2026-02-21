package day3;
class parent{
   void display(){
    System.out.println("Parent class");
   } 
}
class Child extends parent{
    void Dispaly(){
        System.out.println("child class");
    }
}
public class Single {
    public static void main(String[] args) {
        Child ob=new Child();
        ob.display();
        ob.Dispaly();
        parent p=new parent();
        p.display();
        
    } 
}
