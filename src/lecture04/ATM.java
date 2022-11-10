package lecture04;


import java.util.ArrayList;
import java.util.List;

public class ATM {
    private ArrayList<Account> accountList = new ArrayList<Account>();
    public ATM(){
        List<Account> accountList = new ArrayList<Account>();

    }
    public void registerAccount(String name,String number){
        accountList.add(new Account(name, number));
        System.out.println(name+"さんのアカウントを口座番号:"+number+"に登録しました。");
    }
    public boolean exitsAccount(String name,String number){
        for(Account account : accountList){
            if(name == account.name && number == account.number){
                System.out.println("名前:"+name+" 口座番号:"+number+"は存在します。");
                return true;
            }
        }
        System.out.println("名前:"+name+" 口座番号:"+number+"存在しません。");
        return false;
    }
    public void deposit(String number,long money){
        for(Account account : accountList){
            if(number == account.number){
                account.balance += money;
                System.out.println("口座番号:"+account.number+"に"+money+"円入金しました。");
            }
        }
    }
    public long withdraw(String number,long money){
        for(Account account : accountList){
            if(number == account.number) {
                if(account.balance <  money){
                    System.out.println("口座番号:"+number+"から"+money+"円引き出せませんでした。残高:"+account.balance+"円です。");
                } else if (account.balance >= money) {
                    account.balance -= money;
                    System.out.println("口座番号:"+number+"から"+money+"円引き出しました。残高:"+account.balance+"円です。");
                    return  money;
                }
            }
        }
        return 0;
    }
}
