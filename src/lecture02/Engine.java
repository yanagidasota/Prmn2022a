package lecture02;

public class Engine {
    int rpm;

    Engine(int rpm){
        rpm = 0;
    }

    void start(){
        System.out.println(rpm+"エンジンを始動させました");
    }

}
