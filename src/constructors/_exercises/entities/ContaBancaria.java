package constructors._exercises.entities;

public class ContaBancaria {

    private int number;
    private String holder;
    private double balance;


    public ContaBancaria(int numeber, String holder) {
        this.number = numeber;
        this.holder = holder;
    }

    public ContaBancaria(int numeber, String holder, double initialBalance) {
        this.number = numeber;
        this.holder = holder;
         balance = initialBalance;
    }

    public void deposit(double amount){
        balance= balance+amount;
    }

    public  void withdraw(double amount){
        if (balance<=0 || balance<amount){
            System.out.println("Insufficient balance, your balance is: "+balance);
        }else{
            balance= (balance-amount)-5;
        }
    }


    public int getNumeber() {
        return number;
    }

    public void setNumeber(int numeber) {
        this.number = numeber;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString(){
        return "Account "+number
                +", Holder: "+holder
                +", Balance: $"+balance;

    }

}
