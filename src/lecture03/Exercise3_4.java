package lecture03;

import java.util.ArrayList;

public class Exercise3_4 {
    public static void main(String[] args) {

        ArrayList<Vegetable> vegetables = new ArrayList<Vegetable>();

        vegetables.add(new Vegetable("にんじん",117));
        vegetables.add(new Vegetable("たまねぎ",120));
        vegetables.add(new Vegetable("じゃがいも",154));

        for(Vegetable vegetable : vegetables) {
            vegetable.print();
        }
    }
}
