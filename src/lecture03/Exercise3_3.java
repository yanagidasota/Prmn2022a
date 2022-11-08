package lecture03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> strs = new ArrayList<>();

        for (int i = 0;i < 2; i++) {
            System.out.println((i+1)+"つ目の整数を入力してください:");
            strs.add(new String(input.nextLine()));
        }

        int[] a = new int[2];
        int i = 0;
        for(String str : strs) {
            a[i] = Integer.parseInt(str);
            i += 1;
        }
        int sum = a[0] + a[1];
        System.out.println(a[0]+" + "+a[1]+" = "+sum);
    }
}
