package lecture04;

public class Account {
    private String name;
    private String number;
    private long balance;

    public Account(String name,String number){
        this.name = name;
        this.number = number;
        balance = 0;
    }

    public String getName(){
        return name;
    }

    public String getNumber(){
        return number;
    }

    public long getBalance(){
        return balance;
    }

    public void setBalance(long money){
        balance += money;
    }
}
