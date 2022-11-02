package lecture02;

public class Human {
    String name;
    int age;

    Human(String str,int a){
        name = str;
        age = a;
    }

    void print(){

        System.out.println(name+" "+age+"歳です");
    }

    String judge(){

        String str;
        if(age <= 18){
            str = "生徒";
        }
        else if(age <= 22){
            str = "学生";
        }
        else {
            str = "\t";
        }
        return str;
    }

}
