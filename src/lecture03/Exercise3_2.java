package lecture03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("何行分入力しますか？");
        int n = input.nextInt();
        String s = input.nextLine();

        ArrayList<String> strs = new ArrayList<>();
        for(int i = 1;i < n+1;i++) {
            System.out.println(i+"行目:");
            String str = input.next();
            strs.add(new String(str));
        }

        int j=0;
        for(String str : strs){
            System.out.println("["+j+"]"+str);
            j += 1;
        }

    }
}
