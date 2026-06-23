package OOPS;

class Engine {

    String engineName;

    Engine(String engineName) {
        this.engineName = engineName;
    }
}

class CarWithEngine {

    String name;
    Engine engine;

    CarWithEngine(String name, Engine engine) {
        this.name = name;
        this.engine = engine;
    }

    void display() {
        System.out.println(name);
        System.out.println(engine.engineName);
    }
}

public class oops12 {
    public static void main(String[] args) {

        Engine e1 = new Engine("Audi Engine");

        CarWithEngine c1 = new CarWithEngine("BMW", e1);

        c1.display();
    }
}