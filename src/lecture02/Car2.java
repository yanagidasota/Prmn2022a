package lecture02;

public class Car2 {
    int fuel;
    Tire[] tires;
    Engine2 engine;

    Car2(Tire[] tires,Engine2 engine){
        fuel = 0;
        this.tires = tires;
        this.engine = engine;
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


        Engine2 E = new Engine2(engine.rpm);

        E.start();

    }

}

