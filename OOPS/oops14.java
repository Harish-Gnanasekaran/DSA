package OOPS;

class Brain {
    void think() {
        System.out.println("Brain is thinking");
    }
}

class HumanBrain {
    private Brain brain;

    HumanBrain() {
        brain = new Brain();
    }

    void live() {
        brain.think();
        System.out.println("Human is living");
    }
}

public class oops14 {
    public static void main(String[] args) {
        HumanBrain h1 = new HumanBrain();
        h1.live();
    }
}