package day3;
class superman {
    void Fight() {
        System.out.println("superman");
    }
}

class batman extends superman {
    void identity() {
        System.out.println("child1 class");
    }
}

class superhero extends superman {
    void play() {
        System.out.println("child2 class");
    }
}

public class hierarcial {
    public static void main(String[] args) {

        superhero ob = new superhero();
        ob.play();      // child method
        ob.Fight();     // parent method

    }
}
    

