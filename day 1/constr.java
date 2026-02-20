

public class constr {
    String name;//instamce variable 
    constr(String name)
    {
        this.name=name;
    }
    void player(){
        System.out.println();

    }
    public static void main(String args[]){
        constr ob=new constr("iron man");
        ob.player();
    }
    
}
