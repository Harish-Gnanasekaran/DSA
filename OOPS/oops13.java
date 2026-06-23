package OOPS;

class Heart {
    void beat() {
        System.out.println("Heart is beating");
    }
}

class HumanHeart {
    private Heart heart;

    HumanHeart() {
        heart = new Heart();
    }

    void live() {
        heart.beat();
        System.out.println("Human is alive");
    }
}

public class oops13 {
    public static void main(String[] args) {
        HumanHeart h1 = new HumanHeart();
        h1.live();
    }
}