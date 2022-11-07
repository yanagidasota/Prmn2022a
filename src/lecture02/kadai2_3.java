package lecture02;

public class kadai2_3 {
    public static void main(String[] args) {

        Tire[] tires = new Tire[4];
        Engine2 E2 = new Engine2(4000);

        for (int j = 0;j<4;j++) {

            tires[j] = new Tire(65);

        }
        Car2 C2 = new Car2(tires,E2);

        GasStation2 G = new GasStation2();

        G.refuel(C2);

        C2.startEngine();

        C2.run();
    }
}
