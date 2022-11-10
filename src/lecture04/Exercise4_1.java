package lecture04;

public class Exercise4_1 {
    public static void main(String[] args) {
        Fighter f1 = new Fighter(100,200,"Fighter1");
        Fighter f2 = new Fighter(1000,20,"Boss");

        while(true){

            System.out.println(f1.getName()+"の残り hitPoint"+f1.getHitPoint());
            if (f1.isAlive()){

                System.out.print(f1.getName()+"は"+f2.getName()+"に");
                f1.attack(f2);

            }
            else{
                System.out.println(f1.getName()+"は倒れた。");
                break;
            }

            System.out.println(f2.getName()+"の残り hitPoint"+f2.getHitPoint());
            if(f2.isAlive()) {

                System.out.print(f2.getName() + "は" + f1.getName() + "に");
                f2.attack(f1);

            }
            else{
                System.out.println(f2.getName()+"は倒れた。");
                break;
            }



        }
    }
}
