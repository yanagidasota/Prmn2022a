package lecture04;

public class Exercise4_2 {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.exitsAccount("栁田颯太","0130");
        atm.registerAccount("栁田颯太","0130");
        atm.exitsAccount("栁田颯太","0130");
        atm.deposit("0130",10000);
        atm.withdraw("0130",20000);
        atm.withdraw("0130",9500);
    }
}
