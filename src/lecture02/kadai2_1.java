package lecture02;

import java.util.Scanner;

public class kadai2_1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("年齢");
        int age = inp.nextInt();
        System.out.println("名前");
        String name= inp.next();

        Human h = new Human(name,age);

        System.out.print(h.judge()+":");
        h.print();

    }
}
