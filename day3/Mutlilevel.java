package day3;

 class ml {
    void play(){
        System.out.println("Grand aprent class");
    }
}
    class sp extends ml{
        void pp(){
            System.out.println("parent class");
        }
        
    }
    class d extends sp{
        void childd(){
            System.out.println("child display");
        }
    }
     public class Mutlilevel{
        public static void main(String[] args) {
             d ob=new d();
            ob.play();
        ob.pp();
        ob.childd();

        }

     }
    

