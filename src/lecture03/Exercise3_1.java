package lecture03;

import java.util.Scanner;
public class Exercise3_1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("任意の文字列を入力してください:");
        String str = inp.nextLine();
        System.out.println("”"+str+"”と入力されました");
    }
}
