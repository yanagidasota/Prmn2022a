package lecture06;

import java.util.Scanner;

public class Exercise6_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("小数値を入力してください:");
        try {
            float n = input.nextFloat();
        }
        catch (Exception e){
            System.out.println("エラー.");
        }
    }
}
