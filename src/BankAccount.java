public class BankAccount {
    private int id;
    private double balance;


    BankAccount(int id){
        this.id = id;
        this.balance = 0;
    }

    BankAccount(int id, double balance){
        this.id = id;
        this.balance = balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    void withdraw(double money){
        if(money < this.balance){

            this.balance -= money;
        }
    }

    void deposit(double amount){
        double newBalance = getBalance() + amount;
        setBalance(newBalance);
    }
}
