package lecture01;

public class kadai1_5 {
    public static void main(String[] args) {

        Calcurator cal = new Calcurator();
        int[] score = {41,85,72,38,80};
        String str = "エラー";

        for(int i=0;i<score.length;i++){
            if(score[i]>=90 && score[i]<=100){
                ;str = "秀";
            }
            else if(score[i]>=80){
                str = "優";
            }
            else if (score[i]>=70){
                str = "良";
            }
            else if(score[i]>=60){
                str ="可";
            }
            else if(score[i]>=0) {
                str = "不可";
            }
            System.out.println(i+"番 "+score[i]+"点　"+str);
        }
        System.out.println("最高点:"+cal.max(score));
        System.out.println("最低点"+cal.min(score));
        System.out.println("平均点"+cal.average(score));

    }
}
