package lecture02;

public class Car {
    int fuel;

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

}
