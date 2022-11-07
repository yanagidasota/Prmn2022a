package lecture02;

public class Engine2 {
    int rpm;

    Engine2(int rpm){
        this.rpm = rpm;
    }

    void start(){
        System.out.println(rpm+"でエンジンを始動させました");
    }
}
