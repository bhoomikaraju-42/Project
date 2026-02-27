package day3;
 class ocar {
    void model(){
        System.out.println("racecar");
    }
    
}
class f extends ocar{
    void model(){
        System.out.println("formul acreer");
    }

}
public class overiding{
    public static void main(String[] args) {
        ocar f =new f(); // notes change calling name of parent and method from child classss
        f.model();
    }
}
