package lecture02;

public class Car {
    int fuel;
    Tire[] tires;
    Engine engine;

    Car(){
        fuel = 0;

    }

    void run(){
        if(fuel >= 1) {
            fuel = fuel - 1;
            System.out.println("燃料を1消費して走りました。");
        }
        else{
            System.out.println("走れないです。");
        }
    }

    void startEngine(){
        Engine E = new Engine(engine.rpm);

        E.start();

    }

}
