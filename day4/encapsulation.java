package day4;
 class SuperHero {
    private String name;
    private String power;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setPower(String power){
        this.power = power;
    }
    public String getPower(){
        return power;
    }
    void display(){
        System.out.println("Hero: "+name);
        System.out.println("Power: "+power);
    }
}
class Driver{
    public static void main(String[] args) {
        SuperHero hero = new SuperHero();
        hero.setName("Superman");
        hero.setPower("heat vision");
        hero.display();
    }
}

