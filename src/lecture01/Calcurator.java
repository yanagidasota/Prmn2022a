package lecture01;

public class Calcurator {

    int min(int[] a){
        int min = a[0];
        for(int i=0;i<a.length;i++){
            if(a[i] <= min){
                min = a[i];
            }
        }
        return min;
    }

    int max(int[] a){
        int max = a[0];
        for(int i=0;i<a.length;i++){
            if(a[i] >= max){
                max = a[i];
            }
        }
        return max;
    }

    double average(int[] a){
        int sum = 0;
        double ave;
        for(int i=0;i<a.length;i++){
            sum = sum + a[i];
        }
        ave = (double)sum/a.length;
        return ave;
    }
}
