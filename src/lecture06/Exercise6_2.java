package lecture06;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Exercise6_2 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 5 ;i++) {
            integers.add(random.nextInt(6) + 1);
        }
        System.out.println("さいころを５つ振りました。");
        System.out.println("何番目のさいころの値を確認しますか?");
        try{
            int n = input.nextInt();
            System.out.println(integers.get(n-1));
        }
        catch (ClassCastException e) {
            System.out.println("なんかやばい");
        }
        catch (InputMismatchException e) {
            System.out.println("整数以外の値が入力されました。");
            System.out.println("プログラムを終了します。");
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("ArrayListの範囲外アクセスを確認しました。");
            System.out.println("プログラムを終了します。");
        }
        catch (NullPointerException e){
            System.out.println("変数に値が入っていませんでした。");
            System.out.println("プログラムを終了します。");
        }
    }
}
